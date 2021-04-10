package com.cg.jpa_musicapp.domain;

/**
 * This class will be used as a model class. It will be annotated with
 * appropriate annotations, and will be used as data traveler object among
 * layers.
 * 
 * @author pankaj
 *
 */
public class Category {
	/**
	 * id will be primary key
	 */
	private Integer id;
	/**
	 * userId of the User, who will be creating the category
	 */
	private Integer userId;
	private String title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
