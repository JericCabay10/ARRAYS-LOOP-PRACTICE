public class FindCommonsElementInTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 6, 7, 8, 5};

        System.out.print("Common element in two arrays: ");

        for(int a = 0; a < arr1.length; a++) {
            for(int b = 0; b < arr2.length; b++) {
                if(arr1[a] == arr2[b]) {
                    System.out.print(arr1[a] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}