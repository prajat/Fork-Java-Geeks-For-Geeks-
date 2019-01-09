import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class Geeks {
    public static void commonSum(int arr1[], int arr2[]) {
        // Your code here

        TreeSet<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        TreeSet<Integer> set2 = new TreeSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
       

        int flag = 0;
        for (Integer i : set2) {
            if (set1.contains(i)) {
                flag = 1;
                System.out.print(i + " ");
            }
        }
        if (flag == 0) {
            System.out.print(-1);
        }
        
    }
}