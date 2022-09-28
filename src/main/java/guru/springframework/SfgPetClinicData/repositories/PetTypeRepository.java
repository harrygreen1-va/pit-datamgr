package guru.springframework.SfgPetClinicData.repositories;

import guru.springframework.SfgPetClinicData.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
