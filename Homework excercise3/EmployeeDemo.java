// EmployeeDemo.java
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create an array of the abstract type Employee.
        // This is the core of Polymorphism: an Employee reference variable 
        // can hold an object of any of its concrete subclasses.
        Employee[] team = new Employee[3];
        team[0] = new Manager("Alice Johnson", "M001", 120000.00);
        team[1] = new Developer("Bob Smith", "D005", 85000.00);
        team[2] = new Salesperson("Charlie Brown", "S012", 70000.00);

        System.out.println("--- Employee Details and Bonus Calculation ---");

        // Loop through the array and process each employee
        for (Employee emp : team) {
            // Polymorphism in action:
            // 1. Concrete method call: displays common details
            emp.displayDetails();
            
            // 2. Abstract method call: calls the specific 'calculateBonus()'
            //    implementation based on the actual object type (Manager, Developer, or Salesperson).
            double bonus = emp.calculateBonus();
            System.out.printf("Bonus: $%.2f%n", bonus);
            System.out.println("----------------------------------------------");
        }
    }
}