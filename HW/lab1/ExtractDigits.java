package hus.oop.lab1;
import java.util.Scanner;
public class ExtractDigits {
    public static void doExtractDigits(int number){
        while(number >0){
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number /10;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc .nextInt();
        doExtractDigits(number);
    }
}
