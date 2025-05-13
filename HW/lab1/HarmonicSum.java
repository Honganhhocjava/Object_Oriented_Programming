package hus.oop.lab1;

public class HarmonicSum {
    static double sumL2R;
    static double sumR2L;
    public static void calculateSumL2R(){
        final int MAX_DENOMINATOR = 50000;
        sumL2R = 0.0;
        for(int denominator = 1 ; denominator <= MAX_DENOMINATOR; ++denominator){
            sumL2R = sumL2R + 1 / (double) denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
    }
    public static void calculateSumR2L(){
        final int MAX_DENOMINATOR = 50000;
        sumR2L = 0.0;
        for(int denominator = MAX_DENOMINATOR ; denominator >= 1; --denominator){
            sumR2L = sumR2L + 1 / (double) denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumR2L);
    }
    public static void findDifference(){
        double absDiff;
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println(absDiff);
    }
    public static void main(String[] args){
        calculateSumL2R();
        calculateSumR2L();
        findDifference();
    }
}
