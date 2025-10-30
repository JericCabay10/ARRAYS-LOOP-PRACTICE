package Operators;

public class SumAllElementInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {4, 5}};
        int sum = 0;

        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                sum += matrix[a][b];
            }
        }
        System.out.println("Sum of all element in matrix is: " + sum);
    }
}
