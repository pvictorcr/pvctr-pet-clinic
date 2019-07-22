package pvctr.springframework.petclinic.services.map;

import java.util.Set;

import pvctr.springframework.petclinic.model.Speciality;
import pvctr.springframework.petclinic.services.SpecialtiesService;

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

}
