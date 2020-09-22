public class NewReleaseMovie extends Movie{

	public NewReleaseMovie(String title) {
		super(title);
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