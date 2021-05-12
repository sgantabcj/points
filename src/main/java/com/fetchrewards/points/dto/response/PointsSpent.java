package com.fetchrewards.points.dto.response;

public class PointsSpent {
	
	private String payer;

	private Long points;

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

}
