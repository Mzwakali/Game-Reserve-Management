package ac.za.cput.domain.gameReserve;

import java.util.List;
import java.util.Objects;

public class Equipment {

    private int equipId;
    private String description;
    private int quantity;
    private List<Department> departments;

    public Equipment(EquipmentBuilder equipmentBuilder) {
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class EquipmentBuilder{
        private int equipId;
        private String description;
        private int quantity;
        private List<Department> departments;

        public EquipmentBuilder(){

        }
        public EquipmentBuilder equipId(int equipId){
            this.equipId = equipId;
            return this;
        }
        public EquipmentBuilder description(String description){
            this.description = description;
            return this;
        }
        public EquipmentBuilder quantity(int quantity){
            this.quantity = quantity;
            return  this;
        }
        public EquipmentBuilder department(List<Department> departments){
            this.departments = departments;
            return this;
        }
        public Equipment build(){
            return new Equipment(this);
        }

        @Override
        public String toString() {
            return "EquipmentBuilder{" +
                    "equipId=" + equipId +
                    ", description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", departments=" + departments +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof EquipmentBuilder)) return false;
            EquipmentBuilder that = (EquipmentBuilder) o;
            return equipId == that.equipId &&
                    quantity == that.quantity &&
                    Objects.equals(description, that.description) &&
                    departments.equals(that.departments);
        }

        @Override
        public int hashCode() {
            return Objects.hash(equipId, description, quantity, departments);
        }
    }
}
