package test1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
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
		assertEquals(4, t3, "value should be 3");
	}

	@Test
	@DisplayName("Array reverse testing")
	
	 void test4() {
		Arithmetic_test obj1 = new Arithmetic_test();
		int[] arr = { 1, 2, 3, 4 };
		int[] a = new int[arr.length];
		a = obj1.rev_arr(arr);
//		int[] b = new int[arr.length];
		int[] b = { 4, 3, 2, 1 };

//		for (int i = 0; i < b.length; i++) {
////			System.out.print(b[i] + ", ");
//			b[i] = a[i];
//		}

		assertArrayEquals(b, a);
	}
	
//	@Test
//	@BeforeAll
//	static void test5{
//		System.out.println("Running test 5");
//	}
}
