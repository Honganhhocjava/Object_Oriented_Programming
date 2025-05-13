package hus.oop.lab1;
import java.util.Scanner;
public class ReverseInt {
    public static void doReverseInt(int number){
        int reverseNumber=0;
        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse is: " + reverseNumber);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc .nextInt();
        doReverseInt(number);
    }

}
