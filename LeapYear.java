import java.util.Scanner;

public class LeapYear {

   /* This is a programme that checks whether an input year is a leap year
    */

   public static void main(String []args) {
      Scanner input = new Scanner(System.in);
	  
	  System.out.println("Please enter a year, and I will check whether it is a leap year"); //Give instructions to user
	  
	  //check whether user has entered a valid numerical year
	  while(true){ //Continue checking inputs until a valid input is given
		if(input.hasNextInt()) { //If the user has correctly input a numerical year
		   break; //Continue to rest of programme
		}
		else{
		System.out.println("You did not enter a (numerical) year. Please try again."); //Feedback for user
		input.nextLine(); //Await a new input from user
		}
	  }
	  int year = input.nextInt(); //Set year to check to the input of user
        System.out.println("You entered year " + year); //Give feedback to user that correct input was received
		
		//Perform checks for whether input year is a leap year, and answer user's query
		if (year % 100 == 0 && year % 400 == 0){
			System.out.println("YES. Your entered year is divisible by 100 and 400, and thus a leap year");
		}
		else if (year % 100 == 0 && year % 400 != 0){
			System.out.println("NO. Your entered year is divisible by 100 but not by 400, and thus NOT a leap year");
		}
		else if (year % 4 == 0){
			System.out.println("YES. Your entered year is divisible by 4, and thus a leap year");
		}
		else{
			System.out.println("NO. Your entered year is NOT a leap year");
		}
   }
}