public class MatrixAdd {
    public static void main(String[] args) {
        int row = 3, col = 3;
        int[][] matrix1 = {
            {10, 20, 30},
            {30, 40, 50},
            {60, 70, 80}
        };
        int[][] matrix2 = {
            {90, 90, 90},
            {100, 100, 100},
            {110, 110, 110}
        };
        int[][] result = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Result: ");
        printMatrix(result);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
