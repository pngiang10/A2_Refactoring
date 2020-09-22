public class Movie {
	
    private String _title;
    
    public Movie(String title) {
        _title = title;
        //_priceCode = priceCode;
    }
    
    public String getTitle() {
        return _title;
    }
	
    public double getBasePrice()
    {
    	return 0.00;
    }
    
    public int getMinimumDay() {
    	return 0;
    }
    
    public double getFeeMutiplier() {
    	return 0.00;
    }
    
    public int getBonusPoint() {
    	return 0;
    }
	
}
    


