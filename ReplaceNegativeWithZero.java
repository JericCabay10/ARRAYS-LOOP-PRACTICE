public class ReplaceNegativeWithZero {
    public static void main(String[] args) {
        int[] arr = {-2, 1, 3, -4, 5};

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] < 0) {
                arr[a] = 0;
            }
        }

        for(int newArr : arr) {
            System.out.print(newArr + " ");
        }
        System.out.println();
    }
}
