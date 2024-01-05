package com.storeIPAddr.storeIPAddr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Store_IP")
public class StoreIPAddr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Server_IP")
	private String server_IP;
	@Column(name = "Client_IP")
	private String client_IP;
	public StoreIPAddr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreIPAddr(String server_IP, String client_IP) {
		super();
		this.server_IP = server_IP;
		this.client_IP = client_IP;
	}
	public String getServer_IP() {
		return server_IP;
	}
	public void setServer_IP(String server_IP) {
		this.server_IP = server_IP;
	}
	public String getClient_IP() {
		return client_IP;
	}
	public void setClient_IP(String client_IP) {
		this.client_IP = client_IP;
	}
	@Override
	public String toString() {
		return "StoreIPAddr [server_IP=" + server_IP + ", client_IP=" + client_IP + "]";
	}
}
