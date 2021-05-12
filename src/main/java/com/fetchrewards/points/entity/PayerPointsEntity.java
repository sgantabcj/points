package com.fetchrewards.points.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class PayerPointsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long payerPointsId;

	private String payer;

	private Long points;

	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionDate;

	private Date createdDate;

	private Date modifiedDate;

	public Long getPayerPointsId() {
		return payerPointsId;
	}

	public void setPayerPointsId(Long payerPointsId) {
		this.payerPointsId = payerPointsId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
