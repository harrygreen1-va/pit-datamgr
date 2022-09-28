package guru.springframework.SfgPetClinicData.services;

import guru.springframework.SfgPetClinicData.model.Owner;
import java.util.List;
import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

	
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
    
    Owner findById(Long Id);
    
    Owner save(Owner owner);
    
    Set<Owner> findAll();
 }
