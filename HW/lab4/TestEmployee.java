package hus.oop.lab4;

public class TestEmployee {
    public static  void main(String[] args){
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1); // toString()
        employee1.setSalary(999);
        System.out.println(employee1); // toString()
        System.out.println("ID is: " + employee1.getId());
        System.out.println("First name is: " + employee1.getFirstName());
        System.out.println("Last name is: " + employee1.getLastName());
        System.out.println("Salary is: " + employee1.getSalary());
        System.out.println("Name is: " + employee1.getName());
        System.out.println("Annual salary is: " + employee1.getAnnualSalary()); // Test method
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
