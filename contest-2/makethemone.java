class Geeks {
    static void makeThemOne(int mat[][], int R, int C) {
        int row[] = new int[R];
        int col[] = new int[C];
        int i, j;

        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        /*
         * Modify the input matrix mat[] using the above constructed row[] and col[]
         * arrays
         */
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}