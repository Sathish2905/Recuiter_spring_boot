package com.example.crudops.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Service.JobService;

@RestController
public class JobController {
	@Autowired
	JobService jobservice;

	@GetMapping("/getalljobs")
	public List<Jobs> getalljobs() {
		return jobservice.getalljobs();
	}

	@GetMapping("/getbyparticularjob/{id}")
	public Optional<Jobs> getbyjob(@PathVariable int id) {
		return jobservice.getbyjob(id);
	}

	@PutMapping("/updatejob/{id}")
	public Jobs update(@PathVariable int id, @RequestBody Jobs jobs) {
		Optional<Jobs> j = jobservice.getbyjob(id);
		Jobs jo = j.get();
		return jobservice.update(jo);
	}

	@DeleteMapping("/deletebyid/{id}")
	public void jobdeleteid(@PathVariable int id) {
		jobservice.jobdeleteid(id);
	}

}
