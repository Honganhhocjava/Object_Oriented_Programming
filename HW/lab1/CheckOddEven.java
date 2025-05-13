package hus.oop.lab1;
import java.util.Scanner;
public class CheckOddEven {
    public static void checkOddEven(int number){
        System.out.println("The number is "+ number);
        if(number%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        System.out.println("Bye!");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkOddEven(number);
    }
}
