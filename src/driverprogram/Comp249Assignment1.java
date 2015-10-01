//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//
//DESCRIPTION:
//This program creates objects from various classes. Descriptions of each object are printed to the console. Overrided equals() method is tested
//on numerous objects from varying classes.
//Objects are then placed in an array. Price of cheapest object in the array is then printed to the console
//
//---------------------------------------------
package driverprogram;

import booktypes.*;
import dailypublication.*;
import monthlypublication.*;
import paperpublication.*;

public class Comp249Assignment1 {

    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to the COMP 249 Assignemt 1 Part 1 program. My name is Louis-Olivier Guérin. Let's get started!");
    
        //Creating PaperPublication instances
        PaperPublication myPaperPublication = new PaperPublication();
        PaperPublication myParameterizedPaperPublication  = new PaperPublication(14.99, 254);
        PaperPublication myParameterizedPaperPublication2  = new PaperPublication(14.98, 254);
        //Testing equality of objects
        System.out.println(myParameterizedPaperPublication.equals(myParameterizedPaperPublication2));
        System.out.println(myParameterizedPaperPublication.equals(myParameterizedPaperPublication));
        System.out.println(myPaperPublication.equals(myParameterizedPaperPublication));
        
        //Creating Book instances
        Book myBook = new Book();
        //Adding values to attributes of object myBook
        myBook.setAuthorName("John Davis");
        myBook.setIsbn(385939696);
        myBook.setIssueYear(2001);
        myBook.setNumberOfPages(345);
        myBook.setPrice(45.88);
        myBook.setTitle("Flying 101");
        
        //Testing equality of myBook and myPaperPublication
        System.out.println(myBook.equals(myPaperPublication));
        
        
        //Creating Journal instances
        Journal myJournal = new Journal();
        Journal myParameterizedJournal = new Journal(135, "Engineering", 45.99, 432);

        //Creating Magazine instances
        Magazine myMagazine = new Magazine();
        Magazine myParameterizedMagazine = new Magazine(Magazine.PaperQuality.HIGH, Magazine.IssuingFrequency.WEEKLY, 67.99, 67);
        
        //Creating EducationalBook instances
        EducationalBook myEducationalBook = new EducationalBook();
        EducationalBook myParameterizedEducationalBook = new EducationalBook(4, "Economics", "Introduction to Microeconomics", 3865873964865L, 2015, "Adam Smith", 164.95, 877);
        
        //Creating ChildrenBook instances
        ChildrenBook myChildrenBook = new ChildrenBook();
        ChildrenBook myParameterizedChildrenBook = new ChildrenBook(3, 4768825466586L, 1987, "Buck Joe", 21.68, 32, "The purple tree");
        
        //Testing equals() method with instance from different class. Should return false
        System.out.println("Print true if myMagazine is equal to myBook, false if otherwise:");
        System.out.println(myMagazine.equals(myBook));
        
        //Create an array and fill it with various objects
        PaperPublication[] myPaperPublicationArray = 
                                                    {myParameterizedPaperPublication,
                                                     myBook,
                                                     myJournal,
                                                     myParameterizedJournal,
                                                     myMagazine,
                                                     myParameterizedMagazine,
                                                     myEducationalBook,
                                                     myParameterizedEducationalBook,
                                                     myChildrenBook,
                                                     myParameterizedChildrenBook};
        
        double smallest = myPaperPublicationArray[0].getPrice();
        double largest = myPaperPublicationArray[0].getPrice();
        
        //Trace the PaperPublication array to find the cheapest pricest
        for (PaperPublication object : myPaperPublicationArray) {
            //Print Object's toString() method
            System.out.println(object);
            //Find cheapest price in array
            if (object.getPrice() > largest) {
                largest = object.getPrice();
            } else if (object.getPrice() < smallest) {
                smallest = object.getPrice();
            }  
        }
        //Print cheapest price
        System.out.printf("Cheapest price in the array is: $ %.2f\n", smallest );

    }; 
}
