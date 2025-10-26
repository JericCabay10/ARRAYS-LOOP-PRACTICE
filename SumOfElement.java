public class SumOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		
		for(int a = 0; a < arr.length; a++) {
			sum += arr[a];
		}
		System.out.println("The Sum in array element: " + sum);
    }
}