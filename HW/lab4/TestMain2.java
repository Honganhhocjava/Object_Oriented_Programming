package hus.oop.lab4;

public class TestMain2 {
        public static void main(String[] args) {
            //testAuthor
            Author ahTeck1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
            System.out.println(ahTeck1.toString());
            ahTeck1.setEmail("paulTan@nowhere.com");
            System.out.println("Name is: " + ahTeck1.getName());
            System.out.println("Email is: " + ahTeck1.getEmail());
            System.out.println("Gender is: " + ahTeck1.getGender());
            //test 2.1
            Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
            System.out.println(ahTeck.toString());
            Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
            System.out.println(dummyBook.toString());
            dummyBook.setPrice(29.95);
            dummyBook.setQty(28);
            System.out.println("Name is: " + dummyBook.getName());
            System.out.println("Price is: " + dummyBook.getPrice());
            System.out.println("Qty is: " + dummyBook.getQty());
            System.out.println("Author is: " + dummyBook.getAuthor()); // Author’s toString()
            System.out.println("Author’s name is: " + dummyBook.getAuthor().getName());
            System.out.println("Author’s email is: " + dummyBook.getAuthor().getEmail());
            Book anotherBook = new Book("more Java",
                    new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
            System.out.println(anotherBook.toString());
            //test 2.2
            Author[] authors = new Author[2];
            authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
            authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
            Book22 javaDummy = new Book22("Java for Dummy", authors, 19.99, 99);
            System.out.println(javaDummy.toString());
            //test 2.3
            Author23 author1 = new Author23("Tan Ah Teck", "ahteck@nowhere.com");
            System.out.println(author1);

            author1.setEmail("ahteck@somewhere.com");
            System.out.println(author1);
            System.out.println("name is : " + author1.getName());
            System.out.println("email is : " + author1.getEmail());
            Book23 book1 = new Book23("12345", "Java for dummies", author1, 8.8, 88);
            System.out.println(book1);
            book1.setPrice(9.9);
            book1.setQty(99);
            System.out.println(book1);
            System.out.println("isbn is : " + book1.getName());
            System.out.println("name is : " + book1.getName());
            System.out.println("price is : " + book1.getPrice());
            System.out.println("qty is : " + book1.getQty());
            System.out.println("author is : " + book1.getAuthor());
            System.out.println("author’s name: " + book1.getAuthorName());
            System.out.println("author’s name: " + book1.getAuthor().getName());
            System.out.println("author’s email: " + book1.getAuthor().getEmail());
            //tesst 2.4
            Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
            System.out.println(customer1); // Customer’s toString()
            customer1.setDiscount(8);
            System.out.println(customer1);
            System.out.println("ID is: " + customer1.getId());
            System.out.println("Name is: " + customer1.getName());
            System.out.println("Discount is: " + customer1.getDiscount());
            Invoice invoice1 = new Invoice(101, customer1, 888.8);
            System.out.println(invoice1);
            invoice1.setAmount(999.9);
            System.out.println(invoice1);
            System.out.println("ID is: " + invoice1.getId());
            System.out.println("Customer is: " + invoice1.getCustomer()); // Customer’s toString()
            System.out.println("Amount is: " + invoice1.getAmount());
            System.out.println("Customer's ID is: " + invoice1.getCustomerId());
            System.out.println("Customer's name is: " + invoice1.getCustomerName());
            System.out.println("Customer's discount is: " + invoice1.getCustomerDiscount());
            System.out.printf("Amount after discount is: %.2f%n", invoice1.getAmountAfterDiscount());
            //2.5
            Customer25 customer = new Customer25(1, "John Doe", 'M');
            Account25 account = new Account25(12345, customer, 1000.0);
            System.out.println("Customer Information:");
            System.out.println(customer);
            System.out.println("\nAccount Information:");
            System.out.println(account);
            account.deposit(500.0);
            account.withdraw(200.0);
            System.out.println("\nUpdated Account Information:");
            System.out.println(account);
            //2.6
            MyPoint point1 = new MyPoint();
            System.out.println("point1: " + point1);

            point1.setX(8);
            point1.setY(6);
            System.out.println("x is: " + point1.getX());
            System.out.println("y is: " + point1.getY());
            point1.setXY(3, 0);
            System.out.println("getXY()[0]: " + point1.getXY()[0]);
            System.out.println("getXY()[1]: " + point1.getXY()[1]);
            System.out.println("point1: " + point1);

            MyPoint point2 = new MyPoint(0, 4);
            System.out.println("point2: " + point2);
            System.out.println("Distance between point1 and point2: " + point1.distance(point2));
            System.out.println("Distance between point2 and point1: " + point2.distance(point1));
            System.out.println("Distance from point1 to (5, 6): " + point1.distance(5, 6));
            System.out.println("Distance from the origin to point1: " + point1.distance());
            //2.7
            MyPoint point271 = new MyPoint(1, 2);
            MyPoint point272 = new MyPoint(4, 6);
            MyLine line1 = new MyLine(2, 3, 5, 7);
            System.out.println(line1);
            MyLine line2 = new MyLine(point271, point272);
            System.out.println(line2);
            line1.setBeginX(10);
            line1.setBeginY(20);
            line1.setEndXY(15, 25);
            System.out.println("New line1: " + line1);
            System.out.println("Length of line1: " + line1.getLength());
            System.out.println("Gradient of line1: " + line1.getGradient());
            System.out.println("line1 details: " + line1.toString());
            //test 2.8
            MyCircle circle1 = new MyCircle(3, 4, 5);
            MyCircle circle2 = new MyCircle(new MyPoint(1, 2), 3);
            System.out.println("Circle 1 center X-coordinate: " + circle1.getCenterX());
            System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
            System.out.println(circle1);
            System.out.println(circle2);
            //test 2.9
            MyPoint point291 = new MyPoint(0, 0);
            MyPoint point292 = new MyPoint(0, 3);
            MyPoint point293 = new MyPoint(4, 0);
            MyTriangle triangle1 = new MyTriangle(point291, point292, point293);
            MyTriangle triangle2 = new MyTriangle(1, 1, 2, 2, 3, 3);
            System.out.println("Triangle 1: " + triangle1);
            System.out.println("Triangle 2: " + triangle2);
            System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
            System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());
            System.out.print("Type of Triangle 1: ");
            triangle1.printType();
            System.out.print("Type of Triangle 2: ");
            triangle2.printType();
        }
}
