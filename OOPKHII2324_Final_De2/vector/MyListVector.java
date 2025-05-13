package hus.oop.vector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        this.data = new ArrayList<>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        return data.get(index);
    }

    @Override
    public double[] coordinates() {
        double[] result = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i);
        }
        return result;
    }

    @Override
    public void set(double value, int index) {
        data.set(index,value);
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector mới.
     */
    public MyListVector add(double value) {
        MyListVector result = new MyListVector();
        for (double index : data) {
            result.data.add(index + value);
        }
        return result;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector mới.
     */
    public MyListVector add(MyVector another) {
        if (size() != another.size()) {
            throw new IllegalArgumentException("Vectors have different dimensions");
        }
        MyListVector result = new MyListVector();
        for (int i = 0; i < size(); i++) {
            result.data.add(data.get(i) + another.coordinate(i));
        }
        return result;
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector addTo(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) + value, i);
        }
        return this;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyListVector addTo(MyVector another) {
        if (this.size() != another.size()) {
            throw new IllegalArgumentException("Không cộng được hai vector");
        }
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) + another.coordinate(i), i);
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * @return vector mới.
     */
    public MyListVector minus(double value) {
        MyListVector result = new MyListVector();
        for (double index : data) {
            result.data.add(index - value);
        }
        return result;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector mới.
     */
    public MyListVector minus(MyVector another) {
        if (size() != another.size()) {
            throw new IllegalArgumentException("Vectors have different dimensions");
        }
        MyListVector result = new MyListVector();
        for (int i = 0; i < size(); i++) {
            result.data.add(data.get(i) - another.coordinate(i));
        }
        return result;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) - value, i);
        }
        return this;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(MyVector another) {
        if (this.size() != another.size()) {
            throw new IllegalArgumentException("Không cộng được hai vector");
        }
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) + another.coordinate(i), i);
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return tích vô hướng.
     */
    public double dot(MyVector another) {
        if (this.size() != another.size()) {
            throw new IllegalArgumentException("Không tính được tích vô hướng của hai vector");
        }
        double result = 0;
        for (int i = 0; i < this.size(); i++) {
            result += this.coordinate(i) * another.coordinate(i);
        }
        return result;
    }

    /**
     * Các phần tử vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        for (int i = 0; i < this.size(); i++) {
            this.set(Math.pow(this.coordinate(i), power), i);
        }
        return this;
    }

    /**
     * Các phần tử vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) * value, i);
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        double result = 0;
        for (int i = 0; i < this.size(); i++) {
            result += Math.pow(this.coordinate(i), 2);
        }
        return Math.sqrt(result);
    }

    /**
     * Thêm một giá trị value vào vector ở vị trí cuối cùng.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        data.add(value);
        return this;
    }

    /**
     * Thêm một giá trị vào vector ở vị trí index.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        data.add(index, value);
        return this;
    }

    /**
     * Xóa phần tử ở vị trí index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IllegalArgumentException("index not true");
        }
        data.remove(index);
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các phần tử
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có kiểu MyListVector có các phần tử được trích xuất từ vector hiện tại.
     */
    public MyListVector extract(int[] indices) {
        MyListVector result = new MyListVector();
        for (int index : indices) {
            if (index < 0 || index >= data.size()) {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            result.data.add(data.get(index));
        }
        return result;
    }
}
