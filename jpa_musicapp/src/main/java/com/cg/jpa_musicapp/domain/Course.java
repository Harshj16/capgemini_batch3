package com.cg.jpa_musicapp.domain;

/**
 * This class will be used as a model class. It will be annotated with
 * appropriate annotations, and will be used as data traveler object among
 * layers.
 * 
 * @author pankaj
 *
 */
public class Course {

	/**
	 * id of the Course, PK
	 */
	private Integer id;
	
	/**
	 * category id of the Category, FK
	 */
	private Integer categoryId;
	private String name;
	private String duration;
	private String shortDescription;
	private double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
