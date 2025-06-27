package Array_2__D;

public class Diagonal_Sum_Matrix {
    public static void main(String[] args) {
        // Sample 3x3 matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primarySum += matrix[i][i];                        // Top-left to bottom-right
            secondarySum += matrix[i][matrix.length - 1 - i];  // Top-right to bottom-left
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
