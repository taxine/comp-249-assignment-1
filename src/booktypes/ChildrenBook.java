//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package booktypes;

public class ChildrenBook extends Book {
    //Attribute with private access rights
    private int minimumAge;
    //Constructors
    public ChildrenBook() {
        super();
        this.minimumAge = 0;
    }
    public ChildrenBook(int minimumAge, long isbn, int issueYear, String authorName, double price, int numberOfPages, String title) {
        super(issueYear, isbn, authorName, price, numberOfPages, title);
        this.minimumAge = minimumAge;
    }
    //Accessors and mutators
    public int getMinimumAge() {
        return this.minimumAge;
    }
    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }
    //Methods
    @Override public String toString() {
        return ("This children's book is suitable for ages " + minimumAge + " and up. It was issued in the year " + this.issueYear + " by author " + this.authorName + ". It is priced at " + this.getPrice() + "$ and comes in at " + this.getNumberOfPages() + " pages. ISBN: " + this.isbn);
    }
    @Override public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this.minimumAge != ((ChildrenBook)obj).minimumAge) {
            return false;
        }
        return true;
    }
    
}
