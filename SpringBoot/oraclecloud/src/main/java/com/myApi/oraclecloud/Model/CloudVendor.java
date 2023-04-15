package com.myApi.oraclecloud.Model;

public class CloudVendor {

	private String VendorId;
	private String VendorName;
	private String VendorAddress;
	private String VendorPhoneNumber;
	
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		VendorId = vendorId;
		VendorName = vendorName;
		VendorAddress = vendorAddress;
		VendorPhoneNumber = vendorPhoneNumber;
	}
	
	public CloudVendor() {
		super();
	}



	public String getVendorId() {
		return VendorId;
	}
	public void setVendorId(String vendorId) {
		VendorId = vendorId;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getVendorAddress() {
		return VendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		VendorAddress = vendorAddress;
	}
	public String getVendorPhoneNumber() {
		return VendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		VendorPhoneNumber = vendorPhoneNumber;
	}
	
}
