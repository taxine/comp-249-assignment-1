//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//
//DESCRIPTION:
//This program creates objects from various classes. Descriptions of each object are printed to the console.
//Objects are then placed in an array. A sorting algorithm is then performed on the array to sort the ojects by price,
//from lowest to highest.
//
//---------------------------------------------
package driverprogram;

import booktypes.*;
import dailypublication.*;
import monthlypublication.*;
import paperpublication.*;
import java.util.*;

public class Comp249Assignment1 {

    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to the COMP 249 Assignemt 1 Part 1 program. My name is Louis-Olivier Guérin. Let's begin!");
        
        //Program starts here
        double price;
        int numberOfPages;
        long isbn;
        int issueYear;
        int issueNumber;
        int editionNumber;
        int minimumAge;
        String authorName;
        String title;
        String specialityField;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        //Creating PaperPublication instances
        PaperPublication myPaperPublication = new PaperPublication();
        
        System.out.println("Enter a price for myPaperPublication: ");
        
        price = keyboard.nextDouble();
        while (price < 0) {
            System.out.println("Price cannot be less than zero. Try again:");
            price = keyboard.nextDouble();
        }
        myPaperPublication.setPrice(price);
        System.out.println("Set myPaperPublication number of pages: ");
        
        numberOfPages = keyboard.nextInt();
        while (numberOfPages < 0) {
            System.out.println("Page count cannot be less than zero. Stop being a joker and try again:");
            numberOfPages = keyboard.nextInt();
        }
        myPaperPublication.setNumberOfPages(numberOfPages);
        
        PaperPublication myParameterizedPaperPublication  = new PaperPublication(14.99, 254);
        System.out.println(myPaperPublication);
        System.out.println(myParameterizedPaperPublication);
        
        //Creating Book instances
        Book myBook = new Book();
        
        System.out.println("Enter the issue year for your book:");
        issueYear = keyboard.nextInt();
        while (issueYear < 0 || issueYear > Calendar.getInstance().get(Calendar.YEAR)) {
            System.out.println("Book issue year needs to be between 0 and the current year. Please try again: ");
            issueYear = keyboard.nextInt();
        }
        myBook.setIssueYear(issueYear);
        
        Book myParameterizedBook = new Book(2009, 7342867754835L, "Bob Chanty", 34.99, 784, "My life: Revisited");
        System.out.println(myBook);
        System.out.println(myParameterizedBook);
        
        //Creating Journal instances
        Journal myJournal = new Journal();
        Journal myParameterizedJournal = new Journal(135, "Engineering", 45.99, 432);
        System.out.println(myJournal);
        System.out.println(myParameterizedJournal);
        
        //Creating Magazine instances
        Magazine myMagazine = new Magazine();
        Magazine myParameterizedMagazine = new Magazine(Magazine.PaperQuality.HIGH, Magazine.IssuingFrequency.WEEKLY, 67.99, 67);
        System.out.println(myMagazine);
        System.out.println(myParameterizedMagazine);
        
        //Creating EducationalBook instances
        EducationalBook myEducationalBook = new EducationalBook();
        EducationalBook myParameterizedEducationalBook = new EducationalBook(4, "Economics", "Introduction to Microeconomics", 3865873964865L, 2015, "Adam Smith", 164.95, 877);
        System.out.println(myEducationalBook);
        System.out.println(myParameterizedEducationalBook);
        
        //Creating ChildrenBook instances
        ChildrenBook myChildrenBook = new ChildrenBook();
        ChildrenBook myParameterizedChildrenBook = new ChildrenBook(3, 4768825466586L, 1987, "Buck Joe", 21.68, 32, "The purple tree");
        System.out.println(myChildrenBook);
        System.out.println(myParameterizedChildrenBook);
        
        PaperPublication[] myPaperPublicationArray = 
                                                    {myParameterizedPaperPublication,
                                                     myParameterizedBook,
                                                     myJournal,
                                                     myParameterizedJournal,
                                                     myMagazine,
                                                     myParameterizedMagazine,
                                                     myEducationalBook,
                                                     myParameterizedEducationalBook,
                                                     myChildrenBook,
                                                     myParameterizedChildrenBook};
        System.out.println("Here are the contents of the array:");
        
        for (PaperPublication object : myPaperPublicationArray) {
        System.out.println(object);
        }

    };
    
    
    
}
