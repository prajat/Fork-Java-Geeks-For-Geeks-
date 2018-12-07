class Geeks {
    static void countOddEven(int a[], int n) {

        // Your code here
        int countodd = 0;
        int counteven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countodd++;
            } else if (a[i] % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }

        }
        System.out.println(countodd + " " + counteven);

    }
}