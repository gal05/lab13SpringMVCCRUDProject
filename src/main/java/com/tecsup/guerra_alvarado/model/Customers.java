package com.tecsup.guerra_alvarado.model;

public class Customers {

	private int id;
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String address;
	private String city;
	
	
	public Customers() {
		super();
	}





	public Customers(int id, String companyName, String contactName, String contactTitle, String address, String city) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
		this.address = address;
		this.city = city;
	}





	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getContactTitle() {
		return contactTitle;
	}


	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	@Override
	public String toString() {
		return "Customers [id=" + id + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + ", address=" + address + ", city=" + city + "]";
	}






	
	
	
}
