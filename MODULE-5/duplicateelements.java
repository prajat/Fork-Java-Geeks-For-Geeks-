import java.util.*;
 
class Geeks {
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n) {
        // Your code hereLInked

        Arrays.sort(arr);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > 1) {
                flag = 1;
                System.out.print(i.getKey() + " ");
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }



    }

}