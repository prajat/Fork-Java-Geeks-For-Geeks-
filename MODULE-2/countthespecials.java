import java.util.HashMap;
import java.util.Map;

class Geeks {
    static void countSpecials(int a[], int n, int k) {
        int f = (int) Math.floor(n / k);
        // your code here
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet())
        {
            if (i.getValue() == f) {
                count++;
            }
        }
        System.out.println(count);
    }
}