// Product.java
public class Product {
    // Private fields: Encapsulation for data protection
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize all fields
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // --- Getter Methods ---
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // --- Public Methods ---

    // 1. displayInfo()
    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.printf("  Price: $%.2f%n", price);
        System.out.println("  Quantity: " + quantity);
    }

    // 2. updatePrice()
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            System.out.println("  *Price updated! New price for " + name + " is $" + newPrice);
        } else {
            System.out.println("  *Update failed. Price must be positive.");
        }
    }

    // 3. isInStock()
    public boolean isInStock() {
        return this.quantity > 0;
    }
}