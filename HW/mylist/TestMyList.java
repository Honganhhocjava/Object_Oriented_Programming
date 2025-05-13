package hus.oop.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Testing MyArrayList:");

        // Create a MyArrayList
        MyArrayList myList = new MyArrayList();
        myList.append(3.5);
        myList.append(7.2);
        myList.append(1.8);
        myList.append(5.4);

        // Perform statistical calculations
        BasicStatistic stat = new BasicStatistic(myList);
        double max = stat.max();
        double min = stat.min();
        double mean = stat.mean();
        double variance = stat.variance();

        // Print statistics
        System.out.println("Data in MyArrayList:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
        System.out.println();
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Testing MyLinkedList:");

        // Create a MyLinkedList
        MyLinkedList myList = new MyLinkedList();
        myList.append(3.5);
        myList.append(7.2);
        myList.append(1.8);
        myList.append(5.4);

        // Perform statistical calculations
        BasicStatistic stat = new BasicStatistic(myList);
        double max = stat.max();
        double min = stat.min();
        double mean = stat.mean();
        double variance = stat.variance();

        // Print statistics
        System.out.println("Data in MyLinkedList:");
        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }
}