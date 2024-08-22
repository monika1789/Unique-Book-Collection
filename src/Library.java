import java.util.HashSet;

public class Library {
    private HashSet<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    // Method to add a book
    public void addBook(Book book) {
   if (books.contains(book)){
       System.out.println("This Book already exists.");
   }else {
       books.add(book);
       System.out.println("The Title and Author is added Successfully to the Collection");
        }
    }

    // Method to remove a book
    public void removeBook(Book book){
        if (books.contains(book)){
            books.remove(book);
            System.out.println(book + " is removed.");
        }else {
            System.out.println("This Book is not in the collection");
        }
    }

    // Method to check if a book exists
   public boolean hasBook(Book book){
        return books.contains(book);
   }

    // Method to display all books
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("No Books in the collection.");
        }
        else {
            System.out.println("Books in the collections: ");
            for (Book book:books){
                System.out.println(book);
            }
        }
    }

    // Method to count books

    public int countBooks(){
        return books.size();
    }

}
