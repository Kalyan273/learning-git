import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpByDep {
    private String name;
    private String department;
    private double salary;

    public GroupEmpByDep(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', dept='" + department + "', salary=" + salary + "}";
    }
    public static void main(String[] args) {
        List<GroupEmpByDep> employees = Arrays.asList(
            new GroupEmpByDep("Alice", "IT", 6000),
            new GroupEmpByDep("Bob", "HR", 5000),
            new GroupEmpByDep("Charlie", "IT", 7000),
            new GroupEmpByDep("David", "Finance", 5500),
            new GroupEmpByDep("Eve", "HR", 5200)
        );

        Map<String,List<GroupEmpByDep>>ans=employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));
        System.out.println(ans);

    }
}
