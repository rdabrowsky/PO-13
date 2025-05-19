import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Staff {
    private List<Employee> employees;

    public Staff() {
        this.employees = new ArrayList<>();
    }

    public Staff(Employee[] employees) {
        this.employees = new ArrayList<>(Arrays.asList(employees));
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void displayAllEmployees() {
        System.out.println("\n===== LIST OF EMPLOYEES =====");
        if (employees.isEmpty()) {
            System.out.println("There is no employees to display");
            return;
        }

        employees.forEach(employee -> {
            System.out.println(employee);
            System.out.println("---------------------------");
        });
    }

    public void displayEmployeeDetails(Employee employee) {
        System.out.println("\n===== DETAILS OF EMPLOYEE =====");
        System.out.println(employee);
    }

    private List<Employee> findBy(Predicate<Employee> condition) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (condition.test(employee)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> findByName(String name) {
        return findBy(e -> e.getName().equalsIgnoreCase(name));
    }

    public List<Employee> findBySurname(String surname) {
        return findBy(e -> e.getSurname().equalsIgnoreCase(surname));
    }

    public List<Employee> findByProfession(String profession) {
        return findBy(e -> e.getProfession().equalsIgnoreCase(profession));
    }

}
