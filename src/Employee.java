import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee {
    private String name;
    private String surname;
    private String address;
    private String profession;
    private Date date_of_birth;

    public Employee(String name,
                    String surname,
                    String address,
                    String profession,
                    Date date_of_birth) {

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.profession = profession;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(date_of_birth);
        return "+----------------------+\n" +
                "| Name: " + padRight(name, 15) + " |\n" +
                "| Surname: " + padRight(surname, 12) + " |\n" +
                "| Address: " + padRight(address, 12) + " |\n" +
                "| Profession: " + padRight(profession, 9) + " |\n" +
                "| Born: " + padRight(formattedDate, 15) + " |\n" +
                "+----------------------+";
    }

    private String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}
