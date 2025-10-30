package Find;

public class FindMaximumInEachRow {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};

        
        for(int a = 0; a < matrix.length; a++) {
            int max = matrix[a][0];
            for(int b = 0; b < matrix.length; b++) {
                if(matrix[a][b] > max) {
                    max = matrix[a][b];
                }
            }
            System.out.println("The max element in each row " + (a + 1) + ": " + max);
        }
    }
}
