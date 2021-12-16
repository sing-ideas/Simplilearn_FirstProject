package practice_Project;
import java.util.Scanner;

public class calculator_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner DataEntry = new Scanner(System.in);
		
		
		while (true) //while loop begins
		{
			System.out.println("Arithmetic calculation options listed below...select anyone" );
			System.out.println("1 = Addition");
			System.out.println("2 = Subraction");
			System.out.println("3 = Multiplication");
			System.out.println("4 = Division");
			
		System.out.println("Select your calculation = " );
		int option = DataEntry.nextInt();	
				
		System.out.println("Enter the value ofnumber A:");
		int A = DataEntry.nextInt(); // declaring variable 1
		
		System.out.println("Enter the value ofnumber B:");
		int B = DataEntry.nextInt(); // declaring variable 2
		
			if (option==1)
			{
			System.out.println("Value of " + A + "+" + B + " = " + (A+B));
			}
		else if (option == 2)
			{
			System.out.println("Value of " + A + "-" + B + " = " + (A-B));
			}
			
		else if (option == 3)
			{
			System.out.println("Value of " + A + "x" + B + " = " + (A*B));
			}

		else if (option == 4)
			{
			System.out.println("Value of " + A + "/" + B + " = " + (A/B));
			}
		else 
			{
			System.out.println ("Out of scope, no such option");
			}
			
			System.out.println ("Thank you for using the app. The End");
			System.out.println ("");
			System.out.println ("-----------------*******---------------");
			System.out.println ("");
			
		} //while loop ends here
		
	}

}
