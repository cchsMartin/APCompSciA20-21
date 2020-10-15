/**
 * 
 */

/**
 *Author: Melanie Rosado
 *Date: Oct 15, 2020
 *Description: 
 */
public class Book {
	private String title;
	private String author;
	private int currentPage;
	private int pageCount;
	private boolean beingRead;
	
	public Book(String tl, String au, int cp, int pc, boolean br) {
		title = tl;
		author = au;
		currentPage = cp;
		pageCount = pc;
		beingRead = br;
	}
	
	public void startBook() {
		beingRead = true;
		System.out.println("You are currently reading " + title + " by " + author + ".");
	}
	
	public int getPageNumber() {
		return currentPage;
		
	} 
	
	public void turnPage() {
		System.out.println("Flip!");
		currentPage += 1;
		
	}
	
	public void tellPage() {
		System.out.println("You are on page " + currentPage + ".");
	}
	
	public void finishBook() {
		beingRead = false;
		System.out.println("You are no longer reading " + title + " by " + author + ".");
	}
	
	public void getProgress() {
		System.out.println("You are " + (double)(currentPage) / (pageCount) + "%" + " of the way through " + title + " by " + author + ".");
	}
}
