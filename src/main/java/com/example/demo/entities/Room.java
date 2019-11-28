package com.example.demo.entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Room{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idroom;
	private String label ; 
	private int nbchaise ;
	public Long getIdroom() {
		return idroom;
	}
	public void setIdroom(Long idroom) {
		this.idroom = idroom;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getNbchaise() {
		return nbchaise;
	}
	public void setNbchaise(int nbchaise) {
		this.nbchaise = nbchaise;
	}
	
	public Room(Long idroom, String label, int nbchaise) {
		super();
		this.idroom = idroom;
		this.label = label;
		this.nbchaise = nbchaise;
	}
	
	public Room() {
		super();
	}
	@Override
	public String toString() {
		return "Room [idroom=" + idroom + ", label=" + label + ", nbchaise=" + nbchaise + "]";
	}
	
	
	

}
