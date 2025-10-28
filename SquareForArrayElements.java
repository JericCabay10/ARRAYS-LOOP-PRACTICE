public class SquareForArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
    
        for(int a = 0; a < arr.length; a++) {
            int num = arr[a];
            int square = 1;
            for(int b = 1; b <= num; b++) {
                square = b * b;
            }
            System.out.println(arr[a] + " = " + square);
        }
    }
}
