package hus.oop.lab1;
import java.util.Scanner;

public class AverageWithInputValidation {
    public static double calculateAverage(){
        int numstudent = 3;
        int[] marks = new int[numstudent];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the mark for student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input, try again ...");
                System.out.print("Enter the mark (0-100) for student " + (i+1) + ": ");
                marks[i] = sc.nextInt();
            }
            sum += marks[i];
        }
        double average = (double) sum / 3;
        return average;
    }
    public static void main(String[] args) {
        System.out.printf("The average mark is %.2f", calculateAverage());
    }
}
