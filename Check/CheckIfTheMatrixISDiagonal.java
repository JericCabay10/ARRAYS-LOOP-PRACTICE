package Check;

public class CheckIfTheMatrixISDiagonal {
    public static void main(String[] args) {
        // --int[][] matrix = {{1, 0, 0}, {0, 5, 0}, {0, 0, 9}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        boolean isDiagonal = true;
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(row != col && matrix[row][col] != 0) {
                    isDiagonal = false;
                    break;
                }
            }
            System.out.println();
        }

        if(isDiagonal) {
            System.out.println("The Matrix is diagonal");
        }else {
            System.out.println("The matrix is not a diagonal.");
        }
    }
}