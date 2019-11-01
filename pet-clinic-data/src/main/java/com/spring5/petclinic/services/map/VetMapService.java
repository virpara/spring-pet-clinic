package com.spring5.petclinic.services.map;

import java.util.Set;

import com.spring5.petclinic.model.Vet;
import com.spring5.petclinic.services.CrudService;
import com.spring5.petclinic.services.VetService;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
}
