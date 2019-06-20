import java.util.Scanner;
public class PaidAdvisor extends Person {


	float regularPayRate;
	float specialPayRate;
	float overtimePayRate;
	float hoursReg;
	float hoursOvertime;
	float hoursSpecial;
	float hoursWorked;
	float payRate;	
	
	public PaidAdvisor(String firstName, String lastName) {
	
		super(firstName, lastName);

		regularPayRate = 0;
		specialPayRate = 0;
		overtimePayRate = 0;
		hoursReg = 0;
		hoursOvertime = 0;
		hoursSpecial = 0;
	}

	public String toString(String firstName, String lastName, String calculatePay) {
		String result = super.toString();
		result += calculatePay;
		return result;
	}

	public float calculatePay(float payRate, float hoursWorked) {
		float result = hoursWorked * payRate;
		return result;

	}

	public float getPayRate(float regularPayRate, float overtimePayRate, float hoursReg, float hoursOvertime) {
		regularPayRate = hoursReg * 25;
		overtimePayRate = hoursOvertime * (regularPayRate * 1.5f);
		float payRate = regularPayRate + overtimePayRate;
		return payRate;

	}

	public float getHoursWorked(float hoursReg, float hoursOvertime) {
		float hoursWorked = hoursReg + hoursOvertime;
		return hoursWorked;

	}

	public String setNameRatehours(String firstName, String lastName, float payRate, float hoursWorked) {
		 String name = firstName+ ' ' + lastName;
		 float result = payRate;
		 float resulth = hoursWorked;
		 return name + result +resulth; 
	}

}