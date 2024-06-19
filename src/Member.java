public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void checkOutBook(Book book) {
        if (!book.isCheckedOut()) {
            book.checkOut();
            System.out.println(name + " checked out " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already checked out.");
        }
    }

    public void checkInBook(Book book) {
        if (book.isCheckedOut()) {
            book.checkIn();
            System.out.println(name + " checked in " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not checked out.");
        }
    }
}