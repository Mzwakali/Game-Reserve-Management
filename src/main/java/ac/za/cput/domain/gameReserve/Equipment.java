package ac.za.cput.domain.gameReserve;

public class Equipment {

    private int equipId;
    private String description;
    private int quantity;

    public Equipment() {

    }

    public int getEquipId() {
        return equipId;
    }

    public void setEquipId(int equipId) {
        this.equipId = equipId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipId=" + equipId +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
