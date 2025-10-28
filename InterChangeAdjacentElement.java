public class InterChangeAdjacentElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        //Display The Current Array
        System.out.print("Current array = ");
        for(int array : arr) {
            System.out.print(array + " ");
        }

        //Create a sorting for loop structure
        for(int a = 0; a < arr.length - 1; a += 2) {
            int temp = arr[a];
            arr[a] = arr[a + 1];
            arr[a + 1] = temp;
        }

        //Diplay the new array
        System.out.print("\nNew array = ");
        for(int newArr : arr) {
            System.out.print(newArr + " ");
        }

        System.out.println();
    }
}
