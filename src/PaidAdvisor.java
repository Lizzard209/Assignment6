
public class PaidAdvisor extends Person {
	
	float regularPayRate;
	float specialPayRate;
	float overtimePayRate;
	float hoursReg; 
	float hoursOvertime;
	float hoursSpecial;


	public float regularPayRate(){
		return regularPayRate = hoursReg *25;
	}

	public float specialPayRate() {
		return specialPayRate = hoursSpecial*50;
	}
	
	public float overtimePayRate() {
		return hoursOvertime = regularPayRate * 1.5f;
		
	}
	
		
	
}