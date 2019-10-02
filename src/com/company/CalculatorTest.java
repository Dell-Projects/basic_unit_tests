package com.company;

import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    int int1;
    int int2;

    Calculator calculator = new Calculator(10,5);

    @BeforeEach
    public void setUp(){
        int1 = 5;
        int2 = 10;
    }

    @Test
    public void validateAdd(){
        assertEquals(15,calculator.add());
    }

    @Test
    public void subtract() {
        assertEquals(5, calculator.subtract());
    }

    @Test
    public void multiply() {
        assertEquals(50, calculator.multiply());
    }

    @Test
    public void divide() {
        assertEquals(2, calculator.divide());
    }

    @Test
    public void invalidDivision(){
        Calculator calculator = new Calculator(10,0);
        assertThrows(IllegalArgumentException.class,() ->{
            calculator.divide();
        });
    }

    @Test
    public void operateAdd() {
        assertEquals(15, calculator.operate('+'));
    }

    @Test
    public void operateSub() {
        assertEquals(5, calculator.operate('-'));
    }

    @Test
    public void operateMult() {
        assertEquals(50, calculator.operate('*'));
    }

    @Test
    public void operateDiv() {
        assertEquals(2, calculator.operate('/'));
    }

    @Test
    public void operateDivError() {
        Calculator calculator = new Calculator(10,0);
        assertThrows(IllegalArgumentException.class,() ->{
            calculator.operate('/');
        });
    }

    @Test
    public void booleanAnd() {
        Calculator calculator = new Calculator(true, true);
        assertEquals(true, calculator.and(true, true));
    }

    @Test
    public void booleanOr() {
        Calculator calculator = new Calculator(true, true);
        assertTrue(calculator.or(true, true));
    }

    @Test
    public void booleanXor() {
        Calculator calculator = new Calculator(true, true);
        assertFalse(calculator.xor(true, true));
    }

    @Test
    public void main() {
    }
}