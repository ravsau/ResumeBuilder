import java.util.*;

public class ResumeApp {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);
		Boolean more=true;
		ArrayList eduArray = new ArrayList();
		ArrayList skillArray = new ArrayList();





		System.out.println("Enter your Name: ");

		String name=sc.nextLine();

		System.out.println("Enter your email : ");

		String email=sc.nextLine();

		int counter=1;

		System.out.println("How many work experience do you have?");

		int workCount=sc.nextInt();
		sc.nextLine();

		String [] workArray= new String[workCount];

		if (workCount>0){
			workArray= new String[workCount];
			for (int i =1; i<=workCount ; i++)
			{

				System.out.println("Enter your Job title for job "+ i +" ");

				String title= sc.nextLine();
				
				System.out.println("Enter your Employer for job "+ i +" ");

				String employer= sc.nextLine();
				
				System.out.println("Enter your start date for job "+ i +" ");

				String startDate= sc.nextLine();
				
				System.out.println("Enter your end date for job "+ i +" ");

				String endDate= sc.nextLine();
				
				System.out.println("Enter your duty for job "+ i +" ");

				String duty1= sc.nextLine();
				
				System.out.println("Enter your another duty for job "+ i +" ");

				String duty2= sc.nextLine();
				
				workArray[i-1]= title+ "\n" + employer +","+ startDate+"-"+endDate+"\n"+"-Duty 1 : "+duty1
						+ "\n"+"-Duty 2 : "+duty2 ;
			}
		}


		//---------------------------------------------------Education Section-------------------------------------------------------------

		do{


			System.out.println("Enter your Educational Degree no " + counter+": ");

			String education=sc.nextLine();
			
			System.out.println("Enter your School Name " + counter+": ");

			String schoolName=sc.nextLine();
			
			System.out.println("Enter your Graduation Year " + counter+": ");

			String gradDate=sc.nextLine();

			eduArray.add(education+"\n"+schoolName+","+gradDate);

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


		//------------------------------------Skills----------------------------------------------------


		do{


			System.out.println("Enter an Skill you have: " );

			String skill=sc.nextLine();

			System.out.println("Enter your proficieny (1-3) Familiar(1) Proficient(2) Highly Skilled(3) : " );

			int  skillLevel=sc.nextInt();

			sc.nextLine();

			String level = null;

			switch(skillLevel){

			case 1:
				level= "Familiar";
				break;
			case 2:
				level="Proficient";
				break;
			case 3: 
				level= "Highly Skilled";


			}

			skillArray.add(""+skill+ ", " + level);


			String choice;
			do{
				System.out.println("Do you have more skills (y/n): ");


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
		
		// Starts Printing Resume 
		
		
		System.out.println("=============================================================");

		System.out.println(name);
		
		System.out.println(email);
		System.out.println("\n");
		
		System.out.println("--------------------------------------------------------");

		System.out.println("Education");
		System.out.println("");

		for (int i=0;i<eduArray.size();i++){

			System.out.println(eduArray.get(i));

		}

		System.out.println("\n");
		System.out.println("--------------------------------------------------------");
		System.out.println("Experience");
		System.out.println("--------------------------------------------------------");
		System.out.println("");



		for (int i=0;i<workCount;i++){


			System.out.println("work experience "+(i+1) +" " +workArray[i]);
		}


	

		System.out.println("--------------------------------------------------------\nSkills");
		System.out.println("--------------------------------------------------------\n");

		for (int i=0;i<skillArray.size();i++){
			System.out.print("Skill"+ (i+1)+ ": ");
			System.out.println(skillArray.get(i));

		}
		

		System.out.println("=============================================================");
	}

}
