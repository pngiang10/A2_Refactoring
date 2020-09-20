public class RegularMovie extends Movie{
	/*
	public static final double BASEP_RICE = 2.00;
	public static final int MINIMUM_DAY = 2;
	public static final double FEE_MULTIPLIER = 1.50;
	*/
	
	
	public RegularMovie(String title) {
		//super(title, 0);
		super(title);
		// TODO Auto-generated constructor stub
	}
	
    public double getBasePrice()
    {
    	return 2.00;
    }
    
    public int getMinimumDay() {
    	return 2;
    }
    
    public double getFeeMutiplier() {
    	return 1.50;
    }
	
}