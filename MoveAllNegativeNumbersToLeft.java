public class MoveAllNegativeNumbersToLeft {
    public static void main(String[] args) {
        int[] arr = {6, -1, 4, -3, 5, -2};
        int index = 0;

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] < 0) {
                int temp = arr[a];
                arr[a] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        for(int newArr : arr) {
            System.out.print(newArr + " ");
        }
    }
}
