class custom_Compare {

    // Compare function
    static void sortPairs(Pair arr[], int N) {

        // Your code here

        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.x - p2.x;
            }
        });
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}