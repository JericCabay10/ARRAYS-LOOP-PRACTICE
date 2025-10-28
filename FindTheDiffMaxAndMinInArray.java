public class FindTheDiffMaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int max = arr[0];
        int min = arr[0];

        //Create Max structure
        for(int a = 0; a < arr.length; a++) {
            if(arr[a] > max) {
                max = arr[a];
            }
        }

        //Create Min structure
        for(int b = 0; b < arr.length; b++) {
            if(arr[b] < min) {
                min = arr[b];
            }
        }

        int diff = max - min;
        System.out.println("The difference between max and min elements is: " + diff);
    }
}
