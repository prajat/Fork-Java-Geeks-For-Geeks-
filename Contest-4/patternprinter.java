import java.util.Queue;

class Geeks {
    static void patternPrint(Queue<Character> q) {
        // Your code here

        int[] arr = new int[q.size()];
        int i = 0;
        while (q.isEmpty()) {
            int x = q.poll();
            arr[i] = x;
            i++;

        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            System.out.print(arr[left]);
            System.out.print(arr[right]);
            
        }
    }
}