package in.codegram.ppmapi.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.ppmapi.domain.Backlog;
import in.codegram.ppmapi.domain.Project;
import in.codegram.ppmapi.domain.ProjectTask;
import in.codegram.ppmapi.exception.ProjectNotFoundException;
import in.codegram.ppmapi.repository.BacklogRepository;
import in.codegram.ppmapi.repository.ProjectRepository;
import in.codegram.ppmapi.repository.ProjectTaskRepository;
import in.codegram.ppmapi.service.ProjectTaskService;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {
	Logger logger =LoggerFactory.getLogger(ProjectServiceImpl.class);
	@Autowired
	private BacklogRepository backlogRepository;
	@Autowired
	private ProjectTaskRepository projectTaskRepository;
	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask) {
		try {
			//ProjectTasks to be added to specific project, project!=null, Backlog Exists
			Backlog backlog = backlogRepository.findByProjectIdentifier(projectIdentifier);
			logger.info("--ProjectTaskServiceImpl--"+backlog);
			//Set the Backlog to project task
			projectTask.setBacklog(backlog);
			
			//We want our project Sequence to be like this. IDPRO-1 IDPRO-2 ...100 101

			Integer backLogSequence = backlog.getPTSequence();
			//Update the BacklogSequence
			backLogSequence++;
			backlog.setPTSequence(backLogSequence);
			
			//Add backlogSequence to ProjectTask
			projectTask.setProjectSequence(projectIdentifier+"-"+backLogSequence);
			projectTask.setProjectIdentifier(projectIdentifier);
			//Initial priority when priority is null
			if(projectTask.getPriority()==null) {
				projectTask.setPriority(3);
			}
			//INITIAL Status when status is null
			if(projectTask.getStatus()=="" ||projectTask.getStatus()==null ) {
				projectTask.setStatus("TO_DO");
			}

			return projectTaskRepository.save(projectTask);
		}catch(Exception e) {
			throw new ProjectNotFoundException("Project Not Found");
		}
	}

	@Override
	public Iterable<ProjectTask> findBacklogById(String projectIdentifier) {
		Project project =projectRepository.findByProjectIdentifier(projectIdentifier);
		if(project==null) {
			throw new ProjectNotFoundException("Project Not Found");
		}
		return projectTaskRepository.findByProjectIdentifierOrderByPriority(projectIdentifier);
	}

	@Override
	public ProjectTask findPTByProjectSequence(String backlog_id, String pt_id) {
		// Make sure that backlog_id exist
		Backlog backlog =  backlogRepository.findByProjectIdentifier(backlog_id);
		if(backlog==null) {
			throw new ProjectNotFoundException("Project with id : '"+backlog_id+"' does not exist");
		}
		// Make sure that project task id exist
		ProjectTask projectTask =  projectTaskRepository.findByProjectSequence(pt_id);
		if(projectTask==null) {
			throw new ProjectNotFoundException("Project task with id : '"+pt_id+"' does not exist");
			
		}
		// Make sure that backlog_id and projectIdentifier is same
		if(!projectTask.getProjectIdentifier().equals(backlog_id)) {
			throw new ProjectNotFoundException("Backlog id : '"+backlog_id+"' does not match with project identifier '"+projectTask.getProjectIdentifier()+"'");
		}
		return projectTask;
	}

	@Override
	public ProjectTask updateByProjectSequence(ProjectTask updatedTask, String backlog_id, String pt_id) {
		//Find the existing project task
		ProjectTask projectTask = findPTByProjectSequence(backlog_id, pt_id);
		
		// Replace projectTask with updatedTask
		projectTask =  updatedTask; // object cloning - patching
		// save the projectTask
		
		return projectTaskRepository.save(projectTask);
	}

	@Override
	public void deletePTByProjectSequence(String backlog_id, String pt_id) {
		ProjectTask projectTask = findPTByProjectSequence(backlog_id, pt_id);
		Backlog backlog =  projectTask.getBacklog();
		List<ProjectTask> pts =  backlog.getProjectTasks();
		pts.remove(projectTask);
		backlogRepository.save(backlog);
		projectTaskRepository.delete(projectTask);
		
	}

}
