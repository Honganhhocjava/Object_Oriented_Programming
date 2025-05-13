package hus.oop.lab3;
import java.util.Scanner;
public class ExercisesOnAlgorithmsNumberTheory {
    static Scanner sc;
    //3.1
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for(int i = 1;i <= (aPosInt/2) ; i++) {
            if( aPosInt % i == 0){
                sum+=i;
            }
        }
        if( sum == aPosInt ){
            return true;
        }
        return false;
    }
    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt ; i++) {
            if (aPosInt % i == 0) sum = sum + i;
        }
        if (sum < aPosInt) return true;
        return false;
    }
    public static void PerfectNumberList(){
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        int countPerfectNumber = 0 ;
        int countNeitherDeficientNorPerfectNum = 0;
        System.out.println("These number are perfect: ");
        for(int i = 1 ; i <= upperBound ; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfectNumber++;
            }
        }
        System.out.println();
        System.out.println("[" + countPerfectNumber + " perfect numbers found ("
                    + countPerfectNumber / (double) upperBound * 100.00 + "%)]");
        System.out.print("These number are neither deficient nor perfect: ");
        for(int i = 1 ; i <= upperBound ; i++) {
            if (isPerfect(i) == false && isDeficient(i) == false) {
                System.out.print(i + " ");
                countNeitherDeficientNorPerfectNum++;
            }
        }
        System.out.println();
        System.out.println("[" + countNeitherDeficientNorPerfectNum + " perfect numbers found ("
                    + countNeitherDeficientNorPerfectNum / (double) upperBound * 100.00 + "%)]");
    }
    //3.2
    public static boolean isPrime(int upperBound){
        if(upperBound < 2){
            return false;
        }
        for(int i = 2 ;i <= Math.sqrt(upperBound) ; i++){
            if(upperBound % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeList(){
        System.out.print("Please enter the upper bound:");
        int upperBound = sc.nextInt();
        int countPrimeNum = 0 ;
        for(int i = 1 ; i <= upperBound ; i++){
            if(isPrime(i)){
                System.out.println(i);
                countPrimeNum++;
            }
        }
        System.out.println("[" + countPrimeNum + " prime numbers found ("
                + countPrimeNum / (double) upperBound * 100.00 + "%)]");

    }
    //3.3
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int sum = 1;
        for (int i = 2 ; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                sum *= i;
            }
        }
        if( sum == aPosInt ){
            return true;
        }
        return false;
    }
    public static void PerfectPrimeFactorList() {
        System.out.println("Enter the upper bound: ");
        int aPosInt = sc.nextInt();
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int i = 2; i < aPosInt; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("[" + count + " prime numbers found ("
                + count / (double) aPosInt * 100.00 + "%)]");
    }
    //3.4
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd( b , a%b);
    }
    public static void testGcd(){
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        System.out.println("GCD of " + firstNum + " and " + secondNum + " is: " +gcd(firstNum, secondNum));
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        PerfectNumberList();
        PrimeList();
        PerfectPrimeFactorList();
        testGcd();
    }
}
