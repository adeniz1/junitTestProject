package task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {


    //Exercise 1
    @ParameterizedTest
    @ValueSource(ints = {1982, 1908, 1916, 1924, 1972})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        GregorianCalendar cal = new GregorianCalendar(year, 1, 1);
        Calendar c = new Calendar(year);

        if (c.isLeapYear() == true) {
            assertEquals(cal.get(GregorianCalendar.YEAR), c.year);
        } else {
            assertTrue(c.isLeapYear());
        }
    }

    //Exercise 2
    @ParameterizedTest
    @ValueSource(ints = {1924,1928,1980,1928,1944,1956,1964,1988,1992,1996,1956})
    public void should_return_true(int year) {
        Calendar c = new  Calendar(year) ;
        assertTrue(c.isLeapYear()) ;
    }
    @ParameterizedTest
    @ValueSource(ints = {1913,1918,1921,1938,1966,1973,1982,1998})
    public void should_return_false(int year) {
        Calendar c =new Calendar(year) ;
        assertFalse(c.isLeapYear());
    }
    @ParameterizedTest
    @ValueSource( ints = {1600,1604,1600,1824,1804,1820})
    public void should_return_false_for_numbers_smallerThan1900(int year) {
        Calendar c = new Calendar(year) ;
        assertFalse(c.isLeapYear()) ;
    }

    @ParameterizedTest
    @ValueSource(ints  = {4000,2004,2008,2020})
    public void should_return_false_for_numbers_greaterThan2000(int year){
        Calendar c = new Calendar(year) ;
        assertFalse(c.isLeapYear()) ;
    }



}