package average;

public class AverageOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
		int length = arr.length;
		
		int sum = 0;
		
		for(int a = 0; a < length; a++) {
			sum += arr[a];
		}
		
		double average = (double)sum / length;
		
		System.out.println("The average of element in array: " + average);
    }
}
