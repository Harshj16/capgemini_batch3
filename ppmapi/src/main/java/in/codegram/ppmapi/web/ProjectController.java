package in.codegram.ppmapi.web;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.ppmapi.domain.Project;
import in.codegram.ppmapi.service.ProjectService;
import in.codegram.ppmapi.serviceimpl.MapValidationErrorService;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	
	Logger logger =LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@ApiOperation(value = "Create new Project based of provided json")
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result) {
		
		ResponseEntity <?> errorMap =mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		
		Project savedProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(savedProject, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{projectId}")
	public ResponseEntity<?> getProjectByProjectIdentifier(@PathVariable String projectId){
		Project project = projectService.findByProjectIdentifier(projectId);
		logger.info("--PROJECT--"+project);
		return new ResponseEntity<Project>(project, HttpStatus.OK);
	}
	
	@DeleteMapping("/{projectId}")
	public ResponseEntity<?> deleteProject(@PathVariable String projectId){
		projectService.deleteProjectByProjectIdentifier(projectId);
		return new ResponseEntity<String>("Project with Id : '"+projectId.toUpperCase()+"' was deleted",HttpStatus.OK);
		
	}
	@GetMapping("/all")
	public Iterable<Project> getAllProjects(){
		return projectService.fillAllProjects();
	}

}
