package com.cg.jpa_musicapp.domain;
/**
 * This class will be used as a model class. It will be annotated with
 * appropriate annotations, and will be used as data traveler object among
 * layers.
 * 
 * @author pankaj
 *
 */
public class Section {
	/**
	 * id of the section, PK
	 */
	private Integer id;
	/**
	 * course id of the Course, FK
	 */
	private Integer courseId;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
