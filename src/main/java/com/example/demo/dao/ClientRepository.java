package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Client;



public interface ClientRepository extends JpaRepository<Client,Long>{
	@Query("select c from Client c where c like :x")
	public Page<Client> clientParMC(@Param("x")String mc,Pageable c);

}
