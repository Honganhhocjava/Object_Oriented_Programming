package hus.oop;
import java.util.Scanner;
public class DRadixNToDecimal {
    public static void radixNToDecimal(String Str , int numberChangeToDecimal){
        int polyvalue = 0 ;
        for(int i = 0 ; i < Str.length() ; i++){
            char digit = Str.charAt(i);
            int digitValue = Character.digit(digit, numberChangeToDecimal);
            polyvalue = digitValue + numberChangeToDecimal* polyvalue;
        }
        System .out.print(polyvalue);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner((System.in));
        String Str = sc.nextLine();
        int numberChangToDecimal = sc.nextInt();
        radixNToDecimal(Str,numberChangToDecimal);
    }
}
