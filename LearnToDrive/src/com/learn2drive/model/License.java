package com.learn2drive.model;

import java.util.Date;

public class License {
	private  String license_no,issuingRTO;
	private Date expiryDate;
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	public String getIssuingRTO() {
		return issuingRTO;
	}
	public void setIssuingRTO(String issuingRTO) {
		this.issuingRTO = issuingRTO;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
