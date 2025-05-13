package hus.oop.vector;

public abstract class AbstractMyVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * @return
     */
    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("[");
        for (int i = 0; i < coordinates().length; i++) {
            build.append(coordinates()[i] + " ");
        }
        build.deleteCharAt(build.length() - 1);
        build.append("]");
        return build.toString();
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có các phần tử bằng nhau.
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        if (another == null || size() != another.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (coordinate(i) != another.coordinate(i)) {
                return false;
            }
        }
        return true;
    }
}