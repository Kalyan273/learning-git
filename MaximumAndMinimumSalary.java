import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumAndMinimumSalary {
    private String name;
    private double salary;

    public MaximumAndMinimumSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 5000),
            new Employee("Bob", 8000),
            new Employee("Charlie", 3000),
            new Employee("David", 7000)
        );

        Optional<Employee> maxSal=employees.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> minSal=employees.stream().min(Comparator.comparing(Employee::getSalary));

        System.out.println(maxSal+" "+ minSal);
    }
}
