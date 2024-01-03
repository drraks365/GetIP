package com.getIP.Test1.controller;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.getIP.Test1.entity.CollectIP;
import com.getIP.Test1.repository.CollectIPRepository;

@RestController
public class CollectIPController {
	
	@Autowired
	CollectIPRepository repo;
	
	@GetMapping("/getBothIPs")
	public List<CollectIP> getBothIPs(){
		List<CollectIP> retrieveBothIPs = repo.findAll();
		return retrieveBothIPs;
	}
	
	@PostMapping("/saveBothIPs")
	public List<CollectIP> saveBothIPs(){
		try {
			InetAddress externalIPAddress = InetAddress.getLocalHost();
			String extIPs = externalIPAddress.getHostAddress();
			
			InetAddress internalIPAddress = InetAddress.getLoopbackAddress();
            String intIPs = internalIPAddress.getHostAddress();
            
            CollectIP collectIP = new CollectIP();
            collectIP.setExtIPs(extIPs);
            collectIP.setIntIPs(intIPs);
            
            repo.save(collectIP);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
