package src.src;

public class Customer {
    private String name;
    private int phoneNumber;
    private int id;

    public Customer(String name, int phoneNumber, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getName() {return name;}
    public int getPhoneNumber() {return phoneNumber;}
    public int getId() {return id;}
}
