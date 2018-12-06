import java.util.Scanner;

class takinginput {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) || (++y > 2)) {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }

    // Function to take input using Scanner class
    static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // while (t-- > 0) {

        //     // Your code here
        //     int a = sc.nextInt();
        //     float b = sc.nextFloat();
        //     long c = sc.nextLong();
        //     byte d = sc.nextByte();
        //     String s = sc.nextLine();

        //     System.out.println(a);
        //     System.out.println(b);
        //     System.out.println(c);
        //     System.out.println(d);
        //     System.out.println(s);

        // }
        
                
            }
        }
    