/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITP
 */
public class Kalkulator {
    
    public int sum(int a, int b) {
        return a + b;
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
        int i = 0;
        while ( i < source.length ) {
        	result *= source[i];
        	i++;
        }
        return result;
    }   
    
}

