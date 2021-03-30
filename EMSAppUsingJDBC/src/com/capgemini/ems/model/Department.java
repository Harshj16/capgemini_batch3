package com.capgemini.ems.model;

/**
 * This Department model is used as data traveller object between layers. 
 * @author panka
 *
 */
public class Department {
	
	/**
	 * id of the department
	 */
	private Long id;
	/**
	 * Name of the department
	 */
	private String name;
	/**
	 * Short description of the department
	 */
	private String shortDescription;
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
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", shortDescription=" + shortDescription + "]";
	}
	
	

}
