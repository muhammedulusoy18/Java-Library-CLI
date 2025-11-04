public class Book {
    private final String  title;
    private final String author;
    private final int year;
    private  final long id;
    public Book(String title, String author, int year, long id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
   public  String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return title +" - "+ author +" ("+ year +") "+"|"+id;
    }
}

