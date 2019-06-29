import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {

		float hoursSpecial;
		float hoursOvertime=0;
		float hoursReg = 0;
		float hours;

		Scanner scan = new Scanner(System.in);
		
			System.out.println("What is your first name?");
			String firstName = scan.next();
		

			System.out.println("What is your last name?");
			String lastName = scan.next();
			


			System.out.println("How many hours did you work this week?");
			hours = scan.nextFloat();
		
			System.out.println("How many special session hours did you work this week?");
			hoursSpecial = scan.nextFloat();

			if (hours - hoursSpecial <= 30) {
				hoursReg = hours;
				
			}

			if (hours - hoursSpecial > 30) {
				hoursOvertime = hours - hoursSpecial - 30;
				hoursReg = 30;
			}
			
			PaidAdvisor employee = new PaidAdvisor(firstName, lastName, hoursReg, hoursSpecial, hoursOvertime );
			
			employee.setNameRatehours(firstName, lastName, hours, hoursSpecial, hoursOvertime);
		
		
		
	}

}
