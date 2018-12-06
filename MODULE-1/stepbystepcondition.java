class Geeks {
    static void isDivisibleByPrime(int n) {
        // Your code here
        if (n % 11 == 0) {
            System.out.println("ELEVEN");
        }
        else if(n%3==0){
            System.out.println("THREE");
        }
        else if (n % 2 == 0) {
            System.out.println("TWO");

        }
        else {
            System.out.println("-1");

        }

        
    }
}