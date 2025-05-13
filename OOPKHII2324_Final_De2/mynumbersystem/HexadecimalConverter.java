package hus.oop.mynumbersystem;

public class HexadecimalConverter extends AbstractNumberSystemConverter {
    public HexadecimalConverter(ANumber aNumber) {
        super(aNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 16.
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 16.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        long decimalNumber = Long.parseLong(decimal);
        StringBuilder result = new StringBuilder();

        while (decimalNumber > 0) {
            long remainder = decimalNumber % 16;
            char hexDigit = (char) (remainder < 10 ? '0' + remainder : 'A' + remainder - 10);
            result.insert(0, hexDigit);
            decimalNumber /= 16;
        }

        return result.toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi.
     */
    @Override
    public void update(ANumber number) {
        super.update(number);
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(16).
     */
    @Override
    public void display() {
        System.out.println(convertedNumber + "(16)");
    }
}
