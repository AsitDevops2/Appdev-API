package com.raley.model;

/**
 * @author abhay.thakur
 *
 */
public class AuthToken {

	private String token;
	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private int pin;
	private String country;
	private String state;
	private String city;
	private String dept;
	private String addrLand1;
	private String addrLand2;

	public AuthToken() {

	}

	public AuthToken(String token, int id, String email, long mobileNo, String firstName, String lastName, int pin,
			String country, String state, String city, String dept, String addrLand1, String addrLand2) {
		this.token = token;
		this.id = id;
		this.email = email;
		this.mobileNo = mobileNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
		this.country = country;
		this.state = state;
		this.city = city;
		this.dept = dept;
		this.addrLand1 = addrLand1;
		this.addrLand2 = addrLand2;
	}

	public AuthToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddrLand1() {
		return addrLand1;
	}

	public void setAddrLand1(String addrLand1) {
		this.addrLand1 = addrLand1;
	}

	public String getAddrLand2() {
		return addrLand2;
	}

	public void setAddrLand2(String addrLand2) {
		this.addrLand2 = addrLand2;
	}

}
