public class SortElementInDiscendingOrder {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};

        for(int a = 0; a < arr.length - 1; a++) {
            for(int b = 0; b < arr.length - a - 1; b++) {
                if(arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }

        for(int c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + " ");
        }
        System.out.println();
    }
}
