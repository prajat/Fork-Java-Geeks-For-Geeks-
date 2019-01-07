class Geeks {
    static long findLoner(int arr[], int n) {
        // Your code here

        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

        }
        if (xor > 0) {
            return xor;
        } else {
            return -1;
        }
    }
}