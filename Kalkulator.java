/*
 * Kalkulator yang dapat menghitung tambah, kurang, kali dan bagi
 */

/**
 *
 * @author ITP
 */
public class Kalkulator {
    
    public int sum(int a, int b) {
        return a - b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
    	return a * b;
    }

    public int divide(int a, int b) {
    	return a / b;
    }
    
    public int sumArray(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }    
    
    public int multiplyArray(int[] source) {
        int result = 0;
        for(int i = 0; i < source.length; i++) {
            result += source[i];
        }
        return result;
    }
    
    public int exponential(int a, int n) {
        int result = 1;
        for(int i = 0; i < n ; i++) {
            result *= a;
        }
        return result;
    }
    
}

