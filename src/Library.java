import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Library {
    private final List<Book> books =new ArrayList<>();
    private static final String FILE_NAME ="Books.txt";

public Library() {
    loadBooksFromFile();
}

public void addBook(Book book) {
    books.add(book);
    saveToFile();
    Logger.writeToLog("Book added: " + book.getTitle());
}
public void deleteBook(String bookTitle) {
    boolean isDeleted= books.removeIf(k->k.getTitle().equalsIgnoreCase(bookTitle));
    if(isDeleted){
        Logger.writeToLog("Book deleted: " + bookTitle);
    }else{
        Logger.writeToLog("Book to delete not found: " + bookTitle);
    }
    saveToFile();
}
public void listBooks(){
    if(books.isEmpty()){
        System.out.println("The library is empty.");
    }
    else{
        for(Book book: books){
            System.out.println(book);
        }
    }
}
private void saveToFile(){
try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME))){
    for(Book book: books){
        writer.write(book.getTitle()+"|"+book.getAuthor()+"|"+book.getYear()+"|"+book.getId());
        writer.newLine();
    }
}
catch(IOException e){
    Logger.writeToLog("Error while saving books: " + e.getMessage());
}
}

private void loadBooksFromFile (){
    File file=new File(FILE_NAME);
    if(!file.exists())
        return;
   try(BufferedReader reader=new BufferedReader(new FileReader(file))) {
       String line;
       while ((line=reader.readLine())!=null) {
           String[] parts=line.split("\\|");
           if(parts.length==4){
               books.add(new Book(parts[0],parts[1],Integer.parseInt(parts[2]),Long.parseLong(parts[3])));
           }
       }
   }
   catch(IOException e){
       Logger.writeToLog("Error while reading file: " + e.getMessage());
   }
}

}
