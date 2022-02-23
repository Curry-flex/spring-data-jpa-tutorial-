package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude="course")
public class CourseMaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseMaterialID;
	private String url;
	
	@OneToOne(
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY ,
			optional = false
			
			)
	@JoinColumn(
			name="course_id",
			referencedColumnName ="courseID"
			)
	private Course course;
}
