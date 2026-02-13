package com.example.individualprep.service;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VectorUtilityTest {

    @Autowired
    private VectorUtility vectorUtility;

    @Test
    void testVectorAdd() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] result = vectorUtility.add(v1, v2);
        assertArrayEquals(new double[]{5.0, 7.0, 9.0}, result);
    }

    @Test
    void testVectorAddNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(null, new double[]{1.0}));
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(new double[]{1.0}, null));
    }

    @Test
    void testVectorAddDifferentSizesThrowsException() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }

    @Test
    void testVectorSubtract() {
        double[] v1 = {4.0, 5.0, 6.0};
        double[] v2 = {1.0, 2.0, 3.0};
        double[] result = vectorUtility.subtract(v1, v2);
        assertArrayEquals(new double[]{3.0, 3.0, 3.0}, result);
    }

    @Test
    void testVectorSubtractNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(null, new double[]{1.0}));
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(new double[]{1.0}, null));
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    void testVectorMultiply() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] result = vectorUtility.multiply(v1, 2);
        assertArrayEquals(new double[]{2.0, 4.0, 6.0}, result);
    }

    @Test
    void testDotProduct() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        assertEquals(32.0, vectorUtility.dotProduct(v1, v2));
    }

    @Test
    void testDotProductNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(null, new double[]{1.0}));
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(new double[]{1.0}, null));
    }

    @Test
    void testDotProductDifferentSizesThrowsException() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(v1, v2));
    }

    @Test
    void testNorm() {
        double[] v1 = {3.0, 4.0};
        assertEquals(5.0, vectorUtility.norm(v1));
    }

    @Test
    void testNormNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.norm(null));
    }
}

