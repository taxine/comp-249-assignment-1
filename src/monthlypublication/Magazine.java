//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//---------------------------------------------
package monthlypublication;
import paperpublication.PaperPublication;

public class Magazine extends PaperPublication {
    //Enumeration types
    public enum PaperQuality {NULL, LOW, NORMAL, HIGH};
    public enum IssuingFrequency {NULL, WEEKLY, MONTHLY, YEARLY};
    //Attributes with package access rights
    private PaperQuality paperQuality;
    private IssuingFrequency issuingFrequency;
    //Constructors
    public Magazine() {
        super();
        this.paperQuality = PaperQuality.NULL;
        this.issuingFrequency = IssuingFrequency.NULL;
    }
    public Magazine(PaperQuality paperQuality, IssuingFrequency issuingFrequency, double price, int numberOfPages) {
        super(price, numberOfPages);
        this.paperQuality = paperQuality;
        this.issuingFrequency = issuingFrequency;   
    }
    //Accessors and mutators
    public PaperQuality getPaperQuality() {
        return this.paperQuality;
    }
    public void setPaperQuality(PaperQuality paperQuality) {
        this.paperQuality = paperQuality;
    }
    public IssuingFrequency getIssuingFrequency() {
        return this.issuingFrequency;
    }
    public void setIssuingFrequency(IssuingFrequency issuingFrequency) {
        this.issuingFrequency = issuingFrequency;
    }
    //Methods
    @Override public String toString() {
        return ("This magazine has an issuing frequency of " + issuingFrequency + ". It is made of " + paperQuality + " quality paper. It is priced at " + this.getPrice() + "$ and has " + this.getNumberOfPages() + " pages.");
    }
    @Override public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this.paperQuality != ((Magazine)obj).paperQuality || this.issuingFrequency != ((Magazine)obj).issuingFrequency) {
            return false;
        }
        return true;
    }

}
