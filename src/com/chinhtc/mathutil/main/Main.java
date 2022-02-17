/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinhtc.mathutil.main;

import com.chinhtc.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {
    
    public static void main(String[] args) {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("check 0!; expected: " + expected + "; actual: " + actual);
        expected = 720;
        actual = MathUtil.getFactorial(6);
        System.out.println("check 6!; expected: " + expected + "; actual: " + actual);
        
        System.out.println("Check if an exception is thrown!!!");
        MathUtil.getFactorial(-5);
    }
}
