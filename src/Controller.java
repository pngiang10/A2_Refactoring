//this is a main class for testing purposes
public class Controller {

	public static void main(String[] args) {
		Movie movie1 = new RegularMovie("Lord of the Ring Ring");
		
		Movie movie2 = new NewReleaseMovie("Slow and Serious");
		
		Rental rental1 = new Rental(movie1, 10);
		Rental rental2 = new Rental(movie2, 15);
		
		Customer customer1 = new Customer("Mr Q");
		
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		
		System.out.println(customer1.getStatement());
		
		System.out.println();
		
		
		customer1.printXMLStatement();
		System.out.println();

	}

}
