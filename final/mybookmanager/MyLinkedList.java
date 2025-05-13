package hus.oop.mybookmanager;

import java.util.NoSuchElementException;

public class MyLinkedList extends AbstractMyList {
    private Node head;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            this.currentPosition =  start ;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size();
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException();
            }
            Node currentNode = getNodeByIndex(currentPosition);
            currentPosition++;
            return currentNode.data;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        head = null ;
    }

    @Override
    public int size() {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        if (checkBoundaries(index, count)) {
            Node node = getNodeByIndex(index);
            node.data = data;
        } else {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        count++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node curNode = getNodeByIndex(count - 1);
            curNode.next = newNode;
        }
        count++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        if (index < 0 || index > count) {
            return;
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index == count) {
            Node previousNode = getNodeByIndex(count - 1);
            previousNode.next = newNode;
        } else {
            Node previousNode = getNodeByIndex(index - 1);
            Node curNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = curNode;
        }
        count++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        if (index < 0 || index >= count) {
            return;
        }
        if (index == 0) {
            if (head == null) {
                return;
            }
            head = head.next;
            count--;
            return;
        }
        Node preNode = getNodeByIndex(index - 1);
        if (preNode == null || preNode.next == null) {
            return;
        }
        preNode.next = preNode.next.next;
        count--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        int count = 0 ;
        Node currentNode = head ;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public MyIterator iterator(int start) {
        return new MyLinkedListIterator(start);
    }
}
