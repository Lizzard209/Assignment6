import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {

		float hoursSpecial;
		float hoursOvertime;
		float hoursReg = 0;
		float hours;
		float payRate=0;
		float hoursWorked=0;

		Scanner scan = new Scanner(System.in);

		Person employee = new Person();
		

		System.out.println("What is your first name?");
		String firstName = scan.next();

		System.out.println("What is your last name?");
		String lastName = scan.next();

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
		employee.setNameRatehours(firstName, lastName, payRate, hoursWorked);
		//whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
	}

	
	

}
