import java.util.*;

import com.sun.javafx.image.impl.IntArgb;

class Geeks {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        Integer[] arr1 = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
            
        }
        
        Arrays.sort(arr1, Collections.reverseOrder());
        
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        int ans = 0;
        int min = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() == min) {
                ans = i.getKey();
                break;
            }
        }
        return ans;
        

    }
}