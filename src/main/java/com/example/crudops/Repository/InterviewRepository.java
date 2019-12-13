package com.example.crudops.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudops.Model.InterviewScheduling;
@Repository
public interface InterviewRepository extends JpaRepository<InterviewScheduling, Integer> {

}
