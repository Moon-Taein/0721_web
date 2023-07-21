package my;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class TestMath {

	@Test
	public void testInit() {
		MyMath m = new MyMath();
		assertNotNull(m); // not null 통과
	}

	@Test
	public void testPlus() {
		MyMath m = new MyMath();
		int result = m.plus(10, 20);
		assertEquals(30, result); // equal 이면 통과
	}

	@Test
	public void testRange() {
		MyMath m = new MyMath();
		assertTrue(m.rangeZeroBetweenHund(55));
		assertFalse(m.rangeZeroBetweenHund(6655));
		assertFalse(m.rangeZeroBetweenHund(-130));

	}

	@Test
	public void testSame1() {
		Object o1 = new Object();
		Object o2 = new Object();

		assertNotSame(o1, o2); // 객체 참조 다른 경우 통과
	}

	@Test
	public void testSame2() {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = d1;

		assertSame(d1, d2); // 객체 참조 같은 경우 통과
	}
}