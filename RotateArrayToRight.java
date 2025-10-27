public class RotateArrayToRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for(int array : arr) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
