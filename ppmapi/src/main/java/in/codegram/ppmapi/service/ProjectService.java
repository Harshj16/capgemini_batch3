package in.codegram.ppmapi.service;

import in.codegram.ppmapi.domain.Project;

public interface ProjectService {
	
	public Project saveOrUpdate(Project project);
	Project findByProjectIdentifier(String projectIdentifier);
	public void deleteProjectByProjectIdentifier(String projectIdentifier);
	public Iterable<Project> fillAllProjects();

}
