public class RegularMovie extends Movie{

	public RegularMovie(String title) {
		super(title);
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