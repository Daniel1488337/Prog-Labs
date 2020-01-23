
//@author Volozhaninov

public class Lab2 {

	static double Task4 (double a, double b, double c, double d) {
		double result = (Math.pow(Math.tan(a), 1/c)) / (1 + (Math.sinh(b) / Math.abs(Math.log(d + c))));
		return result;
	}
	
	static double Task5 (double a, double b, double c, double d) {
		if (c/d >= -1 && c/d <= 1) {
		double result = 2 * Math.cos(Math.pow(a,b)) + Math.abs(Math.acos(-Math.sqrt(c/d)));
		return result;
		}
		else {
			return 0; //arccos is out of range
		}
	}
	
	static double Task6 (double a, double b, double c, double d) {
		double result = 3 * (Math.log10(Math.abs(b/a)) + Math.sqrt(Math.sin(c) + Math.exp(d)));
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Task 4 - " + Task4(3.56,1.02,3,2.43) + "\nTask 5 - " + Task5(2.54,1.23,-2.14,-0.23) + "\nTask 6 - " + Task6(-1.23,-0.34,0.707,2.312));
	}
}
