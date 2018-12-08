class Geeks {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // Your code here
        for (int i = 0; i < s.length(); ++i) {
            char cc = s.charAt(i);
            if (cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u') {
                ++v;

            } else if (cc == ' ') {

            } else {
                ++c;
            }
        }

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
}