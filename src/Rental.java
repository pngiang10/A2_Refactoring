import java.math.BigDecimal;

public class Rental { //MOVE some method here
    private Movie _movie;
    private int   _daysRented;
    
    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }
    
    public BigDecimal getRentAmount() {
    	BigDecimal amount = new BigDecimal(0.00);
    	amount = amount.add(BigDecimal.valueOf(_movie.getBasePrice()));
    	if (this.getDaysRented() > _movie.getMinimumDay()) { 
            amount = amount.add(new BigDecimal((this.getDaysRented() - _movie.getBasePrice()) * _movie.getFeeMutiplier())); //2 is the days
        }
    	
    	return amount;
    }
    
    public int getFrequentPoint() {
    	int defaultPoint = 1;
    	if (_daysRented>1) defaultPoint+=_movie.getBonusPoint();
    	return defaultPoint;
    }
    
    public String getRentalFigures() {
    	String result = "";
    	// show figures for this rental //METHOD EXTRACTION
        result += "\t" + _movie.getTitle() +
                  "\t" + String.valueOf(getRentAmount()) + "\n";
        return result;
    }
}