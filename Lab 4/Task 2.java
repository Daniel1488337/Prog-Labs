
public class Lab4n2 {

	public static int Task2 (int[] arr) {
		int sum = 0;
		for (int i = 0; i<arr.length;i++) {
			if (i % 2 != 0 && arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 4, 6, 6, 7, 7, 8};
		try {
			System.out.println("Task 2 - " + Task2(arr));
		} catch (Exception ex) {
			System.out.println("Exception! " + ex.getMessage());
		}
	}

}
