class Geeks {
    static boolean search(long arr[], long n, long x) {
        // Your code here

        searchb(arr, x, 0, arr.length - 1);
    }

    static boolean searchb(long arr[], long x, int left, int right) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] > x) {
                return searchb(arr, x, left, mid - 1);
            }
            if (arr[mid] < x) {
                return searchb(arr, x, mid + 1, right);
            }

        }
        return false;
        
    }
}