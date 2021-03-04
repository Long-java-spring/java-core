package main;

public abstract class Employee {
    private String name;
    private String address;

    public Employee() {
    }

    public Employee(String name, String address) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }
}
