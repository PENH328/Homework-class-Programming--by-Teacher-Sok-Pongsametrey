// Manager.java
public class Manager extends Employee {
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double calculateBonus() {
        // Manager bonus is 15% of salary
        return salary * 0.15;
    }
}

// Developer.java
public class Developer extends Employee {
    public Developer(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double calculateBonus() {
        // Developer bonus is 10% of salary
        return salary * 0.10;
    }
}

// Salesperson.java
public class Salesperson extends Employee {
    public Salesperson(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double calculateBonus() {
        // Salesperson bonus is 5% of salary plus a flat commission
        return (salary * 0.05) + 500.00;
    }
}