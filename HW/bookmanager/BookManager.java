package hus.oop.bookmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * Kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        for (int i = 0; i < limit; i++) {
            if(index == i ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPos(Book book, int index) {
        bookList.add(index,book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo title.
     * @return
     */
    public List<Book> sortIncreasingByTitle() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = Comparator.comparing(Book::getTitle);
        Collections.sort(sortedBooks, comparator);
        return sortedBooks;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title tăng dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingTitleAndPrice() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = (book1, book2) -> {
            int genreComparison = book1.getTitle().compareTo(book2.getTitle());
            if (genreComparison != 0) {
                return genreComparison;
            } else {
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        };
        Collections.sort(sortedBooks, comparator);
        return sortedBooks;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title giảm dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingTitleAndPrice() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = (book1, book2) -> {
            int genreComparison = book2.getTitle().compareTo(book1.getTitle());
            if (genreComparison != 0) {
                return genreComparison;
            } else {
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        };
        Collections.sort(sortedBooks, comparator);
        return sortedBooks;
    }

    /**
     * Sắp xếp book theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = Comparator.comparing(Book::getPrice);
        Collections.sort(sortedBooks, comparator);
        return sortedBooks;
    }

    /**
     * Sắp xếp book theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = Comparator.comparing(Book::getPrice);
        Collections.sort(sortedBooks, comparator.reversed());
        return sortedBooks;
    }

    /**
     * Sắp xếp book theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = Comparator.comparing(Book::getPages);
        Collections.sort(sortedBooks, comparator);
        return sortedBooks;
    }

    /**
     * Sắp xếp book theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        List<Book> sortedBooks = new LinkedList<>(bookList);
        Comparator<Book> comparator = Comparator.comparing(Book::getPrice);
        Collections.sort(sortedBooks, comparator.reversed());
        return sortedBooks;
    }

    /**
     * Lọc ra howMany book có giá lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPrice(int howMany) {
        List<Book> sortedBooks = sortDecreasingPages();
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < Math.min(howMany, sortedBooks.size()); i++) {
            result.add(sortedBooks.get(i));
        }

        return result;
    }

    public List<Book> filterLowestPrice(int howMany) {
        List<Book> sortedBooks = sortIncreasingPrice();
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < Math.min(howMany, sortedBooks.size()); i++) {
            result.add(sortedBooks.get(i));
        }

        return result;
    }

    /**
     * Lọc ra những book có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(double lowerBound) {
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() > lowerBound) {
                result.add(bookList.get(i));
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        List<Book> sortedBooks = sortIncreasingPages();
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < Math.min(howMany, sortedBooks.size()); i++) {
            result.add(sortedBooks.get(i));
        }

        return result;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() < upperBound) {
                result.add(bookList.get(i));
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getPublisher().equals(publisher)) {
                result.add(bookList.get(i));
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getGenre().equals(genre)) {
                result.add(bookList.get(i));
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        List<Book> result = new LinkedList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getAuthor().equals(author)) {
                result.add(bookList.get(i));
            }
        }
        return result;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
