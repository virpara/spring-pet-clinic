package com.spring5.petclinic.bootstrap;

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
	
	public DataLoader() {
		ownerService = new OwnerMapService();
		vetService = new VetMapService();
	}

	@Override
	public void run(String... args) throws Exception {
		Owner o1 = new Owner();
		o1.setId(1L);
		o1.setFirstName("Michael");
		o1.setLastName("Scofield");
		
		ownerService.save(o1);
		
		Owner o2 = new Owner();
		o2.setId(2L);
		o2.setFirstName("Josh");
		o2.setLastName("Baker");
		
		ownerService.save(o2);
		
		System.out.println("Loaded owners...");
		
		Vet v1 = new Vet();
		v1.setId(1L);
		v1.setFirstName("Scott");
		v1.setLastName("Johnson");
		
		vetService.save(v1);
		
		Vet v2 = new Vet();
		v2.setId(2L);
		v2.setFirstName("Scott");
		v2.setLastName("Johnson");
		
		vetService.save(v2);
		
		System.out.println("Loaded vets...");
		
	}

}
