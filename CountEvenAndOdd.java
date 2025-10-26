public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
		
		int even = 0;
		int odd = 0;
		
		for(int a = 0; a < arr.length; a++) {
			if(a % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even Count: " + even);
		System.out.println("Odd Count: " + odd);
    }
}
