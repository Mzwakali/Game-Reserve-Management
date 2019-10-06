package ac.za.cput.domain.visitor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarePackage {

    @Id
    private int packageId;
    private int visitorId;
}
