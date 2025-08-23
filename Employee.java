public class Employee {
    private int id;
    private String name;

    // Default constructor
    Employee() {
        System.out.println("Employee Created");
        this.id = 999;
        this.name = "John Doe";
        System.out.println("Default Employee Created");
        System.out.println("ID = " + id + ", Name = " + name);
    }

    // Constructor with id only
    Employee(int id) {
        System.out.println("Employee Created");
        this.id = id;
        this.name = "John Doe";  // default name
        System.out.println("Employee Created with Default Name");
        System.out.println("ID = " + id + ", Name = " + name);
    }

    // Constructor with name and id
    Employee(String name, int id) {
        System.out.println("Employee Created");
        this.id = id;
        this.name = name;
        System.out.println("ID = " + id + ", Name = " + name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();        // Calls default constructor
        Employee emp1 = new Employee(10);     // Calls constructor with id
        Employee emp2 = new Employee("Pankaj", 20); // Calls constructor with name, id
        System.out.println(emp);
    }
}
