package guru.springframework.SfgPetClinicData.services.map;

import guru.springframework.SfgPetClinicData.model.Pet;
import guru.springframework.SfgPetClinicData.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

import javax.persistence.Id;

/**
 * Created by jt on 7/21/18.
 */
@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    // CRUD
    @Override
    public Pet save(Pet object) {
        return save(object);
    }
    
    // MAP
    @Override
    public Pet save(Long id, Pet object)
    {
    	return super.save(id, object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
