import java.util.LinkedHashMap;
import java.util.Map;

import jav.util.*;

class Geeks {
    static void sameFreq(int arr1[], int arr2[]) {
        // Java

        LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();

        for (int i = 0; i < arr1.length; i++) {

            if (map1.containsKey(arr1[i])) {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            } else {
                map1.put(arr1[i], 1);
            }

        }
        for (int i = 0; i < arr2.length; i++) {

            if (map2.containsKey(arr2[i])) {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            } else {
                map2.put(arr2[i], 1);
            }

        }

        int flag = 0;
        // for (Map.Entry<Integer, Integer> i : map2.entrySet()) {
        //     if (i.getValue()==map1.get(i.getKey())) {

        //             flag = 1;
        //             System.out.print(i.getKey() + " ");

        //     }
        // }
        for (int i = 0; i < arr2.length; i++) {
            if (map1.containsKey(arr2[i])) {
                if (map1.get(arr2[i]) == map2.get(arr2[i])) {
                    flag = 1;
                    System.out.print(arr2[i]+" ");
                }
            }
        }
        if (flag == 0) {
            System.out.print(-1);
        }

    }
}