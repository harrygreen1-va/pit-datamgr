package guru.springframework.SfgPetClinicData.services;

import guru.springframework.SfgPetClinicData.model.Vet;
import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long Id);
    
    Vet save(Vet vet);
    
    Set<Vet> findAll();
}
