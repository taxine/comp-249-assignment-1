//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package booktypes;
import paperpublication.*;

public class Book extends PaperPublication {
    //Attributes with protected access rights
    protected long isbn;
    protected int issueYear;
    protected String authorName;
    protected String title;
    
    //Constructors
    public Book() {
        super();
        this.isbn = 0L;
        this.issueYear = 0;
        this.authorName = "John Doe";
        this.title = "";
    }
    public Book(int issueYear, long isbn, String authorName, double price, int numberOfPages, String title) {
        super(price, numberOfPages);
        this.isbn = isbn;
        this.issueYear = issueYear;
        this.authorName = authorName;
        this.title = title;
    }
    //Accessors and mutators
    public long getIsbn() {
        return this.isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public int getIssueYear() {
        return this.issueYear;
    }
    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    //Methods
    @Override public String toString() {
        return ("This book, written by " + this.getAuthorName() + " has " + this.getNumberOfPages() + " pages. It was issued in the year " + issueYear + " and sells for " + this.getPrice() + "$. ISBN: " + isbn);
    }
}
