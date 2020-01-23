
public class Lab3n3 {

	static double sum (double acurracy) {
		if (acurracy <= 0) {
			throw new IllegalArgumentException("Acurracy is less or equal to zero.");
		}
		boolean isActive = true;
		double result = 0;
		int i = 1;
		double current = 0;
		while (isActive) {
			current = (double)1/(i*(i+1));
			if (Math.abs(current) > acurracy) {
			result += current;
			i++;
			}
			else {
				break;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		try {
		System.out.println(sum(0.4));
		System.out.println(sum(0.01));
		System.out.println(sum(0));
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
