package pvctr.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import pvctr.springframework.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
