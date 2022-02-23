package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	//user defined method
	public List<Student> findByFname(String fname);
	public List<Student> findByLnameContaining(String fnmae);
	public List<Student> findByLnameNotNull();
	public List<Student> findByGuardianGfname(String name);
	public List<Student> findByGuardianGlnameContaining(String fnmae);
	
	//JPQL
	@Query("select s from Student s where s.email=?1")
	
	Student getStudentByEmail(String email);
	
	//JPQL
	@Query("select s.fname from Student s where s.email=?1")
	
	String getFirstNameByEmail(String email);
	
	//Native query (Example query which cannot performed by JSQL
	
	@Query(
			value="select * from students s where s.email_address=?1",
			nativeQuery = true
			)
	Student getStudentByEmailNative(String name);
	
	
	
	@Query(
			value="select * from students s where s.email_address=:email",
			nativeQuery = true
			)
	Student getStudentByEmailWithParam(@Param("email") String email);
	
	//Update query
	@Modifying
	@Transactional
	@Query(
			value="update students set fname=?1 ,lname=?2 where email_address=?3",
			nativeQuery = true
			)
	
	void updateStudent(String fname,String lname,String email);
	
	
}
	