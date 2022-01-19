package com.neosoft.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

import com.neosoft.Model.Project;
import com.neosoft.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> getAllProjectsDetails(){
		return projectService.getAllProject();
	}
	
	@PostMapping("/student/{id}/addProject")
	public void addProjectDetails(@PathVariable Long id,@RequestBody Project project) {
		projectService.addProject(id, project);
	}

}
