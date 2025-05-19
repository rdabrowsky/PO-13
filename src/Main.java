import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1985, Calendar.MARCH, 10);
        Date birthDate = cal.getTime();
        Employee emp1 = new Employee("Piotr", "Wiśniewski", "Gdańsk", "Manager", birthDate);
        Employee emp2 = new Employee("Piotr1", "Wiśniewski2", "Gdańsk", "Manager", birthDate);
        Employee[] employees = {emp1, emp2};
        Staff staff = new Staff(employees);

        System.out.println(staff.findBySurname("Wiśniewski"));
    }
}
