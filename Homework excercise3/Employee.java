// Employee.java
public abstract class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Abstract method: Must be implemented by concrete subclasses.
    public abstract double calculateBonus();

    // Concrete method: Reused by all subclasses.
    public void displayDetails() {
        System.out.printf("Name: %-15s | ID: %-5s | Salary: $%.2f%n", name, id, salary);
    }
}