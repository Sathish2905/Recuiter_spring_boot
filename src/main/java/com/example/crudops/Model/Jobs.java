package com.example.crudops.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "job")
@Builder(toBuilder = true) 
@AllArgsConstructor(access = AccessLevel.PUBLIC) 
@NoArgsConstructor(access = AccessLevel.PUBLIC) 
@Getter(value = AccessLevel.PUBLIC) 
@Setter(value = AccessLevel.PUBLIC) 
@EqualsAndHashCode(onlyExplicitlyIncluded = true) 
@ToString(onlyExplicitlyIncluded = true)
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "job_code")
	private String jobCode;
	@Column(name = "score")
	private String score;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "job_role")
	private String jobRole;
	@Column(name = "job_description")
	private String jobDescription;
	@Column(name = "eligibility_criteria")
	private String eligibilityCriteria;
	@Column(name = "job_location")
	private String jobLocation;
	@Column(name = "experience")
	private String experience;
	@Column(name = "salary")
	private String salary;
	@Column(name = "job_type")
	private String jobType;
	@Column(name = "skills")
	private String skills;
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "job")
	@JsonIgnore
	private Set<Recuiter> recuit = new HashSet<>();

}
