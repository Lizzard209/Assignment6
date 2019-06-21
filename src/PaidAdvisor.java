
public class PaidAdvisor extends Person {


	float regularPayRate;
	float specialPayRate;
	float overtimePayRate;
	float hoursReg;
	float hoursOvertime;
	float hoursSpecial;
	float hoursWorked;
	float payRate;	
	float totalhoursWorked;
	String name;
	float money;
	
	
	
	public PaidAdvisor() {
	
		super(); 
		
		
		regularPayRate = 0;
		specialPayRate = 0;
		overtimePayRate = 0;
		hoursReg = 0;
		hoursOvertime = 0;
		hoursSpecial = 0;
		hoursWorked =0;
		name = "";
		money= 0;
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

	public void setPayRate(float regularPayRate, float overtimePayRate, float hoursReg, float hoursOvertime){
		regularPayRate = hoursReg * 25;
		overtimePayRate = hoursOvertime * (regularPayRate * 1.5f);
	}

	public float getPayRate(float regularPayRate, float overtimePayRate) {
		float payRate = regularPayRate + overtimePayRate;
		return payRate;

	}

	public float getHoursWorked(float hoursReg, float hoursOvertime ) {
		float hoursWorked = hoursReg + hoursOvertime;
		return hoursWorked;
	}


	public void setNameRatehours(String firstName, String lastName, float getPayRate, float gethoursWorked) {
		 String name = firstName+ ' ' + lastName ;
		 float money = getPayRate* gethoursWorked;
	
		
	}
	}

