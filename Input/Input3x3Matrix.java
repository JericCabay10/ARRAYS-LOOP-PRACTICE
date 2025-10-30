package Input;

import java.util.*;

public class Input3x3Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];

        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 3; b++) {
                System.out.print("Element [" + a + "][" + b + "]: ");
                matrix[a][b] = input.nextInt();
            }
        }

        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 3; b++) {
                System.out.print(matrix[a][b] + " ");
            }
        }
        
    }
}
