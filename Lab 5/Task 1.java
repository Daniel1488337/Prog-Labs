
public class Lab5n1 {

	public static void lolSwap(int[][] matrix) {
		int length = matrix.length;
		int[][] firstRow = new int[1][1];
		firstRow[0] = matrix [0];
		int[][] lastRow = new int[1][1];
		lastRow[0] = matrix [matrix.length-1];
		matrix[0] = lastRow[0];
		matrix[length-1] = firstRow[0];
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int num = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = num;
				num++;
			}
		}
		lolSwap(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}

}
