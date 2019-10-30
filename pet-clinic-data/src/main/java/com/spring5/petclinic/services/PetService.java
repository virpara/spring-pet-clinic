package com.spring5.petclinic.services;

import java.util.Set;

import com.spring5.petclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
