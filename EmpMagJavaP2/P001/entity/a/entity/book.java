package EmpMagJavaP2.P001.entity.a.entity;

public class book {
    private String bookName;
    private int ISBN;
    private String authorName;
    private String publisher;

    public book(String bookName, int ISBN, String authorName, String publisher) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookName='" + bookName + '\'' +
                ", ISBN=" + ISBN +
                ", authorName='" + authorName + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public void getBookInfo(){
        System.out.println(this.toString());
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }
}
