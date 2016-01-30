package com;

public class Loan {
	private String posKey;
	private Double exposure;

	public Loan(String posKey, Double exposure) {
		super();
		this.posKey = posKey;
		this.exposure = exposure;
	}

	public String getPosKey() {
		return posKey;
	}

	public void setPosKey(String posKey) {
		this.posKey = posKey;
	}

	public Double getExposure() {
		return exposure;
	}

	public void setExposure(Double exposure) {
		this.exposure = exposure;
	}

}
