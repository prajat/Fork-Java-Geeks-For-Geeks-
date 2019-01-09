import java.util.*;

class Geeks {
    public static int sumExists(int arr[], int n, int sum) {
        // add your code here

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (set.contains(temp)) {
                return 1;
            }
            set.add(arr[i]);
        }
        return 0;
    }
}