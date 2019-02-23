package com.zgurel.petclinic.service;

import java.util.List;

import com.zgurel.petclinic.exception.OwnerNotFoundException;
import com.zgurel.petclinic.model.Owner;

public interface PetClinicService {
	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void createOwner(Owner owner);
	void update(Owner owner);
	void deleteOwner(Long id);
}
