package edu.chinna.kadhira;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static edu.chinna.kadhira.Util.add;

class UnitTest {
	
	@Test
	public void canaryTest(){
		assertTrue(true);
	}
	
	@Test
	public void integerSumTest(){
		assertEquals(4,add(3,1));
	}
	
	@Test
	public void moduleNameTest(){
		assertEquals("edu.chinna.kadhira.util",edu.chinna.kadhira.Util.class.getModule().getName());
	}
	
}