package Display;

public class DisplayTransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Before transpose");
        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                System.out.print(matrix[a][b] +" ");
            }
            System.out.println();
        }

        System.out.println("After Transpose");
        for(int a = 0; a < matrix.length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                System.out.print(matrix[b][a] + " ");
            }
            System.out.println();
        }
    }   
}
