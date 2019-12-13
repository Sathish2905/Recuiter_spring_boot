package com.example.crudops.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "scheduling")
@Builder(toBuilder = true) 
@AllArgsConstructor(access = AccessLevel.PUBLIC) 
@NoArgsConstructor(access = AccessLevel.PUBLIC) 
@Getter(value = AccessLevel.PUBLIC) 
@Setter(value = AccessLevel.PUBLIC) 
@EqualsAndHashCode(onlyExplicitlyIncluded = true) 
@ToString(onlyExplicitlyIncluded = true)
public class InterviewScheduling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "job_code")
	private String jobCode;
	@Column(name = "score")
	private String score;
	@Column(name = "date")
	private String date;
	@Column(name = "time_slot")
	private String timeSlot;

}
