package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherID;
	private String fisrtname;
	private String lastname;
	
	/*
	@OneToMany(
			cascade = CascadeType.ALL
			)
	@JoinColumn(
			name="teacher_id",
			referencedColumnName = "teacherID"
			)
	private List<Course> course;
	*/
	
	
}
