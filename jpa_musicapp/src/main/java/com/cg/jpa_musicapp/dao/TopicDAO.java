package com.cg.jpa_musicapp.dao;

import java.util.List;

import com.cg.jpa_musicapp.domain.Topic;

public interface TopicDAO {
	public void save(Topic topic);

	public void update(Topic topic);

	public void delete(Topic topic);

	public void delete(Integer topicId);

	public Topic findById(Integer topicId);

	public List<Topic> findAll();

	public List<Topic> findByProperty(String propName, Object propValue);
}
