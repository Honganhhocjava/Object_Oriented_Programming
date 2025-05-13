package hus.oop.mynumbersystem;
import java.util.*;

public class NumberSystemTestDrive {
    public static void main(String[] args) {
        /* Yêu cầu:

        - Sinh ngẫu nhiên 3 số bằng cách:
            - Cơ số radix là một số tự nhiên khác 10 nằm trong đoạn [2, 16] được sinh ngẫu nhiên (nếu sinh ra 10 thì sinh lại).
            - Xâu ký tự biểu diễn số được sinh ra bằng cách:
                + Độ dài số là một số tự nhiên nằm trong đoạn [10, 30] được sinh ra ngẫu nhiên.
                + Mỗi chữ số được sinh ra bằng cách: sinh ra một chỉ số ngẫu nhiên nằm trong đoạn [0, radix - 1],
                  sau đó lấy tương ứng với chỉ số đó một chữ số nằm trong xâu "0123456789ABCDEF".

        - Mỗi lần sinh ra một số và một cơ số mới, thực hiện việc cập nhật và in ra các số được chuyển đổi
          tự động sang các số được biểu diễn trong hệ cơ số 2, 8, 16.

        - Thực hiện chạy chương trình để in ra terminal thông tin về các số ban đầu và các số chuyển đổi, ví dụ:
          Original number: 123456
          radix 12
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Original number: 456789
          radix 7
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_NumberSystemConverter>.txt (Ví dụ, NguyenVanA_123456_NumberSystemConverter.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_NumberSystemConverter>.zip (Ví dụ, NguyenVanA_123456_NumberSystemConverter.zip),
          nộp lên classroom.
         */
        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            int radix = random.nextInt(15) + 2;
            if (radix == 10) {
                radix = 11;
            }

            int number = random.nextInt(99999999) + 1;

            ANumber aNumber = new ANumber(String.valueOf(number), radix);

            BinaryConverter binaryConverter = new BinaryConverter(aNumber);
            OctalConverter octalConverter = new OctalConverter(aNumber);
            HexadecimalConverter hexadecimalConverter = new HexadecimalConverter(aNumber);
            
            System.out.println("Original number: " + number);
            System.out.println("radix " + radix);
            System.out.print("Binary: ");
            binaryConverter.display();
            System.out.print("Octal: ");
            octalConverter.display();
            System.out.print("Hexadecimal: ");
            hexadecimalConverter.display();
            System.out.println();
        }
    }
}
