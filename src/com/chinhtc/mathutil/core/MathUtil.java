/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinhtc.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtil {
    
    public static long getFactorial(int n){
        long product = 1;
        
        if (n > 20 || n < 0) 
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}
