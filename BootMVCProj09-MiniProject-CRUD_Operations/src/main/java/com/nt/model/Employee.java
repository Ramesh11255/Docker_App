package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "SEQ_EMP",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq1")
	private Integer id;
	
	private String name;
	
	private String address;
	
	private String job;
	
	private Integer salary;
}
