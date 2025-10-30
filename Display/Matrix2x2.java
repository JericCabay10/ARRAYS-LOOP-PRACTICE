package Display;

public class Matrix2x2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};

        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix[a].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
        }
        System.out.println();
    }
}
