package com.nazir.crm.dto;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;
@Data
public class ClientDto {
	
	@CsvBindByName
	private String name;
	@CsvBindByName
	private String status;
	@CsvBindByName
	private String nip; 
	
	@CsvBindByName
	private String contactFirstname;
	@CsvBindByName
	private String contactLastname;
	@CsvBindByName
	private String contactEmail;
	@CsvBindByName
	private String contactPhone;
	
	@CsvBindByName
	private String country;
	@CsvBindByName
	private String region;
	@CsvBindByName
	private String city;
	@CsvBindByName
	private String street;
	@CsvBindByName
	private String postcode;
	
	@CsvBindByName
	private String userEmail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getContactFirstname() {
		return contactFirstname;
	}

	public void setContactFirstname(String contactFirstname) {
		this.contactFirstname = contactFirstname;
	}

	public String getContactLastname() {
		return contactLastname;
	}

	public void setContactLastname(String contactLastname) {
		this.contactLastname = contactLastname;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	

}
