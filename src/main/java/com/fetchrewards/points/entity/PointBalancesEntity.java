package com.fetchrewards.points.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PointBalancesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long balanceId;
	
	private String payer;
	
	private Long balance;
	
	private Date createdDate;
	
	private Date modifiedDate;

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getId() {
		return balanceId;
	}

	public void setId(Long id) {
		this.balanceId = id;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public Long getBalance() {
		return balance;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
}
