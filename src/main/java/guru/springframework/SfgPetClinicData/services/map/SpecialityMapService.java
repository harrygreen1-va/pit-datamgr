package guru.springframework.SfgPetClinicData.services.map;

import guru.springframework.SfgPetClinicData.model.Speciality;
import guru.springframework.SfgPetClinicData.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/31/18.
 */
@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    // CRUD
    @Override
    public Speciality save(Speciality object) {
        return save(object);
    }
    
    // MAP
    public Speciality save(Long id, Speciality object)
    {
    	return super.save(id, object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
