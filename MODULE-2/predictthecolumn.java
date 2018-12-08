import java.util.HashMap;

class predictthecolumn {

    static int columnWithMaxZero(int a[][], int n) {

        // Your code here
        int[] arr = new int[a[0].length];


        
        for (int c = 0; c < a[0].length; c++) {
            for (int r = 0; r < a.length; r++) {
                if (a[r][c] == 0) {
                    arr[c]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ans = i;
            }
        }

    }
}