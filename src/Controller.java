
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Refactored Code: ");
		//Movie movie1 = new Movie("Lord of the Ring Ring", 2);
		Movie movie1 = new RegularMovie("Lord of the Ring Ring");
		
		Movie movie2 = new NewReleaseMovie("Slow and Serious");
		
		//movie2 = new RegularMovie("Slow and Serious"); //HOW TO CHANGE PRICE CODE
		
		//movie1 = new NewRelease("Lord of the Ring Ring");
		
		Rental rental1 = new Rental(movie1, 10);
		Rental rental2 = new Rental(movie2, 15);
		
		Customer customer1 = new Customer("Mr Q");
		
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		
		System.out.println(customer1.prepareStatement());
		
		System.out.println();
		
		
		customer1.printXMLStatement();
		System.out.println();
		
		/*SECOND TEST SET USING OG classes
		System.out.println("OG Code: ");
		//Regular
		Movie_OG movie1_OG = new Movie_OG("Lord of the Ring Ring", 0);
		
		//New Release
		//Movie_OG movie2 = new Movie_OG("Lord of the Ring Ring 2", 1);
		Movie_OG movie2_OG = new Movie_OG("Slow and Serious", 1);
		
		//Childrens
		//Movie_OG movie2 = new Movie_OG("Lord of the Ring Ring 2", 2);
		
		Rental_OG rental1_OG = new Rental_OG(movie1_OG, 10);
		Rental_OG rental2_OG = new Rental_OG(movie2_OG, 15);
		
		Customer_OG customer1_OG = new Customer_OG("Mr Q");
		
		customer1_OG.addRental(rental1_OG);
		customer1_OG.addRental(rental2_OG);
		
		System.out.println(customer1_OG.statement());
		*/
	}

}
