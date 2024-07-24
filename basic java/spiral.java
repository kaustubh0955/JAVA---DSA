import java.util.ArrayList;
import java.util.List;

public class spiral {
    public static List<Integer> spiralOrder(int matrix[][]) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // Bottom
            for (int j = endCol - 1; j >= startCol && startRow != endRow; j--) {
                result.add(matrix[endRow][j]);
            }

            // Left
            for (int i = endRow - 1; i > startRow && startCol != endCol; i--) {
                result.add(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        return result;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);

        // Print the result
        for (Integer num : result) {
            System.out.print(num + " ");
        }
    }
}
