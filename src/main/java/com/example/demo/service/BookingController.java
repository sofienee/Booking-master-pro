package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.ClientRepository;
import com.example.demo.dao.MovieRepository;
import com.example.demo.dao.RoomRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.Movie;
import com.example.demo.entities.Room;





@RestController
public class BookingController {
	@Autowired
    private ClientRepository clientRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private RoomRepository roomRepository;
	
	
	@RequestMapping("/save1")
	public Client saveClient(Client c) {
		clientRepository.save(c);
		return c;
	}
	@RequestMapping("/save2")
	public Movie saveMovie(Movie m) {
		movieRepository.save(m);
		return m;
	}
	@RequestMapping("/save3")
	public Room saveMovie(Room r) {
		roomRepository.save(r);
		return r;
	}
	
	


}
