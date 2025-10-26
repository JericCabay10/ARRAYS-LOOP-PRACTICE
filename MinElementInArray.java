public class MinElementInArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
		int min = arr[0];
		
		for(int a = 0; a < arr.length; a++) {
			if(arr[a] < min) {
				min = arr[a];
			}
		}
		System.out.println("The maximum element in array is: " + min);
    }
}
