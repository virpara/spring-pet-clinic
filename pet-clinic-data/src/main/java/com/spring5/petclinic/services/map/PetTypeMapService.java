package com.spring5.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring5.petclinic.model.PetType;
import com.spring5.petclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
	}
	
	
}
