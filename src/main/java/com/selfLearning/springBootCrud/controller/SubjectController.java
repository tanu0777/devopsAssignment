package com.selfLearning.springBootCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.selfLearning.springBootCrud.entity.Subject;
import com.selfLearning.springBootCrud.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	public SubjectService subjectService;

	@GetMapping("")
	public String getWelcomeMessage() {
		return "Welcome to the Spring Boot Application. \n"
				+ "The application performs CRUD operations on subject entity \n";
	}

	@GetMapping("/subjects")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}

	@PostMapping("/subject")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}

	@PutMapping("/subject/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
		subjectService.updateSubject(id, subject);
	}

	@DeleteMapping("/subject/{id}")
	public void deleteSubject(@PathVariable String id) {
		subjectService.deleteSubject(id);
	}

	@GetMapping("/subject/{id}")
	public Optional<Subject> getSubjectById(@PathVariable String id) {
		return subjectService.getSubjectById(id);
	}

}
