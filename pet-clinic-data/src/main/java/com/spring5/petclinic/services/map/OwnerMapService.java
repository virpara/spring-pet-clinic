package com.spring5.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring5.petclinic.model.Owner;
import com.spring5.petclinic.services.OwnerService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
	
	@Override
	public Owner findByLastName() {
		return null;
	}

	public Owner save(Owner object) {
		return super.save(object);
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
