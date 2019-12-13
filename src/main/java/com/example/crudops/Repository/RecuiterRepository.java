package com.example.crudops.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudops.Model.Recuiter;
@Repository
public interface RecuiterRepository extends JpaRepository<Recuiter, Integer> {

}
