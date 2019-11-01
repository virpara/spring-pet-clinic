package com.spring5.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring5.petclinic.model.Owner;
import com.spring5.petclinic.model.Vet;
import com.spring5.petclinic.services.OwnerService;
import com.spring5.petclinic.services.VetService;
import com.spring5.petclinic.services.map.OwnerMapService;
import com.spring5.petclinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	@Autowired // this is not required in Spring 5, but does not hurt
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner o1 = new Owner();
		o1.setFirstName("Michael");
		o1.setLastName("Scofield");
		
		ownerService.save(o1);
		
		Owner o2 = new Owner();
		o2.setFirstName("Josh");
		o2.setLastName("Baker");
		
		ownerService.save(o2);
		
		System.out.println("Loaded owners...");
		
		Vet v1 = new Vet();
		v1.setFirstName("Scott");
		v1.setLastName("Johnson");
		
		vetService.save(v1);
		
		Vet v2 = new Vet();
		v2.setFirstName("Jessie");
		v2.setLastName("May");
		
		vetService.save(v2);
		
		System.out.println("Loaded vets...");
		
	}

}
