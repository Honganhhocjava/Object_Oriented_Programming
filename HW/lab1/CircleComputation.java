package hus.oop.lab1;
import java.util.Scanner;
public class CircleComputation {
    public static double calculateDiameter(double radius) {
        double diameter = 2.0 * radius;
        return diameter;
    }
    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    public static double calculateCircumference(double radius) {
        double circumference = 2.0 * Math.PI * radius;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("The diameter is: " + calculateDiameter(radius));
        System.out.println("The area is: " + calculateArea(radius));
        System.out.println("The circumference is: " + calculateCircumference(radius));
    }


}
