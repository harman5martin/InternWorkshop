package src.src.SubclassBindingExample;

// Factory pattern-subclass binding example
public abstract class rentalCarService {
    private Customer renter;

    protected rentalCarService(Customer renter) {
        this.renter = renter;
    }

    // Static factory method with conditional logic based on parameters
    // for choosing correct subclass to create the desired object
    public static rentalCarService rentVehicle(Customer customer, int passengers, boolean needRoofRack) throws Exception{
        if (passengers <= 4 && !needRoofRack) {
            return new Sedan(customer);
        } else if(passengers <=8 && !needRoofRack) {
            return new SUV(customer);
        } else if(passengers <=8) {
            return new Van(customer, needRoofRack);
        } else {
            throw new Exception("No vehicle can match this customer's needs");
        }
    }

    public Customer getRenter() {return renter;}
    public abstract int getMaxCapacity();
    public abstract boolean hasRoofRack();
}

class Sedan extends rentalCarService{
    protected Sedan(Customer customer) {
        super(customer);
    }

    public int getMaxCapacity() {
        return 4;
    }

    public boolean hasRoofRack() {
        return false;
    }
}

class SUV extends rentalCarService{
    protected SUV(Customer customer) {
        super(customer);
    }

    public int getMaxCapacity() {
        return 8;
    }

    public boolean hasRoofRack() {
        return false;
    }
}

class Van extends rentalCarService{
    private boolean hasRoofRack;
    protected Van(Customer customer, boolean hasRoofRack) {
        super(customer);
        this.hasRoofRack = hasRoofRack;
    }

    public int getMaxCapacity() {
        return 8;
    }

    public boolean hasRoofRack() {
        return hasRoofRack;
    }
}
