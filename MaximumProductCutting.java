import java.io.*;

class MaxProduct {

    static int maxProd(int length) {
        if (length == 0 || length == 1) return 0;

        int maxValue = 0;
        for (int i = 1; i < length; i++) {
            maxValue = Math.max(maxValue,
                Math.max(i * (length - i), maxProd(length - i) * i));
        }

        return maxValue;
    }   

    public static void main(String[] args) {
        System.out.println("Maximum Product is " + maxProd(10));
    }
}
