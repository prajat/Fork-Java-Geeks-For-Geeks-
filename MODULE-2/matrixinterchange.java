class Geeks {

    static void interchange(int a[][], int r, int c) {

        // Your code here
        int x = c - 1;
        int y = 0;
        for (int i = 0; i < r; i++) {

            int temp = a[i][0];
            a[i][0] = a[y][x];
            a[y][x] = temp;
            y++;

        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}