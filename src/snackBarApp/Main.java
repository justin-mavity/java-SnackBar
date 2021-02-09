package snackBarApp;

public class Main {
    private static void workWithData() {

        System.out.println("Welcome to the Snack Bar");

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Soda");

        Snack s1 = new Snack("Coke", 24, 2.50, "Soda");
        Snack s2 = new Snack("Water", 20, 2.75, "Soda");
        Snack s3 = new Snack("Pretzel", 30, 2.00, "Food");
        Snack s4 = new Snack("Chips", 36, 1.75, "Food");
        Snack s5 = new Snack("Chocolate Bar", 36, 1.00, "Food");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        double itemsBought = 4;
        c1.substract(s4.total(s4.add(itemsBought)));
        System.out.println(c1.getName() + " cash on hands " + c1.getCashOnHand());
        System.out.println(s2.getQuantity());
        System.out.println();

        itemsBought = 1;
        c1.substract(s3.total(s3.add(itemsBought)));
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println(s3.getQuantity());
        System.out.println();

        itemsBought = 2;
        c2.substract(s4.total(s4.add(itemsBought)));
        System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
        System.out.println(s4.getQuantity());
        System.out.println();

        c1.add(10);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println();

        itemsBought = 1;
        c1.substract(s5.total(s5.add(itemsBought)));
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println(s5.getQuantity());
        System.out.println();

        s3.add(12);
        System.out.println(s3.getQuantity());
        System.out.println();

        itemsBought = 3;
        c2.substract(s3.total(s3.add(itemsBought)));
        System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
        System.out.println(s3.getQuantity());
        System.out.println();

        System.out.println("Snack: " + s1.getName());
        System.out.println("Vennding Machine: " + v1.getName());
        System.out.println("Quantity: " + s1.getQuantity());
        System.out.println("Total Cost: $" + s1.getCost());
        System.out.println();

        System.out.println("Snack: " + s2.getName());
        System.out.println("Vennding Machine: " + v1.getName());
        System.out.println("Quantity: " + s2.getQuantity());
        System.out.println("Total Cost: $" + s2.getCost());
        System.out.println();

        System.out.println("Snack: " + s3.getName());
        System.out.println("Vennding Machine: " + v1.getName());
        System.out.println("Quantity: " + s3.getQuantity());
        System.out.println("Total Cost: $" + s3.getCost());
        System.out.println();

        System.out.println("Snack: " + s4.getName());
        System.out.println("Vennding Machine: " + v2.getName());
        System.out.println("Quantity: " + s4.getQuantity());
        System.out.println("Total Cost: $" + s4.getCost());
        System.out.println();

        System.out.println("Snack: " + s5.getName());
        System.out.println("Vennding Machine: " + v2.getName());
        System.out.println("Quantity: " + s5.getQuantity());
        System.out.println("Total Cost: $" + s5.getCost());
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {
        workWithData();
    }
}
