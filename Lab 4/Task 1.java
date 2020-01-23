
public class Lab4n1 {
	public static double Task1 (double arr[]) {
		double sum = 0;
		for (double n : arr) {
			if (n > 3) sum += n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		try {
		System.out.println("Task 1 - " + Task1(arr));
		} catch (Exception ex) {
			System.out.println("Exception! " + ex.getMessage());
		}
	}

}