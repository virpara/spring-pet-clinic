package com.spring5.petclinic.services;

import com.spring5.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName();
}
