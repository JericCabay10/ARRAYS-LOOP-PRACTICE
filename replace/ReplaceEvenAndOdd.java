package replace;
public class ReplaceEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int even = 1;
        int odd = 0;

        //Display The Current Array
        System.out.print("Current array = ");
        for(int array : arr) {
            System.out.print(array + " ");
        }

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] % 2 == 0) {
                arr[a] = even;
            }else {
                arr[a] = odd;
            }
        }

        //Display The new Array
        System.out.print("\nCurrent array = ");
        for(int newArr : arr) {
            System.out.print(newArr + " ");
        }
        System.out.println();
    }
}
