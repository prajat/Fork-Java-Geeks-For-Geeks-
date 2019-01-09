class Geeks {
    static void minElements(PriorityQueue<Integer> arr) {
        // Your code here
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int x = arr.poll();
            System.out.print(x + " ");
        }
    }
}