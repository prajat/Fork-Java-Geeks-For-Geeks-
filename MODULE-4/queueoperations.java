import java.util.*;

class Geeks {

    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k) {

        // Your code here
        q.add(k);

    }

    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k) {

        // Your code here

        int count = 0;

        // Iterator i = q.iterator();
        // while (i.hasNext()) {
        // if (i.next()==1) {
        // count++;
        // }
        // }
        for (Integer i : q) {

            if (i == k) {
                count++;
            }
        }
        return count;

    }

}