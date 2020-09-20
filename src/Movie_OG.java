public class Movie_OG {

    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    private int    _priceCode;
    
    public Movie_OG(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    
    public int getPriceCode() {
        return _priceCode;
    }
    
    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    
    public String getTitle() {
        return _title;
    }
}