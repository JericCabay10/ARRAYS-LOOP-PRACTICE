public class CumulativeSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] cumSum = new int[arr.length];
        
        cumSum[0] = arr[0];

        for(int a = 1; a < arr.length; a++) {
            cumSum[a] = cumSum[a - 1] + arr[a];
        }

         //Display The Current Array
        for(int a = 0; a < cumSum.length; a++) {
            System.out.println(arr[a] + " = " + cumSum[a]);
        }
        System.out.println();
    }
}
