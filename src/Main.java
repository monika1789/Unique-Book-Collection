import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Check if a book exists");
            System.out.println("4. Display all books");
            System.out.println("5. Count books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = 0;
            try{
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e ){
                System.out.println("Invalid Input. Please Enter the number from the above options.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("Enter the Book Title: ");
                    String title =  scanner.nextLine();
                    System.out.println("Enter the Author: ");
                    String author = scanner.nextLine();
                    Book newbook = new Book (title, author);
                    library.addBook(newbook);
                    break;

                case 2:
                    System.out.println("Enter the Book Title to be removed: ");
                    String titleToRemove = scanner.nextLine();
                    System.out.println("Enter the author: ");
                    String authorToRemove = scanner.nextLine();
                    Book removeBook = new Book (titleToRemove, authorToRemove);
                    library.removeBook(removeBook);
                    break;

                case 3:
                    System.out.println("Enter the Book Title: ");
                    String titleToCheck = scanner.nextLine();
                    System.out.println("Enter the Author: ");
                    String authorToCheck = scanner.nextLine();
                    Book checkBook = new Book (titleToCheck, authorToCheck);
                    if (library.hasBook(checkBook)){
                        System.out.println("The Book is in the Collection");
                    } else{
                        System.out.println("The Book is not in the Collection");
                    }
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("The total number of books are: " + library.countBooks());
                    break;
                case 6:
                    System.out.println("Existing the Program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
               }
            }
    }
}