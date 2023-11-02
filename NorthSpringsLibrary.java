/*
 * test program for Factory Method pattern
 */

public class NorthSpringsLibrary 
{
	public static void main (String [] args)
	{
		System.out.println("\nHere's what we're reading now:");
		BookMaker bm = new MysteryMaker();
		Book b1 = bm.makeBook("Murder on the Orient Express", 1922);
		System.out.println(b1);
		System.out.println("The " + b1.getClass().getName().toLowerCase() 
			+ "'s genre is " + b1.genre());
		BookMaker bm2 = new BiographyMaker();
		Book b2 = bm2.makeBook("Promised Land", 2020);
		System.out.println(b2);
		System.out.println("The " + b2.getClass().getName().toLowerCase() 
			+ "'s genre is " + b2.genre());
		System.out.println("Was " + b1.getTitle() + " published before " 
			+ b2.getTitle() + "? " + (b1.compareTo(b2) < 0 ? "yes" : "no"));
	}
}
