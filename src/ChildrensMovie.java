public class ChildrensMovie extends Movie{
	
	public ChildrensMovie(String title) {
		super(title);
	}
	
    public double getBasePrice()
    {
    	return 1.50;
    }
    
    public int getMinimumDay() {
    	return 3;
    }
    
    public double getFeeMutiplier() {
    	return 1.50;
    }

}