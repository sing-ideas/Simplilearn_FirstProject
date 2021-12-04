package practice_Project;
import java.util.Scanner;

public class quizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring th variable here
		int n;
		
				
 //creating scanner object here
		
		Scanner sc = new Scanner(System.in); //create a scanner object
		
		// Displaying the set of quiz options
				
 System.out.println("who is the founder of blue origin?");
 System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos\n5. Exit Program");
 
 System.out.println("Enter your choice 1/2/3/4? ");
 
 	n = sc.nextInt();

 	
 	
 	if (n ==4) {
 		System.out.println("Congratulations !! You have guessed the corret answer");
 				}
	else { 
		System.out.println("Wrong Choice, Please try again");
				}

 	
//}
//}
	
	
	}

}
