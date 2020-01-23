import java.util.Arrays;

public class Lab6 {

	static void swap (short[] arr, int index1, int index2) {
		short tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	static void selectionSort(short[] array) {
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
	
	static void insertionSort(short[] array) {
		for (int left = 0; left < array.length; left++) {
			short var = array[left];
			int i = left - 1;
			for (; i >= 0; i--) {
				if (var > array[i]) {
					array[i] = array[i+1]; 
				}
				else {
					break;
				}
			}
			array[i+1] = var;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		short[] array = {3, 5, 2, 7, 4, 8, 10, 9, 11};
		selectionSort(array);
		insertionSort(array);
	}

}
