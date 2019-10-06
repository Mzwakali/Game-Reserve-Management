package ac.za.cput.domain.gameReserve;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodCourt extends GameReserve{


    private int sectionId;
    private String vendorName;

    public FoodCourt() {
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
