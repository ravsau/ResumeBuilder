import java.util.Scanner;

public class ResumeApp {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);
		Boolean more=true;

		System.out.println("Enter your Name: ");

		String name=sc.nextLine();

		System.out.println("Enter your email : ");

		String email=sc.nextLine();

		int counter=1;


		do{


			System.out.println("Enter your education no " + counter+": ");

			String education=sc.nextLine();

			String choice;
			do{
			System.out.println("Do you have more Educational Achievements (y/n): ");


			 choice=sc.next();
			
			if (choice.equals("y")){
				
				more=true;
			}
			
			else if (choice.equals("n")){
				
				more=false;
			}
					
			else {
				
				System.out.println("Invalid Choice");
			}
			
			}while(!((choice.equals("y")) || choice.equals("n"))  ) ;
			
			sc.nextLine();




			counter = counter+1;

		}while(more == true);

	}

}
