package hus.oop.lab1;

public class ComputePI {
    public static void calculateComputePIWithFor(){
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for(int denominator = 1 ; denominator <= MAX_DENOMINATOR  ;denominator+=2){
            if(denominator % 4 ==1){
                sum = sum + 1/(double) denominator;
            }else if(denominator % 4 ==3){
                sum = sum - 1/(double) denominator;
            }else{
                System.out. println ("Impossible !!!");
            }
        }
        double compareWithMathPi = (double) Math.round(((4 * sum) / Math.PI) * 10000) / 100 ;
        System.out.println("The PI is: " + (4 * sum));
        System.out.println("Accuracy percentage: " + compareWithMathPi + "%");
    }
    public static void calculateComputePIWithMaxTerm(){
        int MAX_TERM = 10000;
        double sum = 1.0;
        for(int term = 1; term <= MAX_TERM; term ++){
            if (term % 2 == 1) {
                sum += 1.0/ (term * 2 - 1);
            } else {
                sum -= 1.0/ (term * 2 - 1);
            }
        }
        double compareWithMathPi = (double) Math.round(((4 * sum) / Math.PI) * 10000) / 100 ;
        System.out.println("The PI is: " + (4 * sum));
        System.out.println("Accuracy percentage: " + compareWithMathPi + "%");
    }
    public static void main(String[] args){
        calculateComputePIWithFor();
        calculateComputePIWithMaxTerm();
    }
}
