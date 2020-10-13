// ------------------------------------------------------- 
// Assignment 2 - Q3
// COMP 248 Section (S) – Winter 2019
// --------------------------------------------------------
// This is a CellPhone plan comparison service that provide the user with three different plans
// cost for 2 years after asking the user for number of lines he needs and what phone he wants
// and adds a $10 discount for each line added in addition to a $10 discount if the user
// brings his own phone.

import java.util.Scanner;
public class PhonePlans {

	public static void main(String[] args) {
		//declaration of the scanner object
		Scanner Scan = new Scanner(System.in);
		
		//Phones prices in case of outright 
		final double GOOGLE = 1269.00;
		final double SAMSUNG = 1599.00;
		final double IPHONE = 1809.99;
		
		//line prices.
		int linePriceA= 70;
		int linePriceB= 89;
		int linePriceC= 120;
		
		//declares and initializes 2 kinds of variables of type double
		//to store the results of user input.
		double planA= 0, resultA = 0;
		double planB= 0, resultB = 0;     
		double planC= 0, resultC = 0;
		
		//welcome message.
		System.out.println("        Welcome to CellPhoneHub Plans ");
		System.out.println("        ----------------------------- ");
		System.out.println();
		
		//asks the user for number of lines needed.
		System.out.print("Please enter the number of phone lines"
				+ " you need (1-5): ");
		int num = Scan.nextInt();
		
		//for loop statement to ask necessary questions for each line.
		for (int line=1; line<=num; line++) {
			
			//asks if user need a phone with the line.
			System.out.println("\nline "+ line+ " Info:");
			System.out.print("Do you need a phone with this line (y/n): ");
			String phone = Scan.next();
			
			//if no phone needed a discount of 10$ is added and plans become:
			if (phone.equalsIgnoreCase("n")) {
				planA+= (linePriceA-10) * 24;
				planB+= (linePriceB-10) * 24;
				planC+= (linePriceC-10) * 24;
			} 
			//if phone needed then no discount is added and regular line prices as indicated above.
			else if (phone.equalsIgnoreCase("y")) {
				
				//asks user if he wants to purchase the phone outright.
				System.out.print("Do you want to purchase the phone outright (y/n): ");
				String outright = Scan.next();
				//asks user for which phone he wants.
				System.out.print("Please enter 1 for Google, 2 for Samsung or 3 for iPhone: ");
				int brand= Scan.nextInt();
				
				//in case of yes for outright 
				if (outright.equalsIgnoreCase("y")) {
					//if user input= 1, plan becomes price of Google phone(outright) + price of line. 
					if (brand == 1) {
						planA+= GOOGLE + (linePriceA*24);
						planB+= GOOGLE + (linePriceB*24);
						planC+= GOOGLE + (linePriceC*24);
					}
					//if user input= 2, plan becomes price of Samsung phone(outright) + price of line.
					else if (brand == 2) {
						planA+= SAMSUNG + (linePriceA*24);
						planB+= SAMSUNG + (linePriceB*24);
						planC+= SAMSUNG + (linePriceC*24);
					}
					//if user input= 3, plan becomes price of Iphone phone(outright) + price of line.
					else if (brand == 3) {
						planA+= IPHONE + (linePriceA*24);
						planB+= IPHONE + (linePriceB*24);
						planC+= IPHONE + (linePriceC*24);
					}
				}
				//in case of no for outright 
				else if (outright.equalsIgnoreCase("n")) {
					//Plan becomes price of phone(Google, Samsung or Iphone) + price of line.
					if (brand == 1) {
						planA+= 779.00 + (linePriceA*24);
						planB+= 429.00 + (linePriceB*24);
						planC+= 0.00 + (linePriceC*24);
					}
					else if (brand == 2) {
						planA+= 1189.00 + (linePriceA*24);
						planB+= 839.00 + (linePriceB*24);
						planC+= 639.00 + (linePriceC*24);
					}
					else if (brand == 3) {
						planA+= 1339.00 + (linePriceA*24);
						planB+= 939.00 + (linePriceB*24);
						planC+= 819.99 + (linePriceC*24);
					}	
				}
			}
			//stores the result of each loop into one variable.
			resultA=planA;
			resultB=planB;
			resultC=planC;
			
			//adds a $10 discount when another line is added.
			linePriceA= 70-10;
			linePriceB= 89-10;
			linePriceC= 120-10;
		
		}	//End of for loop.	
		
		//displays the final result of each plan.
		System.out.println("\nPlans summary");
		System.out.println("---------------");
		System.out.println("\nTotal cost for 2 years with plan A will be $"+ resultA);
		System.out.println("Total cost for 2 years with plan B will be $"+ resultB);
		System.out.println("Total cost for 2 years with plan C will be $"+ resultC);
		System.out.println("\n-----------------------------------");
		System.out.println("Thanks for using CellPhoneHub Plans");
		
		//closes the scanner object.
		Scan.close();
		
	}	//end of main().
}	//end of class PhonePlans.