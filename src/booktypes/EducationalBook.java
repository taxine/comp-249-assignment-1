//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package booktypes;

public class EducationalBook extends Book {
    //Attributes with private access rights
    private int editionNumber;
    private String specialityField;
    
    //Constructors
    public EducationalBook() {
        super();
        this.editionNumber = 0;
        this.specialityField = "absolutely nothing";
    }
    public EducationalBook(int editionNumber, String specialityField, String title, long isbn, int issueYear, String authorName, double price, int numberOfPages) {
        super(issueYear, isbn, authorName, price, numberOfPages, title);
        this.editionNumber = editionNumber;
        this.specialityField = specialityField;
    }
    //Accessors and mutators
    public int getEditionNumber() {
        return this.editionNumber;
    }
    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }
    public String getSpecialityType() {
        return this.specialityField;
    }
    public void setSpecialityField(String specialityField) {
        this.specialityField = specialityField;
    }
    //Methods
    @Override public String toString() {
        return ("This educational book (Edition Number: " + this.editionNumber + ") belongs to the speciality field \"" + specialityField + "\". It was issued in the year " + issueYear + " and written by " + this.authorName + ". It has " + this.getNumberOfPages() + " pages and is priced at " + this.getPrice() + "$. ISBN: " + isbn);
    }
    @Override public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this.editionNumber != ((EducationalBook)obj).editionNumber && this.specialityField.equals(((EducationalBook)obj).specialityField)) {
            return false;
        }
        return true;
    }
    
    
    
}
