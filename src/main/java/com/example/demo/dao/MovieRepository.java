package com.example.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
	@Query("select m from Movie m where m.idmovie like :x")
	public Page<Movie> movieParMC(@Param("x")String mc,Pageable m);
}
