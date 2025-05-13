package hus.oop.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        coefficents = new double[10];
        this.size = 0;
    }


    /**
     * Lấy hệ số của đa thức tại phần tử index
     *
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     *
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = coefficents[i];
        }
        return result;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     *
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        // Kiểm tra xem mảng đã đầy chưa, nếu đầy thì tăng kích thước của mảng
        if (size == coefficents.length) {
            double[] newArray = new double[coefficents.length * 2];
            System.arraycopy(coefficents, 0, newArray, 0, size);
            coefficents = newArray;
        }

        // Thêm hệ số mới vào cuối của mảng
        coefficents[size++] = coefficient;

        return this; // Trả về chính đối tượng ArrayPolynomial
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (size == coefficents.length) {
            enlarge();
        }
        System.arraycopy(coefficents, index, coefficents, index + 1, size - index);
        coefficents[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     *
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= coefficents.length) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        coefficents[index] = coefficient;

        return this;
    }

    /**
     * Lấy bậc của đa thức.
     *
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        for (int i = coefficents.length - 1; i >= 0; i--) {
            if (coefficents[i] == 0) {
                return size - 1;
            }
            size--;
        }
        return 0;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     *
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0.0;
        int temp = 1;
        int degree = degree();
        for (int i = 0; i <= degree; i++) {
            result += coefficents[i] * temp;
            temp *= x;
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     *
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        double[] derivedCoefficients = new double[coefficents.length - 1];
        for (int i = 1; i < coefficents.length; i++) {
            derivedCoefficients[i - 1] = coefficents[i] * i;
        }
        this.coefficents= derivedCoefficients;
        return this;
    }
    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        double[] resultAdd = new double[Math.max(coefficents.length, another.coefficents.length)];
        int maxDegree = Math.max(this.degree(), another.degree());

        for (int i = 0; i <= maxDegree; i++) {
            resultAdd[i] = this.coefficient(i) + another.coefficient(i);
        }

        for (int i = maxDegree + 1; i < this.degree(); i++) {
            resultAdd[i] = this.coefficient(i);
        }

        for (int i = maxDegree + 1; i < another.degree(); i++) {
            resultAdd[i] = another.coefficient(i);
        }

        this.coefficents = resultAdd;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        double[] resultMinus = new double[coefficents.length * 2];
        int thisDegree = this.degree();
        int otherDegree = another.degree();

        for (int i = 0; i <= Math.min(thisDegree,otherDegree); i++) {
            resultMinus[i] = this.coefficient(i) - another.coefficient(i);
        }

        for (int i = Math.min(thisDegree,otherDegree) + 1 ; i <= thisDegree; i++) {
            resultMinus[i] = this.coefficient(i);
        }

        for (int i = Math.min(thisDegree,otherDegree) + 1 ; i <= otherDegree ; i++) {
            resultMinus[i] = - another.coefficient(i);
        }
        this.coefficents = resultMinus;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        double[] result = new double[coefficents.length * 2];
        int thisDegree = this.degree();
        int otherDegree = another.degree();

        for (int i = 0; i <= Math.min(thisDegree,otherDegree); i++) {
            result[i] = this.coefficient(i) * another.coefficient(i);
        }

        for (int i = Math.min(thisDegree,otherDegree) + 1 ; i <= thisDegree; i++) {
            result[i] = this.coefficient(i);
        }

        for (int i = Math.min(thisDegree,otherDegree) + 1 ; i <= otherDegree ; i++) {
            result[i] = another.coefficient(i);
        }
        this.coefficents = result;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
       if(size == coefficents.length) {
           double[] result =  new double[coefficents.length * 2];
           System.arraycopy(coefficents,0,result,0,size);
           coefficents = result;
       }
    }
}
