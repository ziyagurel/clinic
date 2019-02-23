package com.zgurel.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgurel.petclinic.dao.OwnerRepository;
import com.zgurel.petclinic.dao.mem.OwnerRepositoryImpl;
import com.zgurel.petclinic.exception.OwnerNotFoundException;
import com.zgurel.petclinic.model.Owner;

@Service
public class PetClinicServiceImpl implements PetClinicService {

	private OwnerRepository ownerRepository;
	
	@Autowired
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	@Override
	public List<Owner> findOwners() {
		return ownerRepository.findAll();
	}

	@Override
	public List<Owner> findOwners(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

	@Override
	public Owner findOwner(Long id) throws OwnerNotFoundException {
		Owner owner =ownerRepository.findById(id);
		if(owner ==null) throw new OwnerNotFoundException("oWNER NOT FOUND With id:" + id);
		return owner;
	}

	@Override
	public void createOwner(Owner owner) {
		ownerRepository.create(owner);
	}

	@Override
	public void update(Owner owner) {
		ownerRepository.update(owner);

	}

	@Override
	public void deleteOwner(Long id) {
		ownerRepository.delete(id);
	}

}
