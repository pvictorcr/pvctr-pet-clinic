package pvctr.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import pvctr.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
