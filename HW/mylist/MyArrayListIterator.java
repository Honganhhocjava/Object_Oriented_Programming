package hus.oop.mylist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayListIterator implements MyIterator {
    /* GỢI Ý: */
    /*
    MyArrayListIterator cần phải tham chiếu đến dữ liệu của MyArrayList để có thể duyệt qua
    các phần tử trong dữ liệu của MyArrayList.
     */
    private Object[] data;

    /*
    MyArrayListIterator cần phải biết vị trí hiện tại khi nó đang duyệt qua dữ liệu của MyArrayList.
     */
    private int currentPosition;

    /**
     * Khởi tạo dữ liệu cho Iterator bằng dữ liệu của MyArrayList để nó có thể duyệt qua các phần tử dữ liệu
     * của MyArrayList.
     * @param data
     */
    public MyArrayListIterator(Object[] data) {
        this.data = data;
    }

    /**
     * Kiểm tra trong MyArrayList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return
     */
    @Override
    public boolean hasNext() {
       if(data[currentPosition + 1] != null ) {
           return true;
       }
       return false;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của MyArrayList và trả ra phần tử hiện tại của MyArrayList.
     * @return phần tử hiện tại.
     */
    @Override
    public Object next() {
        if (hasNext()) {
            Object element = data[currentPosition];
            currentPosition++;
            return element;
        }
        throw new NoSuchElementException();
    }
}
