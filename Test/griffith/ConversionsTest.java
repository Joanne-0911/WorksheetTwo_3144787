package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testEuroToDollar() {
        assertEquals(1.1, Conversions.euroToDollar(1), 0.01);
        assertEquals(11, Conversions.euroToDollar(10), 0.01);
        assertEquals(0, Conversions.euroToDollar(0), 0.01);

	}

	@Test
	void testDollarToEuro() {
        assertEquals(0.91, Conversions.dollarToEuro(1), 0.01);
        assertEquals(9.1, Conversions.dollarToEuro(10), 0.01);
        assertEquals(0, Conversions.dollarToEuro(0), 0.01);

	}

	@Test
	void testStringToInteger() {
	}

	@Test
	void testIntegerToString() {

	}

	@Test
	void testSwitchCase() {

	}

}
