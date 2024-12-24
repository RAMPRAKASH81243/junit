package ram.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mymathtest {

	private Mymath math = new Mymath();

	@Test
	void test() {
		assertEquals(10, math.sum(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	void test1() {
		int[] numbers = {};
		int result = math.sum(numbers);
		int expectedresult = 0;
		assertEquals(expectedresult, result);
	}
}
