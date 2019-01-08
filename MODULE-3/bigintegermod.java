import java.math.BigInteger;

class MathematicalOperation {

    static BigInteger mod(BigInteger x, BigInteger y) {
        // Your code here

        BigInteger z = y.mod(x);
        return z;
    }

}