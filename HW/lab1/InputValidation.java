package hus.oop.lab1;
import java.util.Scanner;

public class InputValidation {
    public static void inputValidation(int numberIn) {
        boolean isValid = false;
        while (!isValid) {
            if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number, between 0-10 or 90-100: ");
                numberIn = sc.nextInt(); // Prompt user to enter a new number
            }
        }
        System.out.println("You have entered: " + numberIn);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number, between 0-10 or 90-100: ");
        int numberIn = sc.nextInt();
        inputValidation(numberIn);
    }
}