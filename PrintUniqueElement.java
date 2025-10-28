public class PrintUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,  2, 3, 4, 2, 5, 6, 4, 8, 10, 2};

        for(int a = 0; a < arr.length; a++) {
            boolean isUnique = true;

            for(int b = 0; b < arr.length; b++) {
                if(a != b && arr[a] == arr[b]) {
                    isUnique = false;
                    break;
                }
            }

            if(isUnique) {
                System.out.print(arr[a] + " ");
            }
        }
        System.out.println();
    }
}
