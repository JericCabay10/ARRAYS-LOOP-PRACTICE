public class SortElementInDescendingOrder {
    public static void main(String[] args) {
         int[] arr = {4, 2, 5, 1, 3};

         for(int a = 0; a < arr.length - 1; a++) {
            for(int b = 0; b < arr.length - a - 1; b++) {
                if(arr[b] < arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
         }

         for(int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
         }
         System.out.println();
    }
}
