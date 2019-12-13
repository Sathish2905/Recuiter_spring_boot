package com.example.crudops.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Model.Recuiter;
import com.example.crudops.Repository.JobsRepository;
import com.example.crudops.Repository.RecuiterRepository;

@Service
public class RecuiterService {
	@Autowired
	RecuiterRepository recuiterrepo;
	@Autowired
	JobsRepository jobsrepo;

	public Recuiter file(Recuiter recuit) {
		return recuiterrepo.save(recuit) ;
		// TODO Auto-generated method stub
		
	}

	public Jobs file(Jobs jo) {
		return jobsrepo.save(jo) ;
		// TODO Auto-generated method stub
		
	}

	public List<Recuiter> getallrecuiter() {
		// TODO Auto-generated method stub
		return recuiterrepo.findAll() ;
	}

	public Optional<Recuiter> fetchbyid(int id) {
		// TODO Auto-generated method stub
		return recuiterrepo.findById(id) ;
	}

	public Recuiter upadte(Recuiter r) {
		// TODO Auto-generated method stub
		return recuiterrepo.save(r) ;
	}

	public void recuiterdeletebyid(int id) {
		// TODO Auto-generated method stub
		recuiterrepo.deleteById(id);
	}

	public void deleteall() {
		// TODO Auto-generated method stub
		recuiterrepo.deleteAll();
	}

}
