package guru.springframework.SfgPetClinicData.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by jt on 7/29/18.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {

	private static final long serialVersionUID = 1L;
    public Speciality(Long id)
	{
		super(id);
	}

	@Column(name = "description")
    private String description;

}
