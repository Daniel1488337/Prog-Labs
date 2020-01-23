public class ProgLab7 {
	
	
	public static void main(String[] args) {
		short[] array = {3, 5, 2, 7, 4, 8, 10, 9, 11};
		
		SortArray insertion = new InsertionSort(array);
		insertion.doSort();
		SortArray selection = new SelectionSort(array);
		selection.doSort();
		SortArray bubble = new BubbleSort(array);
		bubble.doSort();
	}

}
