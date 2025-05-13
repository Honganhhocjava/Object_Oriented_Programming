package hus.oop.vector;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
       data = new double[DEFAULT_CAPACITY];
       size = 0 ;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double coordinate(int index) {
        return data[index];
    }

    @Override
    public double[] coordinates() {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i];
        }
        return result;
    }

    @Override
    public void set(double value, int index) {
        if ( index < 0 || index > size) {
            return;
        } else {
            for (int i = 0; i < data.length; i++) {
                data[index] = value;
            }
        }
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector mới.
     */
    public MyArrayVector add(double value) {
        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < size; i++) {
            result.data[i] = data[i] + value;
            result.size++;
        }
        return result;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector mới.
     */
    public MyArrayVector add(MyVector another) {
        if (this.size() != another.size()) {
            throw new IllegalArgumentException("Không cộng được hai vector");
        }
        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < this.size(); i++) {
            result.set(this.coordinate(i) + another.coordinate(i), i);
        }
        return result;
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) + value, i);
        }
        return this;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(MyVector another) {
        if (this.size() != another.size()) {
            System.out.println("Does'nt  add!");
        } else {
            for (int i = 0; i < this.size(); i++) {
                this.set(this.coordinate(i) + another.coordinate(i), i);
            }
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * @return vector mới.
     */
    public MyArrayVector minus(double value) {
        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < size; i++) {
            result.data[i] = data[i] - value;
            result.size++;
        }
        return result;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector mới.
     */
    public MyArrayVector minus(MyVector another) {
        if (size != another.size()) {
            throw new IllegalArgumentException("Vectors have different dimensions");
        }
        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < size; i++) {
            result.data[i] = data[i] - another.coordinate(i);
            result.size++;
        }
        return result;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(double value) {
        for (int i = 0; i < this.size(); i++) {
            this.set(this.coordinate(i) - value, i);
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(MyVector another) {
        if (this.size() != another.size()) {
            System.out.println("Does'nt  add!");
        } else {
            for (int i = 0; i < this.size(); i++) {
                this.set(this.coordinate(i) - another.coordinate(i), i);
            }
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public double dot(MyVector another) {
        if (this.size() != another.size()) {
            System.out.println("Không tính được");
            return 0;
        }
        double result = 0;
        for (int i = 0; i < this.size(); i++) {
            result += this.coordinate(i) * another.coordinate(i);
        }
        return result;
    }

    /**
     * Các phần tử của vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        for (int i = 0; i < this.size(); i++) {
            this.set(Math.pow(this.coordinate(i), power), i);
        }
        return this;
    }

    /**
     * Các phần tử của vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
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
            result += this.coordinate(i) * this.coordinate(i);
        }
        return Math.sqrt(result);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        if (size == data.length) {
            enlarge();
        }
        data[size] = value;
        size++;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        if (this.size() == this.data.length) {
            double[] temp = new double[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }
        for (int i = this.size(); i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = value;
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        if (index < 0 || index >= this.size()) {
            System.out.println("Không xóa được");
            return this;
        }
        for (int i = index; i < this.size() - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        MyArrayVector result = new MyArrayVector();
        for (int index : indices) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            result.insert(data[index]);
        }
        return result;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        int newCapacity = data.length * 2;
        double[] newData = new double[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
        return this;
    }
}
