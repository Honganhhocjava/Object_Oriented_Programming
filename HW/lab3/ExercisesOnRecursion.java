package hus.oop.lab3;
import java.util.Scanner;
public class ExercisesOnRecursion {
    static Scanner sc ;
    //1.1
    public static int factorial( int n ){
        if( n == 0){
            return 1;
        }return n * factorial( n - 1);
    }
    public static void testFactorial(){
        System.out.print(" Enter the number: ");
        int number =  sc.nextInt();
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
    //1.2
    public static int fibonacci(int n ){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }return fibonacci( n - 1 ) + fibonacci( n - 2);
    }
    public static void testFibonacci(){
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        System.out.println(" Fibonacci of " + number + " is: " + fibonacci(number));
    }
    //1.3
    public static String computerLen( int number ){
        if(number == 1){
            return "1";
        } return computerLen(number - 1 ) + (number) ;
    }
    public static void testComputerLen(){
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        System.out.println("S(" + number + ")" + " = " + computerLen(number)
                + " length is : " + computerLen(number).length());
    }
    //1.4
    public static int gcd(int firstNumber , int secondNumber ){
        if( secondNumber == 0 ){
            return Math.abs(firstNumber);
        } return gcd(secondNumber , firstNumber % secondNumber);
    }
    public static void testGcd(){
        System.out.print("Enter th firstNumber: ");
        int firstNumber =  sc.nextInt();
        System.out.print("Enter th secondNumber: ");
        int secondNumber =  sc.nextInt();
        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd(firstNumber,secondNumber));
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        testFactorial();
        testFibonacci();
        testComputerLen();
        testGcd();
    }
}
