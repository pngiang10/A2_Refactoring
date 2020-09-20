public class Movie {
	
    /*
    public static final int CHILDRENS   = 2; //CLASS CREATION or CHILDREN is a Subclass of Regular of Movie -> New Release is an attribute
    public static final int REGULAR     = 0; //CLASS CREATION or use an Enum with 3 different Prices 
    public static final int NEW_RELEASE = 1; //CLASS CREATION needs to have rationale for this
	
	public final double BASE_PRICE = 0.00;
	public final int MINIMUM_DAY = 0;
	public final double FEE_MULTIPLIER = 0.00;
	public final int BONUS_POINT = 0;
	*/
	
    private String _title;
   // private int    _priceCode; //due to the sub-class type, priceCode is not relevant anymore
    
    public Movie(String title) {
        _title = title;
        //_priceCode = priceCode;
    }
    
    /*public int getPriceCode() {
        return _priceCode;
    }
    
    public void setPriceCode(int arg) { //SUB-CLASSES IS USED TO CREATE MOVIE TYPES SO SETPRICECODE IS OBSOLETE -> NO NEED FOR ERRHANDL
        _priceCode = arg;
    }*/
    
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
    


