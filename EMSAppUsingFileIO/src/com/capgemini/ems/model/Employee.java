package com.capgemini.ems.model;

import java.io.Serializable;

/**
 * This Employee model is used as data transfer object between layers.
 * 
 * @author panka
 *
 */
public class Employee implements Serializable{

	/**
	 * id of the Employee
	 */
	private Long id;
	/**
	 * Name of the Employee
	 */
	private String name;
	/**
	 * Contact of the Employee
	 */
	private String contact;
	/**
	 * Email of the Employee
	 */
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
	
	

}
