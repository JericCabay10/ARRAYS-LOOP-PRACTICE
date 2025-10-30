package Operators;

public class SubtractTwoMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
    
        int[][] subtract = new int[3][3];

        for(int a = 0; a < matrix1.length; a++) {
            for(int b = 0; b < matrix2.length; b++) {
                subtract[a][b] = matrix2[a][b] - matrix1[b][a];
                System.out.print(subtract[a][b] + " ");
            }
            System.out.println();
        }
    }
}
