package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class coutATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA("java");
		assertEquals(2, output);
	}

}
