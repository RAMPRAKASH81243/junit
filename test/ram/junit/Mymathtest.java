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
		assertEquals(0, math.sum(new int[] {}));
	}
}
