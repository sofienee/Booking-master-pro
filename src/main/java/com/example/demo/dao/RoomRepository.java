package com.example.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entities.Room;

public interface RoomRepository extends JpaRepository<Room,Long> {
	@Query("select r from Room r where r like :x")
	public Page<Room> roomParMC(@Param("x")String mc,Pageable r);

}
