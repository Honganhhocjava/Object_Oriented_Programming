package hus.oop.lab1;
public class Factorial {
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
        public static void main (String[] args){
            int n = 20;
            long result = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is " + result);
        }
}
