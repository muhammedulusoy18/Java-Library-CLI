import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner =new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Library Menu ---");
            System.out.println("1 - Add Book");
            System.out.println("2 - Delete Book");
            System.out.println("3 - List All Books");
            System.out.println("0 - Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Publication Year: ");
                    int year = scanner.nextInt();
                    System.out.print("Book ID: ");
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    library.addBook(new Book(title,author,year,id));

                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the title of the book to delete: ");
                    String titleToDelete = scanner.nextLine();
                    library.deleteBook(titleToDelete);
                    break;
                    case 3:
                        library.listBooks();
                        break;
                        case 0:
                            Logger.writeToLog("Program exited.");
                            System.out.println("Exiting program...");
                            break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
            }

        }while(choice!=0);
        scanner.close();
    }
}

