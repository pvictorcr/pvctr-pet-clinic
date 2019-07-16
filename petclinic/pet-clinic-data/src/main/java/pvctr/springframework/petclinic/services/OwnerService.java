package pvctr.springframework.petclinic.services;

import pvctr.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
