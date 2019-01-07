import java.util.HashSet;

class Geeks {
    static void findPairs(long arr[], int n, long sum) {
        // Your code here


        int flag = 0;
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (temp >= 0 && set.contains(temp)) {
                System.out.println(arr[i] + " " + temp + " " + sum);
                flag = 1;
            }
            set.add(arr[i]);
        }
        if (flag == 0) {
            System.out.println(-1);
        }
        
    }
}