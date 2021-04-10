package com.cg.jpa_musicapp.dao;

import java.util.List;

import com.cg.jpa_musicapp.domain.Category;

public interface CategoryDAO {
	public void save(Category category);

	public void update(Category category);

	public void delete(Category category);

	public void delete(Integer categoryId);

	public Category findById(Integer categoryId);

	public List<Category> findAll();

	public List<Category> findByProperty(String propName, Object propValue);
}
