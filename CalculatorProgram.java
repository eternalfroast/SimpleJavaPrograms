/*****************************************************************************/
//Name: Saurav Pradhan

/***************************************************************************/

/***************************************************************************
This program takes two input from the users which is then used as range of
numbers to be displayed. Also giving the square and the cube of those
respective numbers.

****************************************************************************/

import java.util.Scanner; //importing Scanner to use it on program


public class CalculatorProgram{
	public static void main (String [] args){
	System.out.println("Welcome to Calculator Program\n"); // Displaying the welcome message to the user
	

	System.out.print("Enter the first positive whole number: ");// Display message to prompt user to put in the input
	Scanner newInput = new Scanner(System.in);
	int firstValue = newInput.nextInt(); // take input as integer from the user

	
	System.out.print("Enter the second positive whole number which is greater than the first: ");// Display message to prompt user to put in the input
	int secondValue = newInput.nextInt();// take input as integer from the user
	
	System.out.println("________________________");
	System.out.printf("|"+"Number\t"+ "|"+"Square\t" +"|"+"Cube\t"+"|"+ "\n"); // header of the table
	System.out.println("|-------|-------|-------|");// for the looks of the program
	int displayNumber = 0; // initializing the value of 
	
	/*using for loop to display number from the range that the user have provided **/

	for (displayNumber = firstValue; displayNumber <= secondValue; displayNumber ++){
		int square = (displayNumber * displayNumber); //multiplying displayNumbers to get square

		int cube = (displayNumber * displayNumber * displayNumber); //multiplying displayNumber to get cube

		/*the displayNumber, square and cube are combined with \t to get the table effect. 
		\t works as tab which gives a space*/

		System.out.printf("|"+ displayNumber +"\t" +"|"+square+"\t"+ "|"+cube+"\t"+"|"+"\n" );
		System.out.println("|-------|-------|-------|");// for looks of the program

	}

	System.out.println("\nGoodbye, thank you for using our program");// displaying the goodbye message

	}
}