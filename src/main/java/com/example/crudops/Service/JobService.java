package com.example.crudops.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Repository.JobsRepository;

@Service
public class JobService {
	@Autowired
	JobsRepository jobsrepo;

	public List<Jobs> getalljobs() {
		// TODO Auto-generated method stub
		return jobsrepo.findAll() ;
	}

	public Optional<Jobs> getbyjob(int id) {
		// TODO Auto-generated method stub
		return jobsrepo.findById(id);
	}

	public Jobs update(Jobs jo) {
		// TODO Auto-generated method stub
		return jobsrepo.save(jo) ;
	}

	public void jobdeleteid(int id) {
		// TODO Auto-generated method stub
		jobsrepo.deleteById(id);
	}

}
