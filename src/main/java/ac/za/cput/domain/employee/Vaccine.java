package ac.za.cput.domain.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vaccine {

    @Id
    private int vaccineId;
    private String vaccineName;
    private int quantity;
}
