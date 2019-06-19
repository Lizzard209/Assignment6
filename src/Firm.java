import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {

		float hoursSpecial;
		float hoursOvertime;
		float hoursReg = 0;
		float hours;

		Scanner scan = new Scanner(System.in);
			
		System.out.println("What is your first name?");
		String firstName = scan.next().toString();


		System.out.println("What is your last name?");
		String lastName = scan.next().toString();
		
		
		new Person(firstName, lastName);

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