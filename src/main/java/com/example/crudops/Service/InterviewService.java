package com.example.crudops.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudops.Model.InterviewScheduling;
import com.example.crudops.Repository.InterviewRepository;

@Service
public class InterviewService {
	@Autowired
	InterviewRepository interviewrepo;

	public InterviewScheduling save(InterviewScheduling interview) {
		// TODO Auto-generated method stub
		return interviewrepo.save(interview) ;
	}

	public List<InterviewScheduling> getall() {
		// TODO Auto-generated method stub
		return interviewrepo.findAll() ;
	}

	public Optional<InterviewScheduling> fectchbyid(int id) {
		// TODO Auto-generated method stub
		return interviewrepo.findById(id) ;
	}

	public void deletebyid(int id) {
		// TODO Auto-generated method stub
		interviewrepo.deleteById(id);
	}

}
