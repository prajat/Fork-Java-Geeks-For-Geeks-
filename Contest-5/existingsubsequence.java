import java.util.*;

class Geeks {
    static void hasSubseq(int arr1[], int arr2[]) {

        // Your code here.

        int count = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
            }
        }
        if (count == arr2.length) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}