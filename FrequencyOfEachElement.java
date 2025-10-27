public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 3, 2, 2};
        int visited = -1;

        int[] freq = new int[arr.length];

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
}
