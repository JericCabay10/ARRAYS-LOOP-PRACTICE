public class CountPrimeNumber {
    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 4, 5, 6, 3, 8, 1, 10};
        
        


        for(int a = 1; a < arr.length; a++) {
            int num = arr[a];
            boolean isPrime = true;

            if(num <= 1) {
                continue;
            }

            for(int b = 2; b < num; b++) {
                if(num % b == 0) {
                    isPrime = false;
                    break;
                }
            }
           
            if(isPrime) {
                System.out.print(arr[a] + " ");
            }
        }
        System.out.println();
    }
}
