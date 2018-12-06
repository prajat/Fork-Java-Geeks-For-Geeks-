class Geeks {
    static void isPrime(int n) {
        int flag = 1;
        if (n == 1) {
            System.out.println("No");
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                // Your code here
                if (n % i == 0) {
                    flag = 0;

                    break;
                }
            }
            if (flag == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

        // System.out.println();
    }
}