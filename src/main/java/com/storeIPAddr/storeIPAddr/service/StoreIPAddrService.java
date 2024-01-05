package com.storeIPAddr.storeIPAddr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeIPAddr.storeIPAddr.Entity.StoreIPAddr;
import com.storeIPAddr.storeIPAddr.repository.StoreIPAddrRepository;

@Service
public class StoreIPAddrService {
	private final StoreIPAddrRepository storeIPAddrRepository;
	
	@Autowired
	public StoreIPAddrService(StoreIPAddrRepository storeIPAddrRepository) {
		this.storeIPAddrRepository = storeIPAddrRepository;
	}
	
	public void insertIPAddr(String server_IP, String client_IP) {
		StoreIPAddr storeIPAddr = new StoreIPAddr();
		storeIPAddr.setServer_IP(server_IP);
		storeIPAddr.setClient_IP(client_IP);
	}
}
