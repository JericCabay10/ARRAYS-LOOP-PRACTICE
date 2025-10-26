public class CopyTheElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] newArr = new int[arr.length];

        for(int a = 0; a < arr.length; a++) {
            newArr[a] = arr[a];
        }

        for(int b = 0; b < newArr.length; b++) {
            System.out.print(newArr[b] + " ");
        }
        System.out.println();
    }
}
