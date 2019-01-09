import java.util.*;

import javax.print.DocFlavor.STRING;

class Geeks {

    /*
     * print the name of the parties along with seats they got in election and print
     * the maximum seat received
     */
    public static void Election2019(String party[], int seats[], int n) {
        // Your code here

        //Arrays.sort(party);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < seats.length; i++) {
            map.put(party[i], seats[i]);

        }
        int max = 0;
        for (int i = 0; i < seats.length; i++) {
            if (max < seats[i]) {
                max = seats[i];
            }
        }
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        System.out.println(max);
    }
}