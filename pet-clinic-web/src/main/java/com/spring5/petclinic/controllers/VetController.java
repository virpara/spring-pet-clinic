package com.spring5.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring5.petclinic.services.VetService;

@Controller
public class VetController {
	
	private VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
	public String vets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		
		return "vets/index";
	}
}
