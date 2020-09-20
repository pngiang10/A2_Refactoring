import java.util.Enumeration;
import java.util.Vector;

public class Customer_OG {
    private String _name;
    private Vector _rentals = new Vector();
    
    public Customer_OG (String name) {
        _name = name;
    }
    
    public void addRental(Rental_OG arg) {
        _rentals.addElement(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    public String statement() {
    
        double      totalAmount          = 0;
        int         frequentRenterPoints = 0;
        Enumeration rentals              = _rentals.elements();
        String      result               = "Rental Record for " + getName() + "\n";
        
        while (rentals.hasMoreElements()) {
            
            double thisAmount = 0;
            Rental_OG each       = (Rental_OG) rentals.nextElement();
            
            // determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie_OG.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie_OG.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie_OG.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3) {
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
            
            // add frequent renter points
            frequentRenterPoints++;
            
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie_OG.NEW_RELEASE) &&
                (each.getDaysRented() > 1)) {
                    frequentRenterPoints++;
            }
            
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() +
                      "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }
}