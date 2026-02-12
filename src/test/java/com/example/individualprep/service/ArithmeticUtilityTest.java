package com.example.individualprep.service;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArithmeticUtilityTest {

    @Autowired
    private ArithmeticUtility arithmeticUtility;

    @Test
    void testAdd() {
        assertEquals(5.0, arithmeticUtility.add(2.0, 3.0));
        assertEquals(0.0, arithmeticUtility.add(-2.0, 2.0));
        assertEquals(-5.0, arithmeticUtility.add(-2.0, -3.0));
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, arithmeticUtility.subtract(3.0, 2.0));
        assertEquals(-4.0, arithmeticUtility.subtract(-2.0, 2.0));
        assertEquals(0.0, arithmeticUtility.subtract(5.0, 5.0));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, arithmeticUtility.multiply(2.0, 3.0));
        assertEquals(-6.0, arithmeticUtility.multiply(-2.0, 3.0));
        assertEquals(0.0, arithmeticUtility.multiply(0.0, 5.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, arithmeticUtility.divide(6.0, 3.0));
        assertEquals(-2.0, arithmeticUtility.divide(-6.0, 3.0));
    }

    @Test
    void testExponent() {
        assertEquals(8.0, arithmeticUtility.exponent(2.0, 3));
        assertEquals(1.0, arithmeticUtility.exponent(5.0, 0));
        assertEquals(16.0, arithmeticUtility.exponent(2.0, 4));
        assertEquals(0.5, arithmeticUtility.exponent(2.0, -1));
    }
}