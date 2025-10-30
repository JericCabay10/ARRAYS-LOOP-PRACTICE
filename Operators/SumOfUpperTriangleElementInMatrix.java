package Operators;

public class SumOfUpperTriangleElementInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                if(a <= b) {
                    System.out.print(matrix[a][b] + " ");
                    sum += matrix[a][b];
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("The sum of upper triangle matrix element is: " + sum);
    }
}
