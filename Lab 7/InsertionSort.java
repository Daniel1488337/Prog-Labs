import java.util.Arrays;

public class InsertionSort implements SortArray {
	short[] array;
	InsertionSort (short[] array) {
		this.array = array;
	}
	
	public void swap (short[] arr, int index1, int index2) {
		short tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	

	public void doSort () {
		for (int left = 0; left < array.length; left++) {
			int maxIndex = left;
			for (int i = left; i < array.length; i++) {
				if (array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			swap(array,left,maxIndex);
		}
		System.out.println(Arrays.toString(array));
	}

}
