import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		float hoursSpecial;
		float hoursOvertime;
		float hoursReg = 0;
		float hours;

		Person employee = new Person();

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first name");
		firstName = scan.toString();
		
		hours = scan.nextFloat();System.out.println("What is your last name?");
		lastName = scan.toString();
		
		System.out.println("How many hours did you work this week?");
		hours = scan.nextFloat();

		System.out.println("How many special session hours did you work this week?");
		hoursSpecial = scan.nextFloat();
		
		if (hours - hoursSpecial <= 30) {
			hours = hoursReg;
		}

		if (hours - hoursSpecial > 30) {
			hoursOvertime = hours - hoursSpecial - 30;
			hoursReg = hours - hoursOvertime - hoursSpecial;
		}
		
	
			
		
			
			
			
		}
	


		
	}


