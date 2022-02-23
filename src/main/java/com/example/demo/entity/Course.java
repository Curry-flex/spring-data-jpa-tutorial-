package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseID;
	private String title;
	private int credit;
	
	@OneToOne(
			mappedBy = "course"
			)
	private CourseMaterial material;
	
	
	@ManyToOne(
			cascade = CascadeType.ALL
			)
	@JoinColumn(
			name="teacher_id",
			referencedColumnName = "teacherID"
			)
	
	
	private Teacher teacher;
	
	
	@ManyToMany(
			cascade = CascadeType.ALL
			)
	@JoinTable(
			name="course_student",
			joinColumns = @JoinColumn(
					name="course_id",
					referencedColumnName = "courseID"
					),
			inverseJoinColumns = @JoinColumn(
					name="student_id",
					referencedColumnName = "studentID"
					)
			)
	private List<Student> student;

}
