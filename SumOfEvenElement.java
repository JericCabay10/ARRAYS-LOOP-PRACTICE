public class SumOfEvenElement {
    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 4, 5, 6, 3, 8, 1, 10};

        int sum = 0;

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] % 2 == 0) {
                sum += arr[a];
            }
        }

        System.out.println("Array = ");
        for(int array : arr) {
            System.out.print(array + " ");
        }

        System.out.println("\nSum of even: " + sum);
    }
}
