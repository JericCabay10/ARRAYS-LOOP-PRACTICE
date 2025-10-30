package Operators;

public class SumRoWiseOfElements {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix[a].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
        
        for(int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for(int col = 0; col < matrix.length; col++) {
                sum += matrix[row][col];
            }
            System.out.println("The sum of each row " + (row + 1) + ": " + sum);
        }
    }
}

