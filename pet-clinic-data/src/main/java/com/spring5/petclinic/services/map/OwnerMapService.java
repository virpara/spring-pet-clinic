package com.spring5.petclinic.services.map;

import java.util.Set;

import com.spring5.petclinic.model.Owner;
import com.spring5.petclinic.services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
	
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	
}
