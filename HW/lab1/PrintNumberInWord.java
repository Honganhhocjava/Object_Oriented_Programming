package hus.oop.lab1;
import java.util.Scanner;
public class PrintNumberInWord {
    public static void printNumberUsingIf(int n){
        if(n==1){
            System.out.println("ONE");
        }
        else if(n==2){
            System.out.println("TWO");
        }
        else if(n==3){
            System.out.println("THREE");
        }
        else if(n==4){
            System.out.println("FOUR");
        }
        else if(n==5){
            System.out.println("FIVE");
        }
        else if(n==6){
            System.out.println("SIX");
        }
        else if(n==7){
            System.out.println("SEVEN");
        }
        else if(n==8){
            System.out.println("EIGHT");
        }
        else if(n==9){
            System.out.println("NINE");
        }
        else{
            System.out.println("OTHER");
        }
    }
    public static void printNumberUsingSwitchCase(int m){
        switch (m) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FINE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNumberUsingIf(number);
        printNumberUsingSwitchCase(number);

    }

}
