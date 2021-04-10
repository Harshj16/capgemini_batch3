package com.cg.jpa_musicapp.domain;

/**
 * This class will be used as a model class. It will be annotated with
 * appropriate annotations, and will be used as data traveler object among
 * layers.
 * 
 * @author pankaj
 *
 */
public class Topic {
	private Integer id;
	private Integer sectionId;
	private String name;
	private double durationInMinutes;
	private String fileUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDurationInMinutes() {
		return durationInMinutes;
	}
	public void setDurationInMinutes(double durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
	
	

}
