package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Movie;
import com.example.demo.entities.Room;

import ch.qos.logback.core.net.server.Client;

@SpringBootApplication
public class BookingApplication {
	
	public void addclient(Client c) {
		
		
	}
	public void addmovie(Movie m,Room r) {
		
	}
	public void reserve(Client c,Movie m) {
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
		
	}

}
