class Geeks {
    static void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            // Your code here
            System.out.print((n * multiplier) + " ");
            multiplier--;
        }
        System.out.println();
    }
}