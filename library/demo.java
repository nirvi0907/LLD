    package library;

    import library.account.*;
    import library.book.Book;
    import library.book.IBook;

    import java.time.LocalDate;
    import java.time.LocalTime;

    public class demo {
        public static void main(String[] arg) throws InterruptedException {
            IAccount account = new Librarian("Nirvi", "ab", "bj", 2);
            Librarian librarian = (Librarian) account;

            IAccount account2 = new Librarian("himanshu", "ab", "bj", 2);
            Librarian librarian2 = (Librarian) account2;

            IBook book = new Book(1, "book1", "ab", LocalDate.now(), 12);

            IBorrower borrower = new Borrower("borrower1", "abc", "34", 1, 10);
            librarian.addBook(book);

            Thread searchThread = new Thread(() -> {
                System.out.println(LocalTime.now() + " | Search thread starting...");
                librarian2.searchBook("book1");
            });

            Thread borrowThread = new Thread(() -> {
                try { Thread.sleep(500); }  // Delay to ensure search thread queues first
                catch (InterruptedException e) { e.printStackTrace(); }

                System.out.println(LocalTime.now() + " | Borrow thread starting...");
                librarian.initiateBorrowBook(book, borrower);
            });


            // Start both threads simultaneously
            borrowThread.start();
            borrowThread.join();
            searchThread.start();
            searchThread.join();
        }
    }
