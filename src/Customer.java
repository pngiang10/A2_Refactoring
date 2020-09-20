import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
//import java.util.Vector;

public class Customer {
    private String _name;
    
    private ArrayList<Rental> _rentals = new ArrayList<Rental>(); //REPLACE DATA TYPE FROM VECTOR TO ARRAYLIST
    
    public Customer (String name) {
        _name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    
    public String prepareStatement() {
    	Enumeration<Rental> rentals      = Collections.enumeration(_rentals); //_rentals.elements();
        String  result                   = "Rental Record for " + getName() + "\n";
        int     frequentRenterPoints 	 = 0;
        BigDecimal  totalRentalAmount          = new BigDecimal(0.00); //RENAME and REPLACE DATA TYPE

    	 
        while (rentals.hasMoreElements()) {
            
            //BigDecimal thisAmount = new BigDecimal(0.00); //RENAME and REPLACE DATA TYPE
            Rental rental       = (Rental) rentals.nextElement(); //RENAME
            
            
            //thisAmount = rental.getRentAmount(); //the amount for each rental is moved to and calculated in Rental
            
            frequentRenterPoints += rental.getFrequentPoint();
            
            /*
            // add bonus for a two day new release rental //METHOD EXTRACTION and MOVE to Rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                (rental.getDaysRented() > 1)) {   //Rental got info to calculate points
                    frequentRenterPoints++;
            }
            */
            
            // show figures for this rental //METHOD EXTRACTION
            result += rental.getRentalFigures();
            
            totalRentalAmount = totalRentalAmount.add(rental.getRentAmount());
        }
        
        // add footer lines //METHOD EXTRACTION might wanna put it in the printing service but for now we can keep it here
        result += "Amount owed is " + String.valueOf(totalRentalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }
    
    public void printStatemnt() {
    	System.out.println();
    }
    
}