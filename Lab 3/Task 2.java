public class Lab3n2 {

	//@author Volozhaninov
	
	public static double row (double t, double i) {
		double sum = 0;
		if (i > 2) {
			if (t >= 1 || t <= -1) {
				throw new IllegalArgumentException("param t = " + t); //sin -1 < t < 1
			}
		int k = 1;
		double ex = Math.sin(t)/k;
		for (int f = 1; f <= i; f++) {
			sum += ex;
			k++;
		}
		}
		else if (i == 1 || i == 2) {
			sum += Math.log(t);
		}
		else {
			throw new IllegalArgumentException("param i = " + i);
		}
		return sum;
	}
	
	public static void printResults (double t, double i) {
		System.out.print("t: " + t + " i: " + i + " result: ");
		try {
			System.out.println(row(t,i));
		} catch (IllegalArgumentException e) {
			System.out.println("Exception! " + e.getMessage());
		}
	}
	
    public static void main(String[] args) {
    	printResults(0.5,3);
    	printResults(0.2,1);
        printResults(-1,3);
        printResults(0.5,11111);
        printResults(-2,Double.MAX_VALUE);
        printResults(-1,Double.NaN);
    }
    
}
