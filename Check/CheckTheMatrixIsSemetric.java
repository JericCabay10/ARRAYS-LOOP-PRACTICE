package Check;

public class CheckTheMatrixIsSemetric {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};

        boolean isSemtric = true;

        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                System.out.print(matrix[b][a] + " ");
            }
            System.out.println();
        }

        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                if(matrix[a][b] != matrix[b][a]) {
                    isSemtric = false;
                    break;
                }
            }
        }
        if(isSemtric) {
            System.out.println("\nThe matrix is symmetric.");
        }else {
            System.out.println("\nThe matrix is not symmetric.");
        }
    }
}
