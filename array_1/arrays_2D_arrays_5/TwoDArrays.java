package intermediate.array_1.arrays_2D_arrays_5;

public class TwoDArrays {

	public static void main(String[] args) {

		int mat[][] = { { 3, 8, 9, 2 }, { 1, 2, 3, 6 }, { 4, 10, 11, 17 } };

		// (Q1) Given Mat[n][m], print row wise sum
		// here n(row length) = 3 & m(col length) = 4;
		System.out.println("O/P of Q1");
		printRowWiseSum(mat);

		// (Q2) Given Mat[n][m], print column wise sum
		System.out.println("O/P of Q2");
		printColumnWiseSum(mat);

		// (Q3) Given A Square Mat[n][n] (Square matrix - which have same length of row
		// & col)
		// print diagonal - (i) left to right (ii) right to left
		int mat2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("O/P of Q3 (i)");
		printDiagonalLeftToRight(mat2);
		System.out.println("O/P of Q3 (ii)");
		printDiagonalRightToLeft(mat2);

		// (Q4) Given A Mat[n][m] Rectangular Matrix, print all diagonal going Right to
		// Left.
		int mat3[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		System.out.println("O/P of Q4");
		printDiagonalofOthRow(mat3);
		printDiagonalofMminus1Column(mat3);

		// (Q5) Given a Mat[n][n] Square Matrix, find the transpose in ith place means
		// O(1) space complexity, means you have to transpose the same array, not
		// creating new.
		int mat4[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("O/P of Q5");
		System.out.println("Original Matrix");
		printSquareMatrix(mat4);
		transposeSquareMatrix(mat4);
		System.out.println("After Transpose");
		printSquareMatrix(mat4);

		// (Q6) Given a Square Matrix Mat[n][n]. Rotate it by 90 degree in clockwise
		// direction, with bottom right as center.
		int mat5[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		System.out.println("O/P of Q6");
		System.out.println("Original Matrix");
		printSquareMatrix(mat5);
		System.out.println("Matrix After Rotating 90 degrees");
		rotateSquareMatrixBy90Degree(mat5);
		printSquareMatrix(mat5);

	}

	// (Q1) (Time Complexity - O(N*M) Space Complexity - O(1))
	public static void printRowWiseSum(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		for (int row = 0; row < n; row++) {
			int sum = 0;
			for (int column = 0; column < m; column++) {
				sum += mat[row][column];
			}
			System.out.println("Row[" + row + "] Wise Sum - " + sum);
		}
	}

	// (Q2)(Time Complexity - O(N*M) Space Complexity - O(1))
	public static void printColumnWiseSum(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		for (int column = 0; column < m; column++) {
			int sum = 0;
			for (int row = 0; row < n; row++) {
				sum += mat[row][column];
			}
			System.out.println("Column[" + column + "] Wise Sum - " + sum);
		}
	}

	// (Q3) (i) (Time Complexity - O(N) Space Complexity - O(1))
	public static void printDiagonalLeftToRight(int[][] mat2) {
		int row = 0;
		int col = 0;
		int n = mat2.length;
		while (row < n) {
			System.out.println(mat2[row][col]);
			row++;
			col++;
		}
	}

	// (Q3) (ii) (Time Complexity - O(N) Space Complexity - O(1))
	public static void printDiagonalRightToLeft(int[][] mat2) {
		int row = 0;
		int col = mat2.length - 1;
		int n = mat2.length;
		while (row < n && col >= 0) {
			System.out.println(mat2[row][col]);
			row++;
			col--;
		}
	}

	// (Q4) (Time Complexity - O(N*M) Space Complexity - O(1))

	public static void printDiagonal(int mat3[][], int i, int j) {
		int n = mat3.length;
		while (i < n && j >= 0) {
			System.out.print(mat3[i][j] + " ");
			i++;
			j--;
		}
		System.out.println();
	}

	public static void printDiagonalofOthRow(int mat3[][]) {
		for (int j = 0; j < mat3[0].length; j++) {
			printDiagonal(mat3, 0, j);
		}
	}

	public static void printDiagonalofMminus1Column(int mat3[][]) {
		for (int i = 1; i < mat3.length; i++) {
			printDiagonal(mat3, i, mat3[0].length - 1);
		}
	}

	// (Q5) (Time Complexity - O(N^2) Space Complexity - O(1))
	public static void transposeSquareMatrix(int mat4[][]) {
		int temp = 0;
		for (int i = 0; i < mat4.length; i++) {
			for (int j = i + 1; j < mat4.length; j++) {
				temp = mat4[i][j];
				mat4[i][j] = mat4[j][i];
				mat4[j][i] = temp;
			}
		}
	}

	public static void printSquareMatrix(int mat4[][]) {
		for (int i = 0; i < mat4.length; i++) {
			for (int j = 0; j < mat4.length; j++) {
				System.out.print(mat4[i][j] + " ");
			}
			System.out.println();
		}
	}

	// (Q6)
	public static void rotateSquareMatrixBy90Degree(int mat5[][]) {
		// to rotate matrix by 90 degrees, first we have to transpose the matrix
		// then we need to reverse each row.

		transposeSquareMatrix(mat5); // 1st step done.
		int temp = 0;
		for (int i = 0; i < mat5.length; i++) {
			for (int j = 0; j < mat5.length / 2; j++) {
				temp = mat5[i][j];
				mat5[i][j] = mat5[i][(mat5.length - 1) - j];
				mat5[i][(mat5.length - 1) - j] = temp;
			}
		}
	}

}
