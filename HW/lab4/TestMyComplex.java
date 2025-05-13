package hus.oop.lab4;
import java.util.Scanner;
public class TestMyComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1.toString());
        System.out.println(complex1.toString() + " is " + (complex1.isReal() ?
                "a pure real" : "NOT a pure real") + " number");
        System.out.println(complex1.toString() + " is " + (complex1.isImaginary() ?
                "a pure imaginary" : "NOT a pure imaginary") + " number");

        System.out.println("\nNumber 2 is: " + complex2.toString());
        System.out.println(complex2.toString() + " is " + (complex2.isReal() ?
                "a pure real" : "NOT a pure real") + " number");
        System.out.println(complex2.toString() + " is " + (complex2.isImaginary() ?
                "a pure imaginary" : "NOT a pure imaginary") + " number");

        System.out.println("\n" + complex1.toString() + " is " + (complex1.equals(complex2) ?
                "equal to" : "NOT equal to") + " " + complex2.toString());
        MyComplex additionResult = complex1.addNew(complex2);
        System.out.println(complex1.toString() + " + " + complex2.toString() + " = "
                + additionResult.toString());

        MyComplex subtractionResult = complex1.subtractNew(complex2);
        System.out.println(complex1.toString() + " - " + complex2.toString() + " = "
                + subtractionResult.toString());
        MyComplex multiplyResult = complex1.multiply(complex2);
        System.out.println(complex1 + " * " + complex2 + " = " + multiplyResult);
        MyComplex divideResult = complex1.divide(complex2);
        System.out.println(complex1 + " / " + complex2 + " = " + divideResult);
        System.out.println("\nConjugate of Number 1: " + complex1.conjugate());
        System.out.println("Conjugate of Number 2: " + complex2.conjugate());
    }
}
