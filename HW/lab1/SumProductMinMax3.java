package hus.oop.lab1;
import java.util.Scanner;
public class SumProductMinMax3 {
    public static void printSumAndProduct(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        int product = number1 * number2 * number3;
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
    }
    public static void printMinAndMax(int number1, int number2, int number3) {
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1= sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2= sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3= sc.nextInt();
        printSumAndProduct(number1,number2,number3);
        printMinAndMax(number1,number2,number3);
    }
}
