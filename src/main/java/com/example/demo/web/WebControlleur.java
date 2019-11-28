package com.example.demo.web;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.ClientRepository;
import com.example.demo.dao.MovieRepository;
import com.example.demo.dao.RoomRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.Movie;
import com.example.demo.entities.Room;


//CLIENT
@Controller
public class WebControlleur {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private RoomRepository roomRepository;

	@RequestMapping("client/add")
	public String addAuteur(Model model) {
		model.addAttribute("client",new Client() );
		return "addClient";
		}
	
	@RequestMapping(value="client/save",method=RequestMethod.POST)
	public String saveClient(@Valid @ModelAttribute Client a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "addClient";
	}
	clientRepository.save(a);
	return "redirect:/client/lister";
	}
	
	@RequestMapping("client/lister")
	public String listClient(Model model) {
	model.addAttribute("client",
			clientRepository.findAll() );
	return "listerClient";
	}
	
	@RequestMapping("client/modifClient")
	public String modifClient(Model model,Long id) {
	Client a=clientRepository.findById(id).get();
	model.addAttribute("client",a);
	return "modifClient";
	}

	@RequestMapping(value="client/update",method=RequestMethod.POST)
	public String updateClient(@Valid @ModelAttribute Client a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "modifClient";
	}
	clientRepository.save(a);
	return "redirect:/client/lister";
	}
	
	@RequestMapping(value="client/supClient",method=RequestMethod.GET)
	public String supClient(@Valid @ModelAttribute Client a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "supClient";
	}
	clientRepository.delete(a);
	return "redirect:/client/lister";
	}
	
	// Movie 
	@RequestMapping("movie/add")
	public String addAuteur2(Model model) {
		model.addAttribute("movie",new Movie() );
		return "addMovie";
		}
	
	@RequestMapping(value="movie/save",method=RequestMethod.POST)
	public String saveMovie(@Valid @ModelAttribute Movie a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "addMovie";
	}
	movieRepository.save(a);
	return "redirect:/movie/lister";
	}
	
	@RequestMapping("movie/lister")
	public String listMovie(Model model) {
	model.addAttribute("movie",
			movieRepository.findAll() );
	return "listerMovie";
	}
	
	@RequestMapping("movie/modifMovie")
	public String modifMovie(Model model,Long id) {
	Movie a=movieRepository.findById(id).get();
	model.addAttribute("movie",a);
	return "modifMovie";
	}

	@RequestMapping(value="movie/update",method=RequestMethod.POST)
	public String updateMovie(@Valid @ModelAttribute Movie a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "modifMovie";
	}
	movieRepository.save(a);
	return "redirect:/movie/lister";
	}
	
	@RequestMapping("movie/supMovie")
	public String supMovie(Model model,Long id) {
	Movie a=movieRepository.findById(id).get();
	movieRepository.delete(a);
	return "redirect:/movie/lister";
	
	}
	
	
	//ROOM
	@RequestMapping("room/add")
	public String addAuteur3(Model model) {
		model.addAttribute("room",new Room() );
		return "addRoom";
		}
	
	@RequestMapping(value="room/save",method=RequestMethod.POST)
	public String saveRoom(@Valid @ModelAttribute Room a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "addRoom";
	}
	
	roomRepository.save(a);
	return "redirect:/room/lister";
	}
	
	@RequestMapping("room/lister")
	public String listRoom(Model model) {
	model.addAttribute("room",
			roomRepository.findAll() );
	return "listerRoom";
	}
	
	@RequestMapping("room/modifRoom")
	public String modifRoom(Model model,Long id) {
	Room a=roomRepository.findById(id).get();
	model.addAttribute("room",a);
	return "modifRoom";
	}

	@RequestMapping(value="room/update",method=RequestMethod.POST)
	public String updateRoom(@Valid @ModelAttribute Room a,
	BindingResult bindingResult) {
	if (bindingResult.hasErrors()){
	return "modifRoom";
	}
	roomRepository.save(a);
	return "redirect:/room/lister";
	}
	
	
	@RequestMapping("room/supRoom")
	public String supRoom(Model model,Long id) {
	Room a=roomRepository.findById(id).get();
	roomRepository.delete(a);
	return "redirect:/room/lister";
	}
}
