package com.example.crudops.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudops.Model.InterviewScheduling;
import com.example.crudops.Service.InterviewService;

@RestController
public class InterviewController {
	@Autowired
	InterviewService interviewService;

	@PostMapping("/post")
	public InterviewScheduling save(@RequestBody InterviewScheduling interview) {
		return interviewService.save(interview);
	}

	@GetMapping("/getAllInterviewScheuduling")
	public List<InterviewScheduling> getall() {
		return interviewService.getall();
	}

	@GetMapping("/getInterviewScheduling/{id}")
	public Optional<InterviewScheduling> fectchbyid(@PathVariable int id) {
		return interviewService.fectchbyid(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public void deletebyid(@PathVariable int id) {
		interviewService.deletebyid(id);
	}

}
