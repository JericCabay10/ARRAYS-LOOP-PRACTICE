public class Frequency {
    public static void FreqEachElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 3, 2, 2};
        int[] freq = new int[arr.length];
        int visited = -1;

        for(int a = 0; a < arr.length; a++) {
            int count = 1;
            for(int b = a + 1; b < arr.length; b++) {
                if(arr[a] == arr[b]) {
                    count++;
                    freq[b] = visited;
                }
            }
            if(freq[a] != visited) {
                freq[a] = count;
            }
        }

        for(int a = 0; a < freq.length; a++) {
            if(freq[a] != visited) {
                System.out.println(arr[a] + " = " + freq[a]);
            }
        }
    }

    public static void MostFreqElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 3, 2, 2};
        int mostFreq = arr[0];
        int maxCount = 0;

        for(int a = 0; a < arr.length; a++) {
            int count = 0;
            for(int b = 0; b < arr.length; b++) {
                if(arr[a] == arr[b]) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                mostFreq = arr[a];
            }
        }
        System.out.println("The most frequency element in array is: " + mostFreq);
        System.out.println("The Frequency of the element is: " + maxCount);
    }


    public static void LeastFreqElement() {
        int[] arr = {1, 1, 2, 4, 3, 5, 4, 5, 2};
        int leastFreq = arr[0];
        int leastCount = Integer.MAX_VALUE;

        for(int a = 0; a < arr.length; a++) {
            int count = 0;
            for(int b = 0; b < arr.length; b++) {
                if(arr[a] == arr[b]) {
                    count++;
                }     
            }

            if(count < leastCount) {
                leastCount = count;
                leastFreq = arr[a];
            } 
        }
        System.out.println("The most least element in array is: " + leastFreq);
        System.out.println("The frequency of element is: " + leastCount);
    }

    public static void main(String[] args) {
        int choice = 3;

        if(choice == 1) {
            FreqEachElement();
        }else if(choice == 2) {
            MostFreqElement();
        }else if(choice == 3) {
            LeastFreqElement();
        }
        
    }
}