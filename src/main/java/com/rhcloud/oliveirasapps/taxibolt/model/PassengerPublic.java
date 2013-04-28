package com.rhcloud.oliveirasapps.taxibolt.model;

import java.util.Date;

public interface PassengerPublic {

	public abstract Long getId();

	public abstract void setId(Long id);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getMobileNumber();

	public abstract void setMobileNumber(String mobileNumber);

	public abstract Date getBirthdate();

	public abstract void setBirthdate(Date birthdate);

	public abstract String getEmail();

	public abstract void setEmail(String email);

	public abstract Double getLatitude();

	public abstract void setLatitude(Double latitude);

	public abstract Double getLongitude();

	public abstract void setLongitude(Double longitude);

}