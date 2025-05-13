package hus.oop.lab1;

import java.util.Scanner;

public class SumProductMinMax5 {
    public static void printSumAndProduct(int number1, int number2, int number3,int number4,int number5) {
        int sum = number1 + number2 + number3 + number4 + number5;
        int product = number1 * number2 * number3 * number4 * number5;
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
    }
    public static void printMinAndMax(int number1, int number2, int number3, int number4, int number5) {
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        if (number5 < min) {
            min = number5;
        }

        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
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
        System.out.print("Enter 4nd integer: ");
        int number4= sc.nextInt();
        System.out.print("Enter 5nd integer: ");
        int number5= sc.nextInt();
        printSumAndProduct(number1,number2,number3,number4,number5);
        printMinAndMax(number1,number2,number3,number4,number5);
    }
}
