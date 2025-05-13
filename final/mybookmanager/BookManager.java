package hus.oop.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public MyList getBookList() {
        return bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        if (index < 0 || index > bookList.size()) {
            throw new IndexOutOfBoundsException();
        }
        bookList.insertAtPosition(book,index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index > bookList.size()) {
            throw new IndexOutOfBoundsException();
        } else {
            bookList.remove(index);
        }
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        MyIterator iterator = bookList.iterator(0);
        int currentIndex = 0;
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentIndex == index) {
                return currentBook;
            }
            currentIndex++;
        }
        throw new IndexOutOfBoundsException("Invalid index.");
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        if (bookList.size() == 0) {
            return null;
        }
        MyIterator iterator = bookList.iterator(0);
        Book highestPriceBook = (Book) iterator.next();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPrice() > highestPriceBook.getPrice()) {
                highestPriceBook = currentBook;
            }
        }
        return highestPriceBook;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        if (bookList.size() == 0) {
            return null;
        }
        MyIterator iterator = bookList.iterator(0);
        Book lowestPriceBook = (Book) iterator.next();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPrice() < lowestPriceBook.getPrice()) {
                lowestPriceBook = currentBook;
            }
        }
        return lowestPriceBook;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        if (bookList.size() == 0) {
            return null;
        }
        MyIterator iterator = bookList.iterator(0);
        Book highestPagesBook = (Book) iterator.next();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPages() > highestPagesBook.getPages()) {
                highestPagesBook = currentBook;
            }
        }
        return highestPagesBook;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        if (bookList.size() == 0) {
            return null;
        }
        MyIterator iterator = bookList.iterator(0);
        Book lowestPagesBook = (Book) iterator.next();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPages() < lowestPagesBook.getPages()) {
                lowestPagesBook = currentBook;
            }
        }
        return lowestPagesBook;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        MyList filteredList = new MyLinkedList();
        MyIterator iterator = bookList.iterator(0);
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPublisher().equalsIgnoreCase(publisher)) {
                filteredList.insertAtEnd(currentBook);
            }
        }
        return filteredList;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        MyList filteredList = new MyLinkedList();
        MyIterator iterator = bookList.iterator(0);
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getGenre().equalsIgnoreCase(genre)) {
                filteredList.insertAtEnd(currentBook);
            }
        }
        return filteredList;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        MyList filteredList = new MyLinkedList();
        MyIterator iterator = bookList.iterator(0);
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getAuthor().equalsIgnoreCase(author)) {
                filteredList.insertAtEnd(currentBook);
            }
        }
        return filteredList;
    }
}
