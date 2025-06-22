import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    private String name;
    private double salary;

    public SecondHighestSalary(String name, double salary) {
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
        List<SecondHighestSalary> employees = Arrays.asList(
            new SecondHighestSalary("Alice", 5000),
            new SecondHighestSalary("Bob", 8000),
            new SecondHighestSalary("Charlie", 3000),
            new SecondHighestSalary("David", 7000),
            new SecondHighestSalary("Eve", 8000)  // Duplicate top salary
        );

        Optional<Double> secondHighest = employees.stream()
            .sorted(Comparator.comparingDouble(SecondHighestSalary::getSalary).reversed())  // Descending order
            .map(SecondHighestSalary::getSalary)
            .distinct()  // Remove duplicates
            .skip(1)     // Skip the highest
            .findFirst(); 

            System.out.println(secondHighest);
    
    }
}
