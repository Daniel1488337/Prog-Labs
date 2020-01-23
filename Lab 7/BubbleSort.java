import java.util.Arrays;

public class BubbleSort implements SortArray {
	short[] array;
	BubbleSort (short[] array) {
		this.array = array;
	}
	
	@Override
	public void swap (short[] arr, int index1, int index2) {
		short tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	@Override
	public void doSort () {
		int n = array.length;
		boolean isSorted = false;
		while (!isSorted) {
		for (int i = 0; i < n-1; i++) {
			isSorted = true;
			if (array[i] < array[i+1]) {
				swap (array, i, i+1);
				isSorted = false;
			}
		}
		}
		System.out.println(Arrays.toString(array));
	}
	
}
