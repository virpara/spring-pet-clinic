package com.spring5.petclinic.services;

import java.util.Set;

import com.spring5.petclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
