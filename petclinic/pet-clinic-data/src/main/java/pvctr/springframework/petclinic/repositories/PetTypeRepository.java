package pvctr.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import pvctr.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
