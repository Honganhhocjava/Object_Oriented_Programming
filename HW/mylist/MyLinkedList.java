package hus.oop.mylist;

import java.util.Currency;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
       return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        MyLinkedListNode currentNode = getNodeByIndex(index);
        return currentNode.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            // Xóa nút đầu tiên
            this.head = this.head.getNext();
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
        }

        this.size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (head == null) {
            head = new MyLinkedListNode(payload);
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(new MyLinkedListNode(payload));
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            MyLinkedListNode newNode = new MyLinkedListNode(payload);
            newNode.setNext(head);
            head = newNode;
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = previousNode.getNext();
            MyLinkedListNode newNode = new MyLinkedListNode(payload);
            previousNode.setNext(newNode);
            newNode.setNext(currentNode);
        }
        size++;

    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        MyLinkedListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }
}
