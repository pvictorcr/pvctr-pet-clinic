package pvctr.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import pvctr.springframework.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
