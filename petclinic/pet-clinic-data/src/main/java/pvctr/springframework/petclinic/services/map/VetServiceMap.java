package pvctr.springframework.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pvctr.springframework.petclinic.model.Vet;
import pvctr.springframework.petclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

}
