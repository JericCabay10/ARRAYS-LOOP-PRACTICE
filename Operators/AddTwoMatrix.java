package Operators;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        for(int a = 0; a < matrix1.length; a++) {
            for(int b = 0; b < matrix2.length; b++) {
                System.out.println(matrix1[a][b] + " + " + matrix2[a][b] + " = " + (matrix1[a][b] + matrix2[a][b]));  
            }
        }


    }
}
