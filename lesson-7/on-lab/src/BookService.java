import java.util.Locale;

public class BookService {
    public static Book[] getAllBook() {
        Book[] books = new Book[2];
        String[] category = new String[]{"Tình cảm", "Kinh dị"};
        books[0] = new Book(1, "Cuốn theo chiều gió", category, "abc", 1994, "xyz");
        books[1] = new Book(2,
                "Dế mèn phiêu lưu kí",
                new String[]{"Phiêu lưu", "Viễn tưởng", "Tình cảm"},
                "Tô hoài",
                1990,
                "Kim Đồng");

//        for (Book b: books){
//            System.out.println(b);
//        }

        return books;
    }

    public static void printBook(Book[] arrBook) {
        for (Book book : arrBook) {
            System.out.println(book);
        }
    }

    public static void getBookByCategory(Book[] books, String category) {
        for (Book b : books) {
            for (String gender : b.getCategory()) {
                if (gender.toLowerCase(Locale.ROOT).equals(category)) {
                    System.out.println(b);
                }
            }
        }
    }

}

