package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Students",
        uniqueConstraints = @UniqueConstraint(
        		name="email_unique",
        		columnNames = "email_address"
        		)  
		)
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentID;
	private String fname;
	private String lname;
	
	@Column(nullable = false ,name="email_address")
	private String email;
	
	@Embedded
	private Guardian guardian;

}
