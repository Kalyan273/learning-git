import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
     private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // For display
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 4500),
            new Employee("Bob", 6000),
            new Employee("Charlie", 8000),
            new Employee("David", 4000)
        );

        List<Employee> list=employees.stream().filter(emp-> emp.getSalary()>5000).collect(Collectors.toList());

        System.out.println(list);
    }
}
