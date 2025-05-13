package hus.oop.lab6;

public class TestPerson {
    public static void main(String[] args) {
        // Test Person class
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person);

        // Test Student class
        Student student = new Student("Alice Smith", "456 Elm St",
                "Computer Science", 2023, 5000);
        System.out.println(student);

        // Test Staff class
        Staff staff = new Staff("Bob Johnson", "789 Oak St", "XYZ School", 3000);
        System.out.println(staff);
    }
}