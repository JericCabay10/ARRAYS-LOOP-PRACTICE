public class FindReverseElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int a = arr.length - 1; a >= 0; a--) {
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }
}
