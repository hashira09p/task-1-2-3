public class BookTest {
    public static void main(String[] args) {
        // Create three Book objects with different values
        Task123 book1 = new Task123("Java Programming", "John Smith", 2021, 39.99);
        Task123 book2 = new Task123("Python Basics", "Jane Doe", 2020, 29.99);
        Task123 book3 = new Task123("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println();
        
        System.out.println("Book 2:");
        System.out.println(book2);
        System.out.println();
        
        System.out.println("Book 3:");
        System.out.println(book3);
    }
}
