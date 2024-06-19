public class Main {
    public static void main(String[] args) {
        // Example usage
        Book book1 = new Book("1984", "George Orwell");
        Member member1 = new Member("Alice");

        System.out.println("Checking out the book...");
        member1.checkOutBook(book1);

        System.out.println("Checking in the book...");
        member1.checkInBook(book1);
    }
}