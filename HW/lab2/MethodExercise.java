package hus.oop.lab2;
import java.util.Scanner;
import java.util.Arrays;

public class MethodExercise {
    static Scanner sc;
    public static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
    public static void testExponent(Scanner in) {
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        int result = exponent(base, exp);
        System.out.println(base + " raises to the power of " + exp + " is: " + result);
    }
    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static int testMagicSum(Scanner in){
        int sum = 0 ;
        int num;
        do {
            System.out.println("Enter a positive integer ( or -1 to end): ");
            num = sc.nextInt();
            if(hasEight(num)){
                sum += num ;
            }
        }while (num!=-1);
            return sum;
    }
    public static int[] inputArray(Scanner sc){
        System.out.println("Enter the number of Array:");
        int number = sc.nextInt();
        int[] array = new int[number];
        for(int i = 0 ; i < number ; i ++){
            array[i] =  sc.nextInt();
        }
        return array;
    }
    public static void print(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static void testArray(){
        int[] array = inputArray(sc);
        if(array.length == 0){
            System.out.print("Empty Array: ");
        } else if (array.length == 1) {
            System.out.print("One-Element Array: ");
        }else {
            System.out.print("N-Element Array: ");
        }
        print(array);
    }
    public static String  arrayToString(int[] array){
        return Arrays.toString(array);
    }
    public static void testArrayToStr(){
        int[] array = inputArray(sc);
        if(array.length == 0){
            System.out.print("Empty Array: ");
        } else if (array.length == 1) {
            System.out.print("One-Element Array: ");
        }else {
            System.out.print("N-Element Array: ");
        }
        arrayToString(array);
        print(array);
    }
    public static boolean contains(int[] array , int key){
        for(int i = 0 ; i < array.length ; i++ ){
            if(array[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void testContains(){
        System.out.println("Enter the key :");
        int key = sc.nextInt();
        int[] array = inputArray(sc);
        boolean result = contains(array , key );
        System.out.println("Contains key " + key + ": " + result);
    }
    public static int search(int[] array , int key){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == key ){
                return array[i];
            }
        }
        return -1;
    }
    public static void testSearch(){
        System.out.println("Enter the key to search:");
        int key = sc.nextInt();
        int[] array = inputArray(sc);
        int result = search(array,key);
        if (result != -1) {
            System.out.println("Key " + key + " found at index " + result);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
    public static boolean equals(int[] array1 , int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i = 0 ; i < array1.length ; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
    public static void testEquals(){
        int[] array1 = inputArray(sc);
        int[] array2 = inputArray(sc);
        boolean result = equals(array1,array2);
        System.out.println("Arrays 1 and 2 are equal: " + result);
    }
    public static int[] copyOf(int[] array){
        int[] arr = new int[array.length];
        for(int i = 0 ; i < array.length ; i++){
            arr[i] = array[i] ;
        }
        return arr;
    }
    public static int[] copyOfUseInt(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        int length = Math.min(array.length, newLength);

        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static void printCopyOf(){
        int[] array = inputArray(sc);
        System.out.println("Enter the number of newLength:");
        int newLength = sc.nextInt();
        System.out.print("Array copyOf is: " );
        print(copyOf(array));
        System.out.print("Array copyOfUseInt is: " );
        print(copyOfUseInt(array,newLength));
    }
    public static boolean swap (int[] array1 , int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }
    public static void testSwap(){
        int[] array1 = inputArray(sc);
        int[] array2 = inputArray(sc);
        System.out.println("Before swapping:");
        System.out.println("Array1: ");
        print(array1);
        System.out.println("Array2: ");
        print(array2);
        boolean result = swap(array1,array2);
        System.out.println("after swapping:");
        System.out.println("newArray1: ");
        print(array1);
        System.out.println("newArray2: ");
        print(array2);
    }
    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0 ; i < array.length ; i++){
            newArray[i] = array[array.length -1 - i ];
        }
        return newArray;
    }
    public static void testReverse(){
        int[]  array = inputArray(sc);
        System.out.println("The newArray afer reversed: ");
        print(reverse(array));
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        testExponent(sc);
        System.out.println("The magic sum is: " + testMagicSum(sc));
        testArray();
        testArrayToStr();
        testContains();
        testSearch();
        testEquals();
        printCopyOf();
        testSwap();
        testReverse();

    }
}
