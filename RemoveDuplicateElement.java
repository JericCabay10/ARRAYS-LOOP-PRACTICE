public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];

        int c = 0;

        for(int a = 0; a < arr.length; a++) {
            boolean isDuplicate = false;
            for(int b = 0; b < c; b++) {
                if(arr[a] == temp[b]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                temp[c] = arr[a];
                c++;
            }
        }

        for(int d = 0; d < c; d++) {
            System.out.print(temp[d] + " ");
        }
        System.out.println();
    }
}
