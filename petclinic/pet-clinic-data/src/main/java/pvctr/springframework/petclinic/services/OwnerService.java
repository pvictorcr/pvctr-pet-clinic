package pvctr.springframework.petclinic.services;

import java.util.Set;

import pvctr.springframework.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
