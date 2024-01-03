package com.getIP.Test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getIP.Test1.entity.CollectIP;

public interface CollectIPRepository extends JpaRepository<CollectIP, Long> {
	
}
