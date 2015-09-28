//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package dailypublication;
import paperpublication.PaperPublication;

public class Journal extends PaperPublication {
    //Attributes with package access rights
    int issueNumber;
    String specialityField;
    
    //Constructors
  
    public Journal() {
        super();
        this.issueNumber = 0;
        this.specialityField = "absolutely nothing";
    }
    public Journal(int issueNumber, String specialityField, double price, int numberOfPages) {
        super(price, numberOfPages);
        this.issueNumber = issueNumber;
        this.specialityField = specialityField;
    }
    //Accessors and mutators
    public int getIssueNumber() {
        return this.issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public String getSpecialityField() {
        return this.specialityField;
    }
    public void setSpecialityField(String specialityField) {
        this.specialityField = specialityField;
    }
    //Methods
    @Override public String toString() {
        return ("This journal, issue number " + issueNumber + ", is specialized in " + specialityField + ". It clocks in at " + this.getNumberOfPages() + " pages and is priced at " + this.getPrice() + "$.");
    }
    @Override public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this.issueNumber != ((Journal)obj).issueNumber && this.specialityField.equals(((Journal)obj).specialityField)) {
            return false;
        }
        return true;
    }
}
