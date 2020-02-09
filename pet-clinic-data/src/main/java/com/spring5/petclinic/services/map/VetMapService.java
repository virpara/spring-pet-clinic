package com.spring5.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring5.petclinic.model.Speciality;
import com.spring5.petclinic.model.Vet;
import com.spring5.petclinic.services.SpecialtyService;
import com.spring5.petclinic.services.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyService specialtyService;

	public VetMapService(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
	public Vet save(Vet object) {
		if (object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(specialty -> {
				if (specialty.getId() == null) {
					Speciality savedSpeciality = specialtyService.save(specialty);
					specialty.setId(savedSpeciality.getId());
				}
			});
		}
		
		return super.save(object);
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
