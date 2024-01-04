package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Arithmetic_testTest {

	@Test
	void test1() {
		Arithmetic_test obj1 = new Arithmetic_test();
		int t1 = obj1.add(12, 12);
		assertEquals(24, t1);
	}

	@Test
	void test2() {
		Arithmetic_test obj1 = new Arithmetic_test();
		int t2 = obj1.mul(12, 12, 1);
		assertEquals(144, t2);
	}

	@Test
	void test3() {
		Arithmetic_test obj1 = new Arithmetic_test();
		double t3 = obj1.div(12, 4);
		assertEquals(3, t3);
	}

}
