package Practice;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
    public record Employee(String name, int salary) {
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Akshay", 3000), new Employee("Subhash", 30));
        employeeList.stream().filter(employee -> employee.salary() > 500).forEach(System.out::println);
    }
}
