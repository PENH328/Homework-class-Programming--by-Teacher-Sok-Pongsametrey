// ProductDemo.java
public class ProductDemo {
    public static void main(String[] args) {
        // Create 3 product objects
        Product laptop = new Product("Laptop Pro X", 1200.00, 5);
        Product mouse = new Product("Wireless Mouse", 25.50, 0);
        Product keyboard = new Product("Mechanical Keyboard", 150.99, 12);

        System.out.println("--- Product Catalog ---");
        laptop.displayInfo();
        mouse.displayInfo();
        keyboard.displayInfo();
        
        System.out.println("\n--- Testing Methods ---");

        // Test isInStock()
        System.out.println(laptop.getName() + " in stock? " + laptop.isInStock());
        System.out.println(mouse.getName() + " in stock? " + mouse.isInStock());
        
        // Test updatePrice()
        laptop.updatePrice(1150.00); // Valid update
        laptop.updatePrice(-50.00);  // Invalid update (demonstrates data protection)

        // Test Getter methods
        System.out.println("\nAccessing protected data (Quantity):");
        System.out.println(keyboard.getName() + " has " + keyboard.getQuantity() + " units.");
    }
}