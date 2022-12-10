package task1;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.rules.*;
import org.junit.rules.ExpectedException ;
import org.junit.Assert.* ;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        int expected =  5+2 ;
        int actual = calculator.add(5,2) ;
        assertEquals(expected,actual) ;
    }

    @Test
    public void Should_subtract_two_numbers_and_return_result() {
        int expected = 10-3  ;
        int actual = calculator.sub(10,3) ;
        assertEquals(expected,actual);
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        int expected = 6*7 ;
        int actual = calculator.multiply(6,7) ;
        assertEquals(expected,actual);

    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        float expected = 10/5 ;
        float actual  =  calculator.divide(10,5) ;
        assertEquals(expected,actual);
    }


    @Test
   public void Should_throw_an_arithmetic_exception_if_denominator_is_zero()  {
    Throwable e = assertThrows(ArithmeticException.class,() -> calculator.divide(20,0));
    assertEquals("ZeroDivisionError", e.getMessage());


    }


}