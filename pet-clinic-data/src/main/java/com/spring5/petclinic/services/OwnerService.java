package com.spring5.petclinic.services;

import java.util.Set;

import com.spring5.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName();
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
