package com.cg.jpa_musicapp.dao;

import java.util.List;

import com.cg.jpa_musicapp.domain.Course;

public interface CourseDAO {
	public void save(Course course);

	public void update(Course course);

	public void delete(Course course);

	public void delete(Integer courseId);

	public Course findById(Integer courseId);

	public List<Course> findAll();

	public List<Course> findByProperty(String propName, Object propValue);
}
