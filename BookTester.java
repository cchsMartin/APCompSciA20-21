/**
 * 
 */

/**
 *Author: Melanie Rosado
 *Date: Oct 15, 2020
 *Description: 
 */
public class BookTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book Cosmos = new Book("Cosmos", "Carl Sagan", 220, 396, false);
		
		Cosmos.startBook();
		Cosmos.tellPage();
		
		Cosmos.turnPage();
		Cosmos.tellPage();
		Cosmos.getProgress();
		
		Cosmos.turnPage();
		Cosmos.tellPage();
		
		Cosmos.getProgress();
		Cosmos.finishBook();
		
	}

}
