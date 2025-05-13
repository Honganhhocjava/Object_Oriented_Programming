package hus.oop.vector;

import java.util.Random;

public class TestVector {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10) + 1; // Sinh số từ 1 đến 10

        // Tạo các vector
        MyArrayVector arrayVector1 = new MyArrayVector();
        MyArrayVector arrayVector2 = new MyArrayVector();
        MyListVector listVector1 = new MyListVector();
        MyListVector listVector2 = new MyListVector();

        // Thêm các phần tử ngẫu nhiên vào các vector
        for (int i = 0; i < n; i++) {
            double value = random.nextDouble() * 100; // Sinh giá trị từ 0 đến 100
            arrayVector1.insert(value);
            arrayVector2.insert(value);
            listVector1.insert(value);
            listVector2.insert(value);
        }

        // In các vector ban đầu
        System.out.println("Vector 1 (MyArrayVecto): " + arrayVector1.toString());
        System.out.println("Vector 2 (MyArrayVecto): " + arrayVector2.toString());
        System.out.println("Vector 1 (MyListVector): " + listVector1.toString());
        System.out.println("Vector 2 (MyListVector): " + listVector2.toString());
        System.out.println();

        // Cộng hai vector
        MyArrayVector sumArrayListVector = arrayVector1.add(arrayVector2);
        MyListVector sumListVector = listVector1.add(listVector2);
        System.out.println("TestPlus (MyArrayVecto): " + sumArrayListVector.toString());
        System.out.println("TestPlus (MyListVector): " + sumListVector.toString());
        System.out.println();

        // Tính tích vô hướng của hai vector
        double dotProductArrayList = arrayVector1.dot(arrayVector2);
        double dotProductList = listVector1.dot(listVector2);
        System.out.println("TestDot (MyArrayVecto): " + dotProductArrayList);
        System.out.println("TestDot (MyListVector): " + dotProductList);
        System.out.println();

        // Nhân vector 1 với một hệ số vô hướng
        double scalar = random.nextDouble() * 10; // Sinh hệ số vô hướng từ 0 đến 10
        MyArrayVector scaledArrayVector = arrayVector1.scale(scalar);
        MyListVector scaledListVector = listVector1.scale(scalar);
        System.out.println("testScaled (MyArrayVecto)  " + scalar + ": " + scaledArrayVector.toString());
        System.out.println("testScaled (MyListVector)  " + scalar + ": " + scaledListVector.toString());
        System.out.println();

        // Tính chuẩn của vector 2 (MyArrayList)
        double normArrayList2 = arrayVector2.norm();
        System.out.println("testNorm vector 2 (MyArrayVecto): " + normArrayList2);
        System.out.println();

        // Thêm một phần tử vào vị trí index = 2 của vector 1
        double newValue = random.nextDouble() * 100; // Sinh giá trị mới
        arrayVector1.insert(newValue, 2);
        listVector1.insert(newValue, 2);
        System.out.println("Vector 1 after add index = 2: (MyArrayVecto) " + arrayVector1.toString());
        System.out.println("Vector 1 after add index = 2: (MyListVecto) " + listVector1.toString());
        System.out.println();

        // Xóa phần tử ở index = 0 của vector 2
        arrayVector2.remove(0);
        listVector2.remove(0);
        System.out.println("Vector 2 after remove index = 0: (MyArrayVecto) " + arrayVector2.toString());
        System.out.println("Vector 2 after remove index = 0: (MyListVecto) " + listVector2.toString());
        System.out.println();

        // Sửa giá trị của phần tử ở index = 1 của vector 1
        double updatedValue = random.nextDouble() * 100; // Sinh giá trị mới
        arrayVector1.set(updatedValue, 1);
        listVector1.set(updatedValue, 1);
        System.out.println("Vector 1 after update index = 1:  (MyArrayVecto) " + arrayVector1.toString());
        System.out.println("Vector 1 after update index = 1: (MyListVecto) " + listVector1.toString());
        System.out.println();

        // Tính chuẩn của vector 1 (MyArrayList)
        double normArrayList = arrayVector1.norm();
        System.out.println("testNorm vector 1 (MyArrayVecto): " + normArrayList);


        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Sinh ngẫu nhiên một số tự nhiên, lưu giá trị sinh ra vào biến n.
           - Tạo ra các vector có kích thước n, với các phần tử được sinh ngẫu nhiên. Trong đó có 2 vector kiểu MyArrayList
             và 2 vector có kiểu MyListVector.
           - Viết các hàm để test các chứ năng của các vector, như thêm vào phần tử, xóa bớt phần tử, sửa giá trị các
             phần tử, cộng các vector, nhân vector với vô hướng, tích vô hướng 2 vector, chuẩn vector, ... Mỗi lần thay
             đổi vector hoặc tính toán, in kết quả ra terminal.

         II. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt). Nén các file source code và file kết quả vào file zip có tên
              <Ten_MaSinhVien_Vector>.zip (ví dụ NguyenVanA_123456_Vector.zip), nộp lên classroom.
         */
    }
}
