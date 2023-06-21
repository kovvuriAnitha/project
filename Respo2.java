package com.example.demo.ProjectAha.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ProjectAha.Models.Model2;


public interface Respo2 extends JpaRepository<Model2,String> {

Model2 findByUsername(String user);



}



