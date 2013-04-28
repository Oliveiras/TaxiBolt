package com.rhcloud.oliveirasapps.taxibolt.model;

public interface TaxiDriverPublic {

	public abstract Long getId();

	public abstract void setId(Long id);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getMobileNumber();

	public abstract void setMobileNumber(String mobileNumber);

	public abstract String getTaxiCompany();

	public abstract void setTaxiCompany(String taxiCompany);

	public abstract String getLicensePlate();

	public abstract void setLicensePlate(String licensePlate);

	public abstract Double getLatitude();

	public abstract void setLatitude(Double latitude);

	public abstract Double getLongitude();

	public abstract void setLongitude(Double longitude);

	public abstract boolean getAvailable();

	public abstract void setAvailable(boolean available);

}