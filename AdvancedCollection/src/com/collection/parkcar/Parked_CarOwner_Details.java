package com.collection.parkcar;

public class Parked_CarOwner_Details {

	private String ownerName;
	private String carModel;
	private long carNo;
	private long ownerMobileNo;
	private String ownerAddress;
	private int token;
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public long getCarNo() {
		return carNo;
	}
	
	public void setCarNo(long carNo) {
		this.carNo = carNo;
	}
	
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	
	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	
	public String getOwnerAddress() {
		return ownerAddress;
	}
	
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public Parked_CarOwner_Details(String ownerName, String carModel, long carNo, long ownerMobileNo, String ownerAddress) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	
	@Override
	public String toString() {
		return "Parked_CarOwner_details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

}
