package com.fetchrewards.points.dto.request;

import java.security.Timestamp;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddPoints {

	private String payer;

	private Long points;

	@JsonProperty("timestamp")
	private Date transactionDate;

	public String getPayer() {
		return payer;
	}

	public Long getPoints() {
		return points;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

}
