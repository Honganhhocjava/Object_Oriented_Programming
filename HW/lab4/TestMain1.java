package hus.oop.lab4;
import java.util.Scanner;

public class TestMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //testCircle
//        Circle circle0 = new Circle();
//        System.out.println(circle0.toString());
//        System.out.println("The circle has radius of " + circle0.getRadius()
//                + " and area of " + circle0.getArea() + " and circumference " + circle0.getCircumference());
//        Circle circle01 = new Circle(2);
//        System.out.println(circle01.toString());
//        System.out.println("The circle has radius of " + circle01.getRadius()
//                + " and area of " + circle01.getArea() + " and circumference " + circle01.getCircumference());
//        Circle circle02 =  new Circle(5.5 , "green");
//        System.out.println(circle02.toString());
//        System.out.println("The circle has radius of " + circle02.getRadius()
//                + " and area of " + circle02.getArea() + " and circumference " + circle02.getCircumference());
//        //1.2Circle
//        Circle circle = new Circle();
//        System.out.println("The circle has radius of " + circle.getRadius()
//                + " and area of " + circle.getArea() + " and circumference " + circle.getCircumference());
//        Circle circle1 = new Circle(2);
//        System.out.println("The circle has radius of " + circle1.getRadius()
//                + " and area of " + circle1.getArea() + " and circumference " + circle1.getCircumference());
//        Circle circle2 = new Circle(5.5, "green");
//        System.out.println("The circle has radius of " + circle2.getRadius()
//                + " and area of " + circle2.getArea() + " and circumference " + circle2.getCircumference());
//        //1.3Rectangle
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.toString());
//        System.out.println("length is: " + rectangle.getLength() + " width is: " + rectangle.getWidth());
//        System.out.printf("area is: %.2f%n", rectangle.getArea());
//        System.out.printf("perimeter is: %.2f%n", rectangle.getPerimeter());
//        Rectangle rectangle1 = new Rectangle(5.6f, 7.8f);
//        System.out.println(rectangle1.toString());
//        System.out.println("length is: " + rectangle1.getLength() + " width is: " + rectangle1.getWidth());
//        System.out.printf("area is: %.2f%n", rectangle1.getArea());
//        System.out.printf("perimeter is: %.2f%n", rectangle1.getPerimeter());
//        //1.4Employee
//        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
//        System.out.println(employee1); // toString()
//        employee1.setSalary(999);
//        System.out.println(employee1); // toString()
//        System.out.println("ID is: " + employee1.getId());
//        System.out.println("First name is: " + employee1.getFirstName());
//        System.out.println("Last name is: " + employee1.getLastName());
//        System.out.println("Salary is: " + employee1.getSalary());
//        System.out.println("Name is: " + employee1.getName());
//        System.out.println("Annual salary is: " + employee1.getAnnualSalary()); // Test method
//        System.out.println(employee1.raiseSalary(10));
//        System.out.println(employee1);
//        //1.5InvoiceItem
//        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
//        System.out.println(inv1); // Calls the toString() method
//        inv1.setQty(999);
//        inv1.setUnitPrice(0.99);
//        System.out.println(inv1); // Calls the toString() method again
//        System.out.println("id is: " + inv1.getId());
//        System.out.println("desc is: " + inv1.getDesc());
//        System.out.println("qty is: " + inv1.getQty());
//        System.out.println("unitPrice is: " + inv1.getUnitPrice());
//        System.out.println("The total is: " + inv1.getTotal());
//        //1.6Account
//        Account account1 = new Account("A101", "Tan Ah Teck", 88);
//        System.out.println(account1); // Calls the toString() method
//        Account account2 = new Account("A102", "Kumar");
//        System.out.println(account2);
//        System.out.println("ID: " + account1.getId());
//        System.out.println("Name: " + account1.getName());
//        System.out.println("Balance: " + account1.getBalance());
//        account1.credit(100);
//        System.out.println(account1);
//        account1.debit(50);
//        System.out.println(account1);
//        account1.debit(500);
//        System.out.println(account1);
//        account1.transferTo(account2, 100);
//        System.out.println(account1);
//        System.out.println(account2);
//        //1.7MyComplex
//        System.out.print("Enter complex number 1 (real and imaginary part): ");
//        double real1 = scanner.nextDouble();
//        double imag1 = scanner.nextDouble();
//        MyComplex complex1 = new MyComplex(real1, imag1);
//        System.out.print("Enter complex number 2 (real and imaginary part): ");
//        double real2 = scanner.nextDouble();
//        double imag2 = scanner.nextDouble();
//        MyComplex complex2 = new MyComplex(real2, imag2);
//
//        System.out.println("Number 1 is: " + complex1.toString());
//        System.out.println(complex1.toString() + " is " + (complex1.isReal() ?
//                "a pure real" : "NOT a pure real") + " number");
//        System.out.println(complex1.toString() + " is " + (complex1.isImaginary() ?
//                "a pure imaginary" : "NOT a pure imaginary") + " number");
//
//        System.out.println("\nNumber 2 is: " + complex2.toString());
//        System.out.println(complex2.toString() + " is " + (complex2.isReal() ?
//                "a pure real" : "NOT a pure real") + " number");
//        System.out.println(complex2.toString() + " is " + (complex2.isImaginary() ?
//                "a pure imaginary" : "NOT a pure imaginary") + " number");
//
//        System.out.println("\n" + complex1.toString() + " is " + (complex1.equals(complex2) ?
//                "equal to" : "NOT equal to") + " " + complex2.toString());
//        MyComplex additionResult = complex1.addNew(complex2);
//        System.out.println(complex1.toString() + " + " + complex2.toString() + " = "
//                + additionResult.toString());
//
//        MyComplex subtractionResult = complex1.subtractNew(complex2);
//        System.out.println(complex1.toString() + " - " + complex2.toString() + " = "
//                + subtractionResult.toString());
//        MyComplex multiplyResult = complex1.multiply(complex2);
//        System.out.println(complex1 + " * " + complex2 + " = " + multiplyResult);
//        MyComplex divideResult = complex1.divide(complex2);
//        System.out.println(complex1 + " / " + complex2 + " = " + divideResult);
//        System.out.println("\nConjugate of Number 1: " + complex1.conjugate());
//        System.out.println("Conjugate of Number 2: " + complex2.conjugate());

        //1.8
        System.out.println("Enter coefficients for Polynomial 1 (separated by spaces): ");
        double[] coeffs1 = readCoefficients(scanner);
        MyPolynomial polynomial1 = new MyPolynomial(coeffs1);
        System.out.println("Polynomial 1: " + polynomial1);
//        System.out.println("Enter coefficients for Polynomial 2 (separated by spaces): ");
////        double[] coeffs2 = readCoefficients(scanner);
//        MyPolynomial polynomial2 = new MyPolynomial(coeffs2);
//        System.out.println("Polynomial 2: " + polynomial2);
//        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
//        System.out.println("Degree of Polynomial 2: " + polynomial2.getDegree());
        double x = 2.0;
        System.out.println("Evaluation of Polynomial 1 at x=" + x + ": " + polynomial1.evaluate(x));
//        MyPolynomial sum = polynomial1.add(polynomial2);
//        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sum);
//        MyPolynomial product = polynomial1.multiply(polynomial2);
//        System.out.println("Product of Polynomial 1 and Polynomial 2: " + product);
    }
    private static double[] readCoefficients(Scanner scanner) {
        String input = scanner.nextLine();
        String[] coeffsStr = input.split(" ");

        double[] coeffs = new double[coeffsStr.length];
        for (int i = 0; i < coeffsStr.length; i++) {
            coeffs[i] = Double.parseDouble(coeffsStr[i]);
        }

        return coeffs;
    }

}
