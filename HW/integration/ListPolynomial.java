package hus.oop.integration;

import java.util.List;
import java.util.ArrayList;
public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > coefficients.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        double powerOfX = 1;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * powerOfX;
            powerOfX *= x;
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            derivative.append(coefficients.get(i) * i);
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int maxSize = Math.max(this.coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double coeff1 = 0;
            if (i < this.coefficients.size()) {
                coeff1 = this.coefficients.get(i);
            }
            double coeff2 = 0;
            if (i < another.coefficients.size()) {
                coeff2 = another.coefficients.get(i);
            }
            result.append(coeff1 + coeff2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int maxSize = Math.max(this.coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double coeff1 = 0;
            if (i < this.coefficients.size()) {
                coeff1 = this.coefficients.get(i);
            }
            double coeff2 = 0;
            if (i < another.coefficients.size()) {
                coeff2 = another.coefficients.get(i);
            }
            result.append(coeff1 - coeff2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int totalDegree = this.degree() + another.degree();
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i <= totalDegree; i++) {
            double coeff = 0;
            for (int j = 0; j <= i; j++) {
                if (j < this.coefficients.size() && (i - j) < another.coefficients.size()) {
                    coeff += this.coefficients.get(j) * another.coefficients.get(i - j);
                }
            }
            result.append(coeff);
        }
        return result;
    }
}
