public class Lab3n1 {

	//@author Volozhaninov
	
	public static double row (double t, double s) {
		if (s < 0 || t > 0) {
			throw new IllegalArgumentException("param s = " + s + " param t = " + t);
		}
		double sum = 0;
		int i = 1;
		double ex = Math.log(-t*i) * Math.cos(Math.sqrt(s*(1/Math.pow(i, 2))));
		for (int k = 3; k <= 25; k++) {
			sum += ex;
			i++;
		}
		return sum;
	}
	
	public static void printResults (double t, double s) {
		System.out.print("t: " + t + " s: " + s + " result: ");
		try {
			System.out.println(row(t,s));
		} catch (IllegalArgumentException e) {
			System.out.println("Exception! " + e.getMessage());
		}
	}
	
    public static void main(String[] args) {
    	printResults(-1,1);
    	printResults(0,0);
        printResults(-2,2);
        printResults(0,Double.MAX_VALUE);
        printResults(-2,Double.MAX_VALUE);
        printResults(-1,Double.NaN);
    }
    
}
