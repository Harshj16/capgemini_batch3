package in.codegram.ppmapi.service;

import in.codegram.ppmapi.domain.ProjectTask;

public interface ProjectTaskService {
	
	public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask);
	public Iterable<ProjectTask> findBacklogById(String projectIdentifier);
	public ProjectTask findPTByProjectSequence(String backlog_id,String pt_id);
	public ProjectTask updateByProjectSequence(ProjectTask updatedTask, String backlog_id, String pt_id);
	public void deletePTByProjectSequence(String backlog_id, String pt_id);

}
