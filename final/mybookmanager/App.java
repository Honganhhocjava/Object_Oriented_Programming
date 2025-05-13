package hus.oop.mybookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        init();
        System.out.println("testOriginalData : ");
        testOriginalData();
        System.out.println();
        System.out.println("testFilterBooksOfAuthor: ");
        testFilterBooksOfAuthor();
        System.out.println();
        System.out.println("testFilterBooksOfPublisher : ");
        testFilterBooksOfPublisher();

        System.out.println();
        System.out.println("testFilterBooksOfGenre : ");
        testFilterBooksOfGenre();

        System.out.println();
        System.out.println("testGetHighestPriceBook : ");
        testGetHighestPriceBook();

        System.out.println();
        System.out.println("testGetLowestPriceBook : ");
        testGetLowestPriceBook();

        System.out.println();
        System.out.println("testGetHighestNumberOfPagesBook : ");
        testGetHighestNumberOfPagesBook();

        System.out.println();
        System.out.println("testGetLowestNumberOfPagesBook : ");
        testGetLowestNumberOfPagesBook();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_MyBookManager>.txt (Ví dụ, NguyenVanA_123456_MyBookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookMyManager>.zip (Ví dụ, NguyenVanA_123456_BookMyManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));
            BookManager bookManager = BookManager.getInstance();

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                String title = dataList.get(0);
                String author = dataList.get(1);
                String genre = dataList.get(2);
                int pages = Integer.parseInt(dataList.get(3));
                double price = Double.parseDouble(dataList.get(4));
                String publisher = dataList.get(5);

                Book newBook = new Book.BookBuilder(title)
                        .withAuthor(author)
                        .withGenre(genre)
                        .withPublisher(publisher)
                        .withPrice(price)
                        .withPages(pages)
                        .build();

                bookManager.insertAtEnd(newBook);

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        MyList books = BookManager.getInstance().getBookList();
        MyIterator iterator = books.iterator(0);
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        BookManager bookManager = BookManager.getInstance();
        MyList filteredBooks = bookManager.filterBooksOfAuthor("Cormen Thomas");
        MyIterator iterator = filteredBooks.iterator(0);
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Books by Author Cormen Thomas : " + book);
        }
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        BookManager bookManager = BookManager.getInstance();
        MyList filteredBooks = bookManager.filterBooksOfPublisher("Wiley");
        MyIterator iterator = filteredBooks.iterator(0);
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Books by Publisher Wiley : " + book);
        }
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        BookManager bookManager = BookManager.getInstance();
        MyList filteredBooks = bookManager.filterBooksOfGenre("signal_processing");
        MyIterator iterator = filteredBooks.iterator(0);
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Books by Genre (signal_processing) : " + book);
        }
    }

    /**
     * Test lấy ra sách có giá cao nhất.
     */
    public static void testGetHighestPriceBook() {
        BookManager bookManager = BookManager.getInstance();
        Book highestPriceBook = bookManager.highestPriceBook();
        if (highestPriceBook != null) {
            System.out.println("Highest price book: " + highestPriceBook.getTitle() + " - price : " + highestPriceBook.getPrice());
        } else {
            System.out.println("No books available.");
        }
    }

    /**
     * Test lấy ra sách có giá thấp nhất.
     */
    public static void testGetLowestPriceBook() {
        BookManager bookManager = BookManager.getInstance();
        Book lowestPriceBook = bookManager.lowestPriceBook();
        if (lowestPriceBook != null) {
            System.out.println("Lowest price book: " + lowestPriceBook.getTitle() + " - price : " + lowestPriceBook.getPrice());
        } else {
            System.out.println("No books available.");
        }
    }

    /**
     * Test lấy ra sách có số trang cao nhất.
     */
    public static void testGetHighestNumberOfPagesBook() {
        BookManager bookManager = BookManager.getInstance();
        Book highestPageBook = bookManager.highestNumberOfPagesBook();
        if (highestPageBook != null) {
            System.out.println("Lowest price book: " + highestPageBook.getTitle() + " - pages : " + highestPageBook.getPages());
        } else {
            System.out.println("No books available.");
        }
    }

    /**
     * Test lấy ra sách có số trang thấp nhất.
     */
    public static void testGetLowestNumberOfPagesBook() {
        BookManager bookManager = BookManager.getInstance();
        Book lowestPageBook = bookManager.lowestNumberOfPagesBook();
        if (lowestPageBook != null) {
            System.out.println("Lowest price book: " + lowestPageBook.getTitle() + " - pages : " + lowestPageBook.getPages());
        } else {
            System.out.println("No books available.");
        }
    }
}
