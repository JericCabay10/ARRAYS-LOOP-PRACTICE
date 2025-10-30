package Find;

public class FindMinimumInEachColumn {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};

        for(int a = 0; a < matrix.length; a++) {
            int min = matrix[0][a];
            for(int b = 0; b < matrix.length; b++) {
                if(matrix[b][a] < min) {
                    min = matrix[b][a];
                }
            }
            System.out.println("The max element in each column " + (a + 1) + ": " + min);
        }
    }
}
