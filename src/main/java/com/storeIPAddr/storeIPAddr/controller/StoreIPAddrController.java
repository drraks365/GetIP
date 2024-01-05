package com.storeIPAddr.storeIPAddr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storeIPAddr.storeIPAddr.Entity.StoreIPAddr;
import com.storeIPAddr.storeIPAddr.repository.StoreIPAddrRepository;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StoreIPAddrController {
	
	private final StoreIPAddrRepository storeIPAddrRepository;
	
	@Autowired
	public StoreIPAddrController(StoreIPAddrRepository storeIPAddrRepository) {
		this.storeIPAddrRepository = storeIPAddrRepository;
	}
	
	@GetMapping("/getBothIPs")
	public List<StoreIPAddr> getBothIPs(){
		List<StoreIPAddr> retrieveBothIPs = storeIPAddrRepository.findAll();
		return retrieveBothIPs;
	}
	
	@PostMapping("/saveBothIPs")
	public List<StoreIPAddr> saveIPAddr(HttpServletRequest request) {
		String client_IP = request.getHeader("X-Forwarded-For");
		if (client_IP == null || client_IP.isEmpty() || "unknown".equalsIgnoreCase(client_IP)) {
            client_IP = request.getRemoteAddr(); // If X-Forwarded-For not present, get from remote address
        }
		String server_IP = request.getLocalAddr();
		StoreIPAddr storeIPAddr = new StoreIPAddr();
        storeIPAddr.setClient_IP(client_IP);
        storeIPAddr.setServer_IP(server_IP);
        storeIPAddrRepository.save(storeIPAddr);
		return null;
	}
}
