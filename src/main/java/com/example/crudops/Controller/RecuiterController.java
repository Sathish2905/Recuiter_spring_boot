package com.example.crudops.Controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Model.Recuiter;
import com.example.crudops.Service.RecuiterService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class RecuiterController {

	@Autowired
	RecuiterService recuiterservice;

	@PostMapping("/upload")
	public ResponseEntity<String> file(@RequestParam("company_Logo") MultipartFile company_Logo,
			@RequestParam("recuiters") String recuiters, @RequestParam("job") String job) throws IOException {
		Recuiter recuit = new ObjectMapper().readValue(recuiters, Recuiter.class);
		Jobs jo = new ObjectMapper().readValue(job, Jobs.class);
//		recuit.setCompanyLogo(company_Logo.getBytes());
//		recuit.getJob().add(jo);
		recuiterservice.file(recuit);
		recuiterservice.file(jo);
		return ResponseEntity.ok().body("suucess");

	}

	@GetMapping("/getall")
	public List<Recuiter> getallrecuiter() {
		return recuiterservice.getallrecuiter();

	}

	@GetMapping("/getbyparticularrecuiter/{id}")
	public Optional<Recuiter> fetchbyid(@PathVariable int id) {
		return recuiterservice.fetchbyid(id);

	}

	@PutMapping("/update/{id}")
	public Recuiter upadte(@PathVariable int id, @RequestBody Recuiter recuiter) {
		Optional<Recuiter> re = recuiterservice.fetchbyid(id);
		return recuiterservice.upadte(recuiter);

	}

	@DeleteMapping("/deletebyparticularrecuiter/{id}")
	public void recuiterdeletebyid(@PathVariable int id) {
		recuiterservice.recuiterdeletebyid(id);
	}

	@DeleteMapping("/deleteall")
	public void deleteall() {
		recuiterservice.deleteall();
	}

}
