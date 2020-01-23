
public class Lab4n3 {

	public static int minArray (int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int[] Task3 (int[] arr) {
		int[] newArr = new int[arr.length];
		int min = minArray(arr);
		if (min != 0) {
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i] / min;
		}
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = 10;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
		try {
		int[] newArr = Task3(arr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("newArr[" + i + "] = " + newArr[i]);
		}
		} catch (Exception ex) {
			System.out.println("Exception! " + ex.getMessage());
		}
	}

}
