package Functional_Interfaces;

public class Customer {
    private int id;
    private String name;

    public Customer(String name, int id ) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
