package in.codegram.ppmapi.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.ppmapi.domain.Backlog;
import in.codegram.ppmapi.domain.Project;
import in.codegram.ppmapi.exception.ProjectIdException;
import in.codegram.ppmapi.repository.BacklogRepository;
import in.codegram.ppmapi.repository.ProjectRepository;
import in.codegram.ppmapi.service.ProjectService;
import in.codegram.ppmapi.web.ProjectController;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	Logger logger =LoggerFactory.getLogger(ProjectServiceImpl.class);
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private BacklogRepository backlogRepository;

	@Override
	public Project saveOrUpdate(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			// When project is getting created first time, then backlog should be created along with that. 
			if(project.getId()==null) {
				Backlog backlog=new Backlog();
				project.setBacklog(backlog); // one to one with backlog
				backlog.setProject(project); // one to one with project
				backlog.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());				
				
			}			
			// in case of updating of project backlog should not be null, same projectIdentifier should be set in the backlog
			if(project.getId()!=null) {
				project.setBacklog(backlogRepository.findByProjectIdentifier(project.getProjectIdentifier().toUpperCase()));
			}
			return projectRepository.save(project);
		}catch(Exception ex) {
			throw new ProjectIdException("project id "+project.getProjectIdentifier().toUpperCase()+" is already available");
		}
		
	}

	@Override
	public Project findByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		logger.info("--ProjectServiceImpl:PROJECT--"+project);
		if(project==null) {
			throw new ProjectIdException("project id "+projectIdentifier.toUpperCase()+" is not available");
		}
	
		return project;
	}

	@Override
	public void deleteProjectByProjectIdentifier(String projectIdentifier) {
		Project project =  projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project==null) {
			throw new ProjectIdException("can not delete project with project id "+projectIdentifier.toUpperCase()+". This id does not exist.");
		}
		projectRepository.delete(project);
		
	}

	@Override
	public Iterable<Project> fillAllProjects() {
		
		return projectRepository.findAll();
	}

}
