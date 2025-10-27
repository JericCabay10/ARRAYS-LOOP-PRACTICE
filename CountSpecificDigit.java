public class CountSpecificDigit {
    public static void main(String[] args) {
        int[] arr = {1, -3 , 2, 3, -1, 0, 4, -5, 4, 5, 5};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] < 0) {
                negative++;
            }else if (arr[a] > 0) {
                positive++;
            }else {
                zero++;
            }
        }

        for(int array : arr) {
            System.out.print(array + " ");
        }

        System.out.println("\nNegative Count: " + negative);
        System.out.println("Positive Count: " + positive);
        System.out.println("Zero Count: " + zero);
    }
}
