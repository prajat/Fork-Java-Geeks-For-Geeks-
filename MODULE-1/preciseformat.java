import java.text.DecimalFormat;

class Geeks {

    static void printInFormat(float a, float b) {
        float result = a / b;

        // Your code here to print upto 3 decimal places
        DecimalFormat ft = new DecimalFormat("#.###");
        System.out.println(result + " " + ft.format(result));
    }

}