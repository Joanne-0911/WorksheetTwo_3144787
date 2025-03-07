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
        assertEquals(123, Conversions.stringToInteger("123"));
        assertEquals(-456, Conversions.stringToInteger("-456"));
        assertThrows(NumberFormatException.class, () -> Conversions.stringToInteger("abc"));
	}

	@Test
	void testIntegerToString() {
		fail("Not yet implemented");
	}

	@Test
	void testSwitchCase() {
		fail("Not yet implemented");
	}

}
