package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CourseMaterial;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Integer> {

}
