package com.crudsample.crudsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudsample.crudsample.model.student;

@Repository
public interface studentRepository extends JpaRepository<student,Integer> {

}
