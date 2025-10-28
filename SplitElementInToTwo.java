public class SplitElementInToTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int mid = arr.length / 2;

        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[arr.length - mid];


        for(int a = 0; a < mid; a++) {
            firstHalf[a] = arr[a];
        }

        for(int b = mid; b < arr.length; b++) {
            secondHalf[b - mid] = arr[b];
        }

        System.out.print("First Half = ");
        for(int first : firstHalf) {
            System.out.print(first + " ");
        }

        System.out.print("\nSecond Half = ");
        for(int second : secondHalf) {
            System.out.print(second + " ");
        }
        System.out.println();
    }    
}
