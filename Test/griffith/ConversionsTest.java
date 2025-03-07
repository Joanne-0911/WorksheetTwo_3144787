package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testEuroToDollar() {

	}

	@Test
	void testDollarToEuro() {

	}

	@Test
	void testStringToInteger() {
	}

	@Test
	void testIntegerToString() {
        assertEquals("123", Conversions.integerToString(123));
        assertEquals("-456", Conversions.integerToString(-456));
        assertEquals("0", Conversions.integerToString(0));
	}

	@Test
	void testSwitchCase() {
		fail("Not yet implemented");
	}

}
