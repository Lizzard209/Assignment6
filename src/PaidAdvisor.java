
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

		super(lastName, firstName);

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

	public float calculatePay(float getPayRate, float gethoursWorked) {
		float result = hoursWorked * getPayRate;
		return result;

	}

	public float getPayRate(float regularPayRate, float overtimePayRate, float hoursReg, float hoursOvertime) {
		regularPayRate = hoursReg * 25;
		overtimePayRate = hoursOvertime * (regularPayRate * 1.5f);
		float result = regularPayRate + overtimePayRate;
		return result;

	}

	public float getHoursWorked(float hoursReg, float hoursOvertime) {
		return hoursWorked = hoursReg + hoursOvertime;

	}

	public String setNameRatehours(String name, float getPayRate, float hoursWorked) {
		String result = name + getPayRate + hoursWorked;
		return result;
	}
}