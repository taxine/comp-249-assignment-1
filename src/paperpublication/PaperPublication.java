//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package paperpublication;

public class PaperPublication {
    //Attributes with private access rights
    private double price;
    private int numberOfPages;
    
    //Constructors
    public PaperPublication() {
        System.out.println("Creating object of " + this.getClass());
        this.price = 0.0;
        this.numberOfPages = 0;
    }
    public PaperPublication(double price, int numberOfPages) {
        System.out.println("Creating object of " + this.getClass());
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
    @Override public boolean equals(Object obj) {
        if (obj == null || this == null || this.getClass() != obj.getClass()) {
            return false;
        }
        return (this.price == ((PaperPublication)obj).price && this.numberOfPages == ((PaperPublication)obj).numberOfPages);

    }
}
