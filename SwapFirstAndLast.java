public class SwapFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int first = arr[0];
        int last = arr[arr.length - 1];

        //Structure for rotate the array first
        for(int a = 0; a < arr.length - 1; a++) {
            arr[a] = arr[a + 1];
        }

        arr[arr.length - 1] = first;

        // Structure rotate the last
        for(int b = arr.length - 1; b > 0; b--) {
            arr[b] = arr[b - 1];
        }

        arr[0] = last;

        for(int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

        System.out.println();
    }
}
