package hus.oop.exercises;
import java.util.Scanner;
public class ArrayHomework {
    static Scanner sc ;
    public static void printArrayInStars(Scanner in){
        int count = 0 ;
        System.out.print("Enter the number of items: ");
        final int numItems =  sc .nextInt();
        int[] items = new int[numItems];
        System.out.print("Enter the value of items ( separated by space ) : ");
        for(int idx = 0 ; idx < items.length ; idx ++){
            items [idx] =  sc.nextInt();
            System.out.print(idx + ": ");
            for(int starNo = 0 ; starNo < items[idx] ; starNo ++ ){
                System.out.print ("*");
            }
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }
    }
    public static void main (String[] args ){
        sc = new Scanner(System.in);
        printArrayInStars(sc);
    }

}
