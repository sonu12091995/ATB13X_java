package Array_2__D;

public class Transpose_matrix {
    public static void main(String[] args) {

        // Original matrix (2 rows, 3 columns)
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transposed matrix (3 rows, 2 columns)
        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "  |  ");
            }
            System.out.println();
        }    }
}
