class GfGFunction {

    // Function to find number of jumps
    // N : number inscribed on the last stone.
    // X : number on which we have to reach
    static void findJumps(long N, long X) {

        // Your code goes here
        int countleft = 0;
        int countright = 0;
        // countleft = (X - 1) / 2;
        // countright = (N - X) / 2;
        // System.out.println(Math.min(countleft, countright));
        if (X == 1) {
            System.out.println(0);
        }
        for (int i = 2; i <= N; i += 2) {
            if (X <= i) {
                break;
            }
            countleft++;
        }
        for (int i = N; i >= 1; i -= 2) {
            if (X >= i) {
                break;
            }
            countright++;
        }
        System.out.println(Math.min(countleft, countright));

    }

}