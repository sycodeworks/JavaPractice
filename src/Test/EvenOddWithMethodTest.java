package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import conditionalStatements.EvenOddWithMethod;

class EvenOddWithMethodTest {

	  EvenOddWithMethod evenOdd = new EvenOddWithMethod();

	    @Test
	    void testPositiveEven() {
	        assertEquals("Even", evenOdd.checkEvenOdd(2));
	    }
	    
	    @Test
	    void testPositiveEvenGreaterthanTwo() {
	        assertEquals("Even", evenOdd.checkEvenOdd(4));
	    }

	    @Test
	    void testPositiveOdd() {
	        assertEquals("Odd", evenOdd.checkEvenOdd(3));
	    }
	    
	    @Test
	    void testPositive1Odd() {
	        assertEquals("Odd", evenOdd.checkEvenOdd(27));
	    }

	    @Test
	    void testNegativeEven() {
	        assertEquals("Even", evenOdd.checkEvenOdd(-2));
	    }

	    @Test
	    void testNegativeOdd() {
	        assertEquals("Odd", evenOdd.checkEvenOdd(-3));
	    }

	    @Test
	    void testZero() {
	        assertEquals("Even", evenOdd.checkEvenOdd(0));
	    }

	    @Test
	    void testMaxInteger() {
	        assertEquals("Odd", evenOdd.checkEvenOdd(Integer.MAX_VALUE));
	    }

	    @Test
	    void testMinInteger() {
	        assertEquals("Even", evenOdd.checkEvenOdd(Integer.MIN_VALUE));
	    }

}
