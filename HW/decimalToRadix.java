package hus.oop;
import java.util.Scanner;
public class decimalToRadix {
    static Scanner sc;
    public static  void decimalToRadixN(int numberOfDecimal , int numberWantToChange ){
        StringBuilder Str = new StringBuilder();
        int polyvalue= 0 ;
        while (numberOfDecimal != 0) {
            polyvalue = numberOfDecimal % numberWantToChange;
            numberOfDecimal = numberOfDecimal / numberWantToChange;

            if (polyvalue < 10) {
                Str.insert(0, polyvalue);
            } else {
                Str.insert(0, (char) (polyvalue - 10 + 'A'));
            }
        }

        System.out.println(Str.toString());
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the base for conversion: ");
        int number2 = sc.nextInt();

        decimalToRadixN(number1, number2);

    }
}
