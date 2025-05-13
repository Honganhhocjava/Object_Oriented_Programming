package hus.oop.mynumbersystem;

public abstract class AbstractNumberSystemConverter implements NumberSystemConverter {
    protected String convertedNumber;         // Số được chuyển đổi theo cơ số nào đó từ số gốc
    protected ANumber originalNumber;

    public AbstractNumberSystemConverter(ANumber aNumber) {
        /* TODO */
    }

    /**
     * Chuyển đổi số decimal từ hệ cơ số 10 thành số có hệ cơ số nào đó.
     * @param decimal
     * @return xâu ký tự biểu diễn một số trong hệ cơ số nào đó.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     *
     * Gợi ý: có thể sử dụng lớp trung gian BigInteger để thuận lợi hơn cho việc tính toán.
     */
    public abstract String decimalTo(String decimal);

    /**
     * Chuyển đổi số được biểu diễn trong originalNumber sang biểu diễn số trong hệ cơ số 10.
     * @return xâu ký tự biểu diễn một số trong hệ cơ số 10.
     *
     * Yêu cầu: sử dụng thuật toán Horner để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    public String toDecimal() {
        String number = originalNumber.getNumberPresentation();
        int radix = originalNumber.getRadix();
        long result = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int value;
            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else {
                value = 10 + Character.toLowerCase(digit) - 'a';
            }
            result = result * radix + value;
        }

        return Long.toString(result);
    }

    @Override
    public void update(ANumber number) {
        this.originalNumber = number;
        this.convertedNumber = decimalTo(toDecimal());
    }

    @Override
    public void display() {
        System.out.println(convertedNumber + "(" + originalNumber.getRadix() + ")");
    }
}
