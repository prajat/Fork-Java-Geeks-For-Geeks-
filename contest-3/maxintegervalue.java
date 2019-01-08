class Geeks {
    static void maxValue(String str) {
        // Your Code here

        int sum = 0;
        for (int i = 0; i < str.length()-1; i++) {
            char cc = str.charAt(i);
            char nc = str.charAt(i + 1);
            int curr = cc - '0';
            int next = nc - '0';
            if (cuur + next > curr * next) {
                sum += curr + next;

            }
            else {
                sum += curr * next;
            }

        }
        System.out.println(sum);

    }
}