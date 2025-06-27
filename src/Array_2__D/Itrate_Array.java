package Array_2__D;

public class Itrate_Array {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  |  ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Second way--

        int[][] array = new int[3][3]; // 3 rows and 3 columns

// Assign values
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + "  |  ");
            }

            System.out.println(); // Move to next line after each row
        }


    }
}
