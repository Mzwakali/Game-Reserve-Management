package ac.za.cput.domain.gameReserve;

public class FoodCourt {

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
