package pvctr.springframework.petclinic.services.map;

import java.util.Set;

import org.hibernate.sql.Delete;

import pvctr.springframework.petclinic.model.Owner;
import pvctr.springframework.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements CrudService<Owner, Long>{

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

}
