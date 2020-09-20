import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

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
        String  rentalStatement          = "Rental Record for " + getName() + "\n";
        int     frequentRenterPoints 	 = 0;
        BigDecimal  totalRentalAmount    = new BigDecimal(0.00); //RENAME and REPLACE DATA TYPE

    	 
        while (rentals.hasMoreElements()) {

            Rental rental       = (Rental) rentals.nextElement(); //RENAME
            
            frequentRenterPoints += rental.getFrequentPoint(); //EXTRACT and MOVE METHOD
            
            // show figures for this rental //METHOD EXTRACTION
            rentalStatement += rental.getRentalFigures(); //EXTRACT and MOVE METHOD
            
            totalRentalAmount = totalRentalAmount.add(rental.getRentAmount()); //EXTRACT and MOVE METHOD
        }
        
        // add footer lines //METHOD EXTRACTION might wanna put it in the printing service but for now we can keep it here
        rentalStatement += "Amount owed is " + String.valueOf(totalRentalAmount) + "\n";
        rentalStatement += "You earned " + String.valueOf(frequentRenterPoints) +
                  " frequent renter points";
        return rentalStatement;
    }
    
    public void printXMLStatement() {
    	System.out.println("<statement>");
    	System.out.println("\t <name> "+getName()+"</name>");
    	
    	Enumeration<Rental> rentals      = Collections.enumeration(_rentals); //_rentals.elements();
        String  rentalStatement                   = "";
        int     frequentRenterPoints 	 = 0;
        BigDecimal  totalRentalAmount          = new BigDecimal(0.00); //RENAME and REPLACE DATA TYPE

    	 
        while (rentals.hasMoreElements()) {

            Rental rental       = (Rental) rentals.nextElement(); //RENAME
            
            frequentRenterPoints += rental.getFrequentPoint();
            
            Movie movie = rental.getMovie();

            System.out.print(rental.getRentalFiguresInXML());
            
            totalRentalAmount = totalRentalAmount.add(rental.getRentAmount());
        }
        
        // add footer lines //METHOD EXTRACTION might wanna put it in the printing service but for now we can keep it here
        rentalStatement += "\t <totalRentalFee> " + String.valueOf(totalRentalAmount) + " </totalRentalFee>\n";
        rentalStatement += "\t <frequentRenterPoints> " + String.valueOf(frequentRenterPoints) +
                  " </frequentRenterPoints>";
        System.out.println(rentalStatement);
        System.out.println("</statement>");
    	
    }
    
}