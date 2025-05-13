package hus.oop.lab1;

public class SumAverageRunningInt {
    public static void sumAverageRunningIntUsingForLoop(){
        int sum =0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int count=0;
        for(int number = LOWERBOUND; number <= UPPERBOUND; number++){
            sum = sum +number;
            ++count;
        }
        double average = (double) sum/((UPPERBOUND-LOWERBOUND)/1+1);
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average );
    }
    public static void sumAverageRunningIntUsingDoWhile(){
        int sum =0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;
        do {
            sum= sum+number;
            ++number;
        } while(number<=UPPERBOUND);
            double average = (double) sum/((UPPERBOUND-LOWERBOUND)/1+1);
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average );
    }
    public static void sumAverageRunningIntUsingWhileDo(){
        int sum =0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;
        while(number <= UPPERBOUND ){
            sum = sum + number;
            ++number;
        }
        double average = (double) sum/((UPPERBOUND-LOWERBOUND)/1+1);
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average );
    }
    public static void main(String[] args){
        sumAverageRunningIntUsingForLoop();
        sumAverageRunningIntUsingDoWhile();
        sumAverageRunningIntUsingWhileDo();
    }
}
