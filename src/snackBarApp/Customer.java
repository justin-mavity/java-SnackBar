package snackBarApp;

public class Customer {
    private static int maxId = 0;
    private String name;
    private int id;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getMaxId() {
        return maxId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public double add(double amount) {
        return this.cashOnHand += amount;
    }

    public double substract(double amount) {
        return this.cashOnHand -= amount;
    }

}
