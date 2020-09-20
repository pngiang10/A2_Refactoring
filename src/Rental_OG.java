public class Rental_OG {
    private Movie_OG _movie;
    private int   _daysRented;
    
    public Rental_OG(Movie_OG movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie_OG getMovie() {
        return _movie;
    }
}