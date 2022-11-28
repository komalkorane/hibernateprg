package com.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ADDRESS_INFO")
public class Address {

	@Id
	private int pin;
	@Column(name="CITY_NAME")
	private String city;
	private String state;
	public Address() {
		super();
	}
	public Address(int pin, String city, String state) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
