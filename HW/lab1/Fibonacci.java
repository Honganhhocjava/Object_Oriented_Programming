package hus.oop.lab1;

public class Fibonacci {
    public static void calculateFibolacci(){
        int n=3;
        int fnMinusl = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinusl + fnMinus2;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print("1 1 ");
        int fn=1;
        while(n<=nMax){
            ++n;
            fnMinus2 = fnMinusl;
            fnMinusl = fn;
            fn = fnMinusl + fnMinus2;
            System.out.print(fn + " " );
            sum += fn;
        }
        double average = (double) sum / 20;
        System.out.println("\nThe average is " + average);
    }
    public static void main(String[] args){
        calculateFibolacci();
    }
}
