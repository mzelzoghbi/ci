package com.mzelzoghbi.module_a;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }
}