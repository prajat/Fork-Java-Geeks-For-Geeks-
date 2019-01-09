import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class Geeks {
    public static long commonSum(int arr1[], int arr2[]) {
        // Your code here

        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        long sum = 0;

        for (Integer i : set2) {
            if (set1.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }
}