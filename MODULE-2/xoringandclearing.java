import java.util.*;
/**
 * xoringandclearing
 */
public class xoringandclearing {

    public static void main(String[] args) {
        
    }
    
    static void printArr(int arr[], int n) {
        // Your code for printing arr here
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    static void setToZero(int arr[], int n) {
        // use Arrays.fill to set arr to zero

        Arrays.fill(arr, 0);
    }

    static void xor1ToN(int arr[], int n) {

        // Xor arr[i]^i

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] ^ i;
        }

    }
}