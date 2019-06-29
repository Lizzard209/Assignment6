
public class PaidAdvisor extends Person {

	float regularPayRate;
	float specialPayRate;
	float overtimePayRate;
	float hoursReg;

	float hoursWorked;
	float payRate;
	float totalhoursWorked;
	String name;
	float money;


	public PaidAdvisor(String firstName, String lastName, float hours, float hoursSpecial, float hoursOvertime) {

		super(firstName, lastName);

		
		regularPayRate= 0;
		specialPayRate =0;
		overtimePayRate = 0;
		hoursReg = 0;
		hoursOvertime = 0;
		hoursWorked = 0;
		name = "";
		money = 0;
	}

	public String toString(String firstName, String lastName, float hours, float hoursSpecial, float hoursOvertime) {
		String result = super.toString();
		float calculatePay = calculatePay(hours, hoursSpecial, hoursOvertime);
		result += calculatePay;
		return result;
	}

	public float calculatePay(float hoursReg,  float hoursSpecial, float hoursOvertime ) 
	{
		float hoursWorked = hoursReg + hoursOvertime + hoursSpecial;
		 //hoursOvertime = hoursWorked - hoursSpecial - 30;
		 //hoursReg = hoursWorked -hoursSpecial - hoursOvertime;
		regularPayRate = hoursReg * 25;
		overtimePayRate = hoursOvertime * 45;
		specialPayRate = hoursSpecial * 50;
		float payRate = regularPayRate + overtimePayRate + specialPayRate;
		float result = payRate;
		return result;

	}

	public float getPayRate() {
		return payRate;

	}

	public float getHoursWorked() {
		return hoursWorked;
	}



	public void setNameRatehours (String firstName, String lastName, float hours, float hoursSpecial, float hoursOvertime){
		this.setName(firstName, lastName);
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;

		System.out.println(firstName + ' ' + lastName);
		System.out.println("Paid: " + calculatePay(hours, hoursSpecial, hoursOvertime));
	}

}
