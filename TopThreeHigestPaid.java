import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeHigestPaid {
    private String name;
    private double salary;

    public TopThreeHigestPaid(String name, double salary) {
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
        List<TopThreeHigestPaid> employees = Arrays.asList(
            new TopThreeHigestPaid("Alice", 5000),
            new TopThreeHigestPaid("Bob", 8000),
            new TopThreeHigestPaid("Charlie", 7000),
            new TopThreeHigestPaid("David", 6000),
            new TopThreeHigestPaid("Eve", 7500)
        );

         List<TopThreeHigestPaid> top3 = employees.stream().sorted(Comparator.comparingDouble(TopThreeHigestPaid::getSalary).reversed()).
         limit(3).collect(Collectors.toList());

         System.out.println(top3);
    }
}
