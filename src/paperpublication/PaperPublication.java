//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package paperpublication;

public class PaperPublication {
    //Attributes with package access rights
    double price;
    int numberOfPages;
    
    //Constructors
    public PaperPublication() {
        this.price = 0.00;
        this.numberOfPages = 0;
    }
    public PaperPublication(double price, int numberOfPages) {
        this.price = price;
        this.numberOfPages = numberOfPages;
    }
    //Accessors and mutators
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNumberOfPages() {
        return this.numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    //Methods
    @Override public String toString() {
        return ("This paper publication has " + numberOfPages + " pages and is priced at " + price + "$.");
    }
}
