public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        int index = 0;

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] != 0) {
                arr[index] = arr[a];
                index++;
            }
        }

        while(index != arr.length) {
            arr[index] = 0;
            index++;
        }

        for(int b = 0; b < arr.length; b++) {
            System.out.print(arr[b] + " ");
        }

        System.out.println();
    }
}
