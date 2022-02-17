/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinhtc.mathutil.test;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import com.chinhtc.mathutil.core.MathUtil;
import java.sql.SQLException;
import org.junit.Test; //Junit 4
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class MathUtilTest {
    
    //Cac ham de test cac class ben code chinh
    //ko dat trong main() nua
    //tach rieng code de test va code chinh ra 2 noi khac nhau
    
    //Test case #1: check getF() with valud argument
    //n = 0 (0!), expected = 1, actual = ? 
    @Test //annotation, bộ thư viện quy ước phải viết điều này
        //máy ảo jvm biết phải làm gì? -> biến hàm dưới thành main()
    public void testFactorialGivenValidArgumentReturnsWell(){
        
        long expected = 1; //Hy vong 0! = 1
        long actual = MathUtil.getFactorial(0);
        
        assertEquals(expected, actual); // static
    }
    
    //Test case #1: check getF() with valud argument
    //n = 6 (6!), expected = 720, actual = ? 
    @Test //annotation, bộ thư viện quy ước phải viết điều này
        //máy ảo jvm biết phải làm gì? -> biến hàm dưới thành main()
    public void testFactorialGivenValidArgumentN6ReturnsWell(){
        
        long expected = 720; //Hy vong 6! = 720
        long actual = MathUtil.getFactorial(6);
        
        assertEquals(expected, actual); // static
    }
    
    //Case 3: ngoại lệ thì test làm sao
    //ngoại lệ ko phải là giá trị để so sánh
    //nó chỉ có ở hình dạng là: máy xh hay ko mà thôi
    //ko thể xài hàm assertEquals(cần value để compare)
    //nếu ta đưa vào n = -5, số âm, thì ta sẽ nhận về ngoại lệ
    //Thiết kế đúng của hàm, đưa âm, vượt 20, nhận về ngoại lệ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowException(){
        MathUtil.getFactorial(-5); //Non- static
    }
    //chạy như thiết kế thì phải màu xanh cho dù có exception
    //nhưng là exception dc phép xuất hiện
}
