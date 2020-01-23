
public class Lab5n2 {

	public static int[][] multiply(int[][] a, int[][] b) {
		int rowA = a.length;
		int colA = a[0].length;
		int colB = b[0].length;
		int[][] matrix = new int[rowA][colB];
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int c = 0; c < colA; c++) {
				matrix[i][j] += a[i][c] * b[c][j];
				}
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
		int[][] m1 = new int[3][3];
		int num1 = 1;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = num1;
				num1++;
			}
		}
		int[][] m2 = new int[3][3];
		int num2 = 1;
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = num2;
				num2++;
			}
		}
		matrix = multiply(m1,m2);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j != matrix[i].length-1) {
				System.out.print(matrix[i][j] + " ");
				} 
				else {
					System.out.print(matrix[i][j] + "\n");
				}
			}
		}
	}
}
