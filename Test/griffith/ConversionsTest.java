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
		fail("Not yet implemented");
	}

	@Test
	void testStringToInteger() {
		fail("Not yet implemented");
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
