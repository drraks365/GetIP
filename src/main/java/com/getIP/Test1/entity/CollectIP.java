package com.getIP.Test1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "all_IP")
public class CollectIP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Internal_IP")
	private String intIPs;
	@Column(name = "External_IP")
	private String extIPs;
	public Long getId() {
		return id;
	}
	public CollectIP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollectIP(Long id, String intIPs, String extIPs) {
		super();
		this.intIPs = intIPs;
		this.extIPs = extIPs;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntIPs() {
		return intIPs;
	}
	public void setIntIPs(String intIPs) {
		this.intIPs = intIPs;
	}
	public String getExtIPs() {
		return extIPs;
	}
	public void setExtIPs(String extIPs) {
		this.extIPs = extIPs;
	}
	@Override
	public String toString() {
		return "CollectIP [id=" + id + ", intIPs=" + intIPs + ", extIPs=" + extIPs + "]";
	}
}
