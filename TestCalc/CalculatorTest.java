package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void test_add_small_numbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double actual_result = calculator.add(3, 4);

        // Assert
        // compare between actual result and expected result
        double expected_result = 7;

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_min_small_numbers() {

        Calculator calculator = new Calculator();

        double actual_result = calculator.minus(4, 4);

        double expected_result = 0;

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_mul_small_numbers() {

        Calculator calculator = new Calculator();

        double actual_result = calculator.multiply(4, 4);

        double expected_result = 16;

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_div_small_numbers() {

        Calculator calculator = new Calculator();

        double actual_result = calculator.div(4, 4);

        double expected_result = 1;

        assertEquals(expected_result, actual_result);
    }

}
