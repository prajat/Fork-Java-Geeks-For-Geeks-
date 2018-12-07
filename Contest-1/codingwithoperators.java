class GfGFunction {

    /*
     * Function to do the operations. Arguments : a, b and c
     */
    static void operations(int a, int b, int c) {

        // Your code here
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        
        System.out.println(result);
        System.out.println(result ^ c);
        System.out.println(result%c);

    }

}