package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idmovie;
	private String name ; 
	private String categorie;
	private int Duree;
	private Date date;
	@ManyToOne
	@JoinColumn(name = "idroom")
	private Room room;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getDuree() {
		return Duree;
	}
	public void setDuree(int duree) {
		Duree = duree;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
	public Movie(String name, String categorie, int duree, Date date, Room room) {
		super();
		this.name = name;
		this.categorie = categorie;
		Duree = duree;
		this.date = date;
		this.room = room;
	}
	public Long getIdmovie() {
		return idmovie;
	}
	public void setIdmovie(Long idmovie) {
		this.idmovie = idmovie;
	}
	public Movie() {
		super();
	}
	
	
	

}
