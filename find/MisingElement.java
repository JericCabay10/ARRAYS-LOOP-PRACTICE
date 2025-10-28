package find;

public class MisingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int length = 5;

        int expectedSum = length * (length + 1) / 2;
        int actualSum = 0;

        for(int a = 0; a < arr.length; a++) {
            actualSum += arr[a];
        }

        int missingElem = expectedSum - actualSum;

        System.out.println("The missing element is: " + missingElem);
    }
}
