import java.util.*;
class Geeks {

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {

        // Your code here
        // Just insert k in q
        q.add(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {

        // Your code here
        // If k is in q return true else return false
        if (q.contains(k)) {
            System.out.println("true");
        } else {
        System.out.println("false");
            
        }

    }

    // Function to delete the element from queue
    static int delete(PriorityQueue<Integer> q) {
        // Your code here
        // Delete the max element from q. The priority queue property might be useful
        // here
        int x = q.poll();
        return x;

    }

}