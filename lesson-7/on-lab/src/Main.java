public class Main {
    public static void main(String[] args) {
//    PersonService.createPerson();
        Book[] books = BookService.getAllBook();
        System.out.println("Danh sách");
        BookService.printBook(books);
        System.out.println("Tìm sách có thể loại phiêu lưu");
        BookService.getBookByCategory(books, "phiêu lưu");
    }
}
