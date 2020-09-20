public class ChildrensMovie extends Movie{
	/*
	public static final double BASEPRICE = 1.50;
	public static final int MINDAY = 3;
	public static final double FEEMULTIPLIER = 1.50;
	*/
	
	public ChildrensMovie(String title) {
		//super(title, 2);
		super(title);
		// TODO Auto-generated constructor stub
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