package ac.za.cput.domain.employee;

public class Caretaker extends Employee{

    private int[] keys;

    public Caretaker(){
    }

    public Caretaker(CaretakerBuilder builder){
        super(builder);
        this.keys = builder.keys;
    }


    public int[] getKeys() {
        return keys;
    }

    public void setKeys(int[] keys){
        this.keys = keys;
    }

    public static class CaretakerBuilder extends Employee.Builder{
        private int[] keys;

        public CaretakerBuilder(){
            super();
        }

        public CaretakerBuilder keys(int[] keys){
            this.keys = keys;
            return this;
        }

        @Override
        public Employee build(){
            return new Caretaker(this);
        }

        @Override
        public String toString(){
            return super.toString();
        }

    }
}
