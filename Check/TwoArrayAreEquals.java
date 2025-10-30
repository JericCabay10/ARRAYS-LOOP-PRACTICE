package Check;

public class TwoArrayAreEquals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean isEqual = true;
        
        if(arr1.length != arr2.length) {
            isEqual = false;
        }else {
            for(int a = 0; a < arr1.length; a++) {
                if(arr1[a] != arr2[a]) {
                    isEqual = false;
                    break;
                }
            } 
        }

        if(isEqual) {
            System.out.println("Two arrays are equal length and element");
        }else {
            System.out.println("Two arrays are not equal length and element");
        }
    }
}
