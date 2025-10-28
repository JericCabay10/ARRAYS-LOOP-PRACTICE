import java.util.*;

public class PairElementEqualToSum {
    static Scanner input = new Scanner(System.in);

    public static void TwoPairElement() {
        int[] arr = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
        
        while(true) {
            System.out.print("Enter value: ");
            int sum = input.nextInt();

            for(int a = 0; a < arr.length; a++) {
                for(int b = 0; b < arr.length; b++) {
                    if(arr[a] + arr[b] == sum) {
                        System.out.println(arr[a] + " + " + arr[b] + " = " + sum);
                    }
                }
            }
        }
    }

    public static void ThreePairElement() {
        int[] arr = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};

        while(true) {
            System.out.print("Enter a value: ");
            int sum = input.nextInt();

            for(int a = 0; a < arr.length; a++) {
                for(int b = 0; b < arr.length; b++) {
                    for(int c = 0; c < arr.length; c++) {
                        if(arr[a] + arr[b] + arr[c] == sum) {
                            System.out.println(arr[a] + " + " + arr[b] + " + " + arr[c] + " = " + sum);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.print("Enter (1 to 10): ");
            int choice = input.nextInt();

            if(choice == 1) {
                TwoPairElement();
            }else if(choice == 2) {
                ThreePairElement();
            }
        }        
    }
}
