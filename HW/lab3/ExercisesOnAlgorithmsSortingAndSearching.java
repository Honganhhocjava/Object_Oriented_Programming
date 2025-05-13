package hus.oop.lab3;
import java.util.Scanner;
public class ExercisesOnAlgorithmsSortingAndSearching {
    static Scanner sc;
    //2.1
    public static int[] inputArray(int number){
        int[] Array = new int[number];
        for(int i = 0 ; i < Array.length ; i++){
            Array[i] = sc.nextInt();
        }
        return Array;
    }
    public static boolean linearSearch(int[] Array , int key){
        for(int i = 0 ; i < Array.length ; i++ ){
            if(Array[i] == key ) {
                return true;
            }
        }return false;
    }
    public static int linearSearchIndex(int[] Array , int key){
        for(int i = 0 ; i < Array.length ; i++ ){
            if(Array[i] == key ) {
                return i ;
            }
        }return 0;
    }
    public static void testLinerSearch(){
        System.out.print("Enter the number of Array: ");
        int number = sc.nextInt();
        int[] Array = inputArray(number);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        if(linearSearch(Array , key)){
            System.out.println("Key found in the array.");
        } else {
            System.out.println("Key not found in the array.");
        }
        if (linearSearchIndex(Array , key) != 0 ){
            System.out.println("Key found at index: " + linearSearchIndex(Array , key));
        }else{
            System.out.println("Key not found in the array.");
        }
    }

    //2.2
    public static int binarySearch(int[] Array, int key, int fromIdx, int toIdx) {
        if (toIdx >= fromIdx) {
            int mid = fromIdx + (toIdx - fromIdx) / 2;
            // Nếu phần tử có ở chính giữa
            if (Array[mid] == key)
                return mid;
            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (Array[mid] > key){
                return binarySearch(Array, key, fromIdx, mid );
            }
            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(Array, key, mid , toIdx);
        }
        return 0 ;
    }
    public static int binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }
    public static void testBinarySearch(){
        System.out.print("Enter the size: ");
        int number = sc.nextInt();
        int [] array = inputArray(number);
        int fromIdx = 0;
        int toIdx = array.length ;
        System.out.print("Enter the element you want to search: ");
        int key = sc.nextInt();
        System.out.print("Enter index you want to start the search engine: ");
        fromIdx = sc.nextInt();
        System.out.print("Enter index you want to stop the search engine: ");
        toIdx = sc.nextInt();
        System.out.println("Had found in limt: " + binarySearch(array, key, fromIdx, toIdx));
        System.out.println("Had found in array: " + binarySearch(array, key));

    }

    //2.3
    public static void bubbleSort(int[] array) {
        boolean swapped;
        int arrayLen = array.length;
        do {
            swapped = false;
            for (int i = 1; i < arrayLen; i++) {
                int temp = array[i - 1];
                if (array[i - 1] > array[i]) {
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            arrayLen--;
        } while (swapped);
    }
    public static void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
    public static void testBubberSort(){
        System.out.print("Enter the number of Array: ");
        int number = sc.nextInt();
        System.out.println("Unsorted Array: "  );
        int[] Array = inputArray(number);
        System.out.println("Sorted Array: ");
        bubbleSort(Array);
        printArray(Array);
    }
    //2.4
    public static void selectionSort(int[] Array){
        int n = Array.length;
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (Array[j] < Array[min_idx])
                    min_idx = j;
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = Array[min_idx];
            Array[min_idx] = Array[i];
            Array[i] = temp;
        }
    }
    public static void testSelectionSort(){
        System.out.print("Enter the number of Array: ");
        int number = sc.nextInt();
        System.out.println("Unsorted Array: "  );
        int[] Array = inputArray(number);
        System.out.println("Sorted Array: ");
        selectionSort(Array);
        printArray(Array);
    }
    //2.5
    public static void insertionSort(int[] Array){
        int n = Array.length;
        for (int i = 1; i < n; ++i) {
            int key = Array[i];
            int j = i - 1;
            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && Array[j] > key) {
                Array[j + 1] = Array[j];
                j = j - 1;
            }
            Array[j + 1] = key;
        }
    }
    public static void testInsertionSort(){
        System.out.print("Enter the number of Array: ");
        int number = sc.nextInt();
        System.out.println("Unsorted Array: "  );
        int[] Array = inputArray(number);
        System.out.println("Sorted Array: ");
        insertionSort(Array);
        printArray(Array);
    }
    public static void main (String[] args){
        sc = new Scanner(System.in);
        testLinerSearch();
        testBinarySearch();
        testBubberSort();
        testSelectionSort();
        testInsertionSort();
    }
}
