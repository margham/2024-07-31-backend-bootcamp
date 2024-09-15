package week06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathTest {
	
	math maths = new math();

	@Test
	void testMultiplyReturnsCorrectValue() {

		int product = maths.multiply(2, 5);
		assertEquals(10, product);
	}
	@
	Test
	void testDivideReturnsCorrectValues() {
		double result = maths.divide(5,2);
		assertEquals(2.5, result);
	}
	
	@Test
	void testIsPositiveReturnsTrue() {
		int a = 5;
		assertTrue(maths.isPositiveNumber(a));
	}
	
	//test edge cases to make sure they throw the expected exceptions
	@Test
	void testIntDivideThrowsExceptionDividingByZero() {
		assertThrows(ArithmeticException.class, () -> maths.intDivide(5, 0));
	}
}
