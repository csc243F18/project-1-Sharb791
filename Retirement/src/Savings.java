/////////////////////////////////////////////////////////////////////////////
//Author:					Stephen Harbeck
//Creation Date:			9/8/18
//Due Date:					9/18/18
//Class:					CSC243- Java Programming
//Professor: 				Demarco
//Purpose:					This project is designed to take in 2 inputs for  
//the savings every year and the years until retirement 
//and calculate the total savings and interest on the total savings amount.
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.text.DecimalFormat;

public class Savings {

	public static void main(String[] args) {
		double numYears;
		double save;

		// Scanner reads in inputs to use them
		Scanner retire = new Scanner(System.in);

		// Creates a do while loop for the user to input information then loops if the
		// user puts in an invalid value
		do {
			System.out.print("Please enter the number of years until you want retire: ");
			numYears = retire.nextDouble();

			System.out.print("Please enter the amount of money you can save every year: $");
			save = retire.nextDouble();

			// Sets bounds for what can be entered
			if ((numYears > 0 && numYears < 100) && save > 0) {
				System.out.println("You will retire in " + numYears + " year(s).");
				System.out.println("You will save $" + save + " each year.");

				
				DecimalFormat dot = new DecimalFormat("#.00");
				double interest;

				// Sets interest rate as a constant
				final double IN_RATE = .05;
				
				// Creates the formula for interest
				interest = (save * IN_RATE) * numYears;
				System.out.println("There will be $" + dot.format(interest) + " in interest on your savings.");

				double totalSavings;

				// Creates the formula for the total savings
				totalSavings = (save * numYears) - interest;
				System.out.println("The total amount saved before you retire is $" + dot.format(totalSavings));
				System.out.println("  ");
				break;

				// This else statement just prints out an Invalid entry prompt to the user.
			} else {
				System.out.println("Please enter a value greater than 0!");
				System.out.println("  ");
			}

			// This will create the loop until valid values are entered
		} while (true);
		// Program is terminated
	}

}