package guru.springframework.SfgPetClinicData.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person {

	private static final long serialVersionUID = 1L;
    public Vet(Long id, String firstName, String lastName)
	{
		super(id, firstName, lastName);
	}

    @Builder.Default
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();
	
	public Set<Speciality> getSpecialities()
	{
		return specialities;
	}

}
