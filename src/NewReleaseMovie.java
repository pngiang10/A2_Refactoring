public class NewReleaseMovie extends Movie{
	/*
	public static final double BASE_PRICE = 0.00;
	public static final int MINIMUM_DAY = 0;
	public static final double FEE_MULTIPLIER = 3.00;
	public static final int BONUS_POINT = 1;
	*/

	public NewReleaseMovie(String title) {
		//super(title, 1);
		super(title);
		// TODO Auto-generated constructor stub
	}
	
    public double getBasePrice()
    {
    	return 0.00;
    }
    
    public int getMinimumDay() {
    	return 0;
    }
    
    public double getFeeMutiplier() {
    	return 3.00;
    }
    
    public int getBonusPoint() {
    	return 1;
    }
    
	
}