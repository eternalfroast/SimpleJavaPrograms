/*****************************************************************************/
//@author: Saurav Pradhan

/***************************************************************************/

/****************************************************************************
This is Java program to calculate the total charge corresponding to the purchase
of book purchase in the fictional annually conducted book festival.

The prices are listed below:

Large print hardback books $10 each or three for $20
Small print hardback books $7 each or two for $10
All softcover books $5 each or five for $15


****************************************************************************/


import java.util.Scanner; //importing Scanner to use it on program

public class BookPurchase {
	public static void main(String[] args) {
		System.out.println("Welcome to the annual book festival"); // Displaying user with the greeting message

		int largeBookCost, smallBookCost, softCoverCost, threeBookNumbers, twoBookNumbers, totalCost;

		// declaring constants since it's value is not going to change.
		final int EACH_LARGE_BOOK, EACH_SMALL_BOOK, EACH_SOFT_COVER_BOOK;
		final int THREE_LARGE_BOOKS, TWO_SMALL_BOOKS, FIVE_SOFT_BOOKS;

		// initializing the value to constants
		EACH_LARGE_BOOK = 10;
		EACH_SMALL_BOOK = 7;
		EACH_SOFT_COVER_BOOK = 5;
		THREE_LARGE_BOOKS = 20;
		TWO_SMALL_BOOKS = 10;
		FIVE_SOFT_BOOKS = 15;

		int totalSession = 0; // initializing totalSession value as 0 at the beginning
		boolean answer = true; // initializing answer value as true so that the loop below can run

		// this loop will run as long as it is true since answer is true.
		while (answer) {

			System.out.print("Enter the number of large print hardback books purchased:");
			Scanner input = new Scanner(System.in);
			int largeBooks = input.nextInt(); // get the input from the user as integer

			System.out.print("Enter the number of small print hardback books purchased:");
			int smallBooks = input.nextInt();

			System.out.print("Enter the number of softcover books purchased:");
			int softCoverBooks = input.nextInt();

			// calculate the cost of largeBook, smallBook and softCoverBook
			largeBookCost = (largeBooks % 3) * EACH_LARGE_BOOK + (largeBooks / 3) * THREE_LARGE_BOOKS;
			smallBookCost = (smallBooks % 2) * EACH_SMALL_BOOK + (smallBooks / 2) * TWO_SMALL_BOOKS;
			softCoverCost = (softCoverBooks % 5) * EACH_SOFT_COVER_BOOK + (softCoverBooks / 5) * FIVE_SOFT_BOOKS;

			totalCost = largeBookCost + smallBookCost + softCoverCost; // total cost of the book in one session

			System.out.print("Your total bill is: $" + totalCost + "\n"); // \n is used for next line

			totalSession = totalSession + totalCost;

			/* Prompt the user with the message to get input and take string as output **/
			System.out.print("Would you like to calculate another bill (y/n)?");
			String reply = input.next(); // get the input from the user as String

			/* If the user presses "n" then the program will exit out of loop */
			if (reply.equals("n")) {
				answer = false;
			}
		}

		// This will give the output of total session
		System.out.print("Total sales in this session: $" + totalSession + "\n");

		System.out.println("Goodbye!"); // Display the message goodbye to the user

	}
}