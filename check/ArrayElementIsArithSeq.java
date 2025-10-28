package check;

public class ArrayElementIsArithSeq {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int diff = arr[1] - arr[0];
        boolean isArithmetic = true;


        for(int a = 2; a < arr.length ; a++) {
            if(arr[a] - arr[a - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }

        if(isArithmetic) {
            System.out.println("Array forms an arithmetic sequence.");
        }else {
             System.out.println("Array does NOT form an arithmetic sequence.");
        }
    }
}
