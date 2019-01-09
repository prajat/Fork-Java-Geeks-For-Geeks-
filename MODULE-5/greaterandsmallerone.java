class Geeks {
    // Function to find elements greater than or equal to K
    public static void greaterKSorted(int arr[], int k) {
        // Your code here
        Set<Integer> mp = new TreeSet<>();
        int c = 0;
        for (int x : arr) {
            mp.add(x);
        }
        for (int x : mp) {
            if (x >= k) {
                System.out.print(x + " ");
                c++;
            }
        }
        if (c == 0)
            System.out.print(-1);
        // else System.out.println();
    }

    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k) {
        // Your code here
        Set<Integer> mp = new TreeSet<>();
        int c = 0;
        for (int x : arr) {
            mp.add(x);
        }
        for (int x : mp) {
            if (x >= k)
                continue;
            System.out.print(x + " ");
            c++;
        }
        if (c == 0)
            System.out.print(-1);
        // else System.out.println();
    }
}