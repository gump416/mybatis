package com.ezen.mybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //123순서(자주씀)
//@TestMethodOrder(MethodOrderer.MethodName.class) //ABC순서
public class JUnitTest2 {
	@Test
	@Order(3)
	void testC() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(1)
	void testB() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(2)
	void testA() {
		assertEquals(2, 1 + 1);
	}
}


