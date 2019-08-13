package pvctr.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import pvctr.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
