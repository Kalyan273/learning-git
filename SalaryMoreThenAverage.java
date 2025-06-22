import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryMoreThenAverage {

    private String name;
    private double salary;

    public SalaryMoreThenAverage(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
         List<Employee> employees = Arrays.asList(
            new Employee("Alice", 5000),
            new Employee("Bob", 7000),
            new Employee("Charlie", 6000),
            new Employee("David", 4000)
        );

        double avgSalary = employees.stream().mapToDouble(salaryMoreThenAverage -> salaryMoreThenAverage.getSalary()).average().orElse(0.0);

        List<String> aboveAverageNames = employees.stream().filter(emp-> emp.getSalary()>avgSalary)
        .map(emp-> emp.getName()).collect(Collectors.toList());

        System.out.println(aboveAverageNames);

    }
}
