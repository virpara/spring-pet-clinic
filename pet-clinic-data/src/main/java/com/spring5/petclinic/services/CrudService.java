package com.spring5.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
	
	T findById(ID object);
	
	Set<T> findAll();
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);
}
