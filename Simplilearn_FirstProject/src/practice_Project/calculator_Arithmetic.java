package practice_Project;
import java.util.Scanner;

public class calculator_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner DataEntry = new Scanner(System.in);
		
		
		while (true)
		{
			
			System.out.println("Addition = 1");
			System.out.println("Subraction = 2");
			System.out.println("Multiplication = 3");
			System.out.println("Division = 4");
			
		System.out.println("Select your calculation" );
		int option = DataEntry.nextInt();	
		
		
		System.out.println("Enter the value ofnumber A:");
		int A = DataEntry.nextInt(); // declaring variable 1
		
		System.out.println("Enter the value ofnumber B:");
		int B = DataEntry.nextInt(); // declaring variable 2
		
			if (option==1)
			{
			System.out.println("Value of " + A + "+" + B + "=" + (A+B));
			}
		else if (option == 2)
			{
			System.out.println("Value of " + A + "-" + B + "=" + (A-B));
			}
			
		else if (option == 1)
			{
			System.out.println("Value of " + A + "x" + B + "=" + (A*B));
			}

		else if (option == 3)
			{
			System.out.println("Value of " + A + "/" + B + "=" + (A/B));
			}
		else 
			{
			System.out.println ("Thank you for using the app");
			}
				
		} //while loop ends here
		
	}

}
