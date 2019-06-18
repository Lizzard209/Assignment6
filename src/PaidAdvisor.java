
public class PaidAdvisor extends Person {

	float regularPayRate;
	float specialPayRate;
	float overtimePayRate;
	float hoursReg;
	float hoursOvertime;
	float hoursSpecial;

	public PaidAdvisor(String lastName, String firstName) {
		regularPayRate = 0;
		specialPayRate = 0;
		overtimePayRate = 0;
		hoursReg = 0;
		hoursOvertime = 0;
		hoursSpecial = 0;
	}

	public String toString() {
		return calculatePay();
	}

	String calculatePay() {
		regularPayRate = hoursReg * 25;
		overtimePayRate = regularPayRate * 1.5f;
		specialPayRate = hoursOvertime * 50;
		return null;
	}

}