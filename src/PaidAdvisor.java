
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
		hoursWorked = 0;
		name = "";
		money = 0;
	}

	public String toString(String firstName, String lastName) {
		String result = super.toString();
		float calculatePay = calculatePay();
		result += calculatePay;
		return result;
	}

	public float calculatePay() {
		float hoursWorked = hoursReg + hoursOvertime+ hoursSpecial;
		float hoursOvertime = hoursWorked - hoursSpecial-30;
		float hoursReg = hoursSpecial- hoursOvertime;
		regularPayRate = hoursReg * 25;
		overtimePayRate = hoursOvertime * (regularPayRate * 1.5f);
		specialPayRate = hoursSpecial*50;
		float payRate = regularPayRate + overtimePayRate + specialPayRate;
		float result = hoursWorked * payRate;
		return result;

	}

	public float getPayRate() {
		return payRate;

	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setNameRatehours(String firstName, String lastName, float payRate, float hoursWorked) {
		this.setName(firstName, lastName);
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;

	}

	
}
