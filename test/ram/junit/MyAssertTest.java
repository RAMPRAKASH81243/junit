package ram.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS", "Azure", "Devops");

	@Test
	void test() {
		boolean test = todos.contains("AWS");

		assertEquals(true, test);

	}
}
