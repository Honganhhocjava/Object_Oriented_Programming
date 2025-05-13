package hus.oop.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     *
     * @return giá trị lớn nhất.
     */
    public double max() {
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty.");
        }

        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty.");
        }

        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty.");
        }

        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            sum += value;
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty.");
        }

        double mean = mean();
        double sumSquaredDiff = 0;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            double diff = value - mean;
            sumSquaredDiff += diff * diff;
        }
        return sumSquaredDiff / data.size();
    }
}