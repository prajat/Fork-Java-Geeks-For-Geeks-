class GfGFunction {

    // Function to print ForkJava
    // N : input number
    static void forkJava(int N) {

        // Your code here
        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("Fork Java");
        } else {

            if (N % 3 == 0) {
                System.out.println("Fork");
            } else {
                System.out.println("Java");
            }
        }

    }

}