
public class PaidAdvisor extends Person {

	float regularPayRate;
	float specialPayRate;
	float overtimePayRate;
	float hoursReg;
	float hoursOvertime;
	float hoursSpecial;
	float hoursWorked;	
	float payRate;

	public PaidAdvisor(String lastName, String firstName) {
		regularPayRate = 0;
		specialPayRate = 0;
		overtimePayRate = 0;
		hoursReg = 0;
		hoursOvertime = 0;
		hoursSpecial = 0;
	}

	public String toString(String firstName, String lastName) {
		String name = (firstName + ' ' + lastName);
		return name + ' ' + calculatePay();
	}

	public void calculatePay(float overtimePayRate, float regularPayRate, float specialPayRate, float hoursReg, float hoursSpecial, float hoursOvertime ) {
		 regularPayRate = hoursReg * 25;
		 overtimePayRate = hoursOvertime * (regularPayRate * 1.5f);
		 specialPayRate = hoursSpecial* 50;
	} 

	public float getPayRate(float regularPayRate, float overtimePayRate, float specialPayRate) {
		return payRate = regularPayRate +overtimePayRate +specialPayRate; 
		
	}

	public float getHoursWorked(float hoursReg, float hoursSpecial, float hoursOvertime) {
		return hoursWorked = hoursReg+ hoursSpecial + hoursOvertime;
		
	}
	public String setNameRatehours(String name, float payRate,float hoursWorked) {
		return name + payRate+ hoursWorked;
	}
}