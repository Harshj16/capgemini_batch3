package com.cg.jpa_musicapp.dao;

import java.util.List;

import com.cg.jpa_musicapp.domain.Section;

public interface SectionDAO {
	public void save(Section section);

	public void update(Section section);

	public void delete(Section section);

	public void delete(Integer sectionId);

	public Section findById(Integer sectionId);

	public List<Section> findAll();

	public List<Section> findByProperty(String propName, Object propValue);
}
