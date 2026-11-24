public class Book {
    private String title;
    private int priority;//1 urgent 2 regular 3 low (Urgency scale)
    private int BookId;

    public Book( int BookId,String title, int priority) {
        this.title = title;
        this.priority = priority;
        this.BookId = BookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getBookId() {
        return BookId;
    }
    public void setBookId(int bookId) {
        this.BookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                ", BookId=" + BookId +
                '}';
    }
}
