package spring.test.ch01.ex02.case02;

import static org.junit.Assert.*;
 import java.util.ArrayList;
import org.junit.Test;
import spring.test.ch01.ex02.Nums;

public class NumsTest {
	@Test
	public void testGetGreatest(){
		Nums nums = new Nums(new ArrayList<Integer>());
		assertEquals(1, nums.getGreatest());
	}
	
	@Test
	public void testGetGreatest2(){
		Nums nums = new Nums(new ArrayList<Integer>());
		try{
			nums.getGreatest();
			fail("예외가 발생해야 합니다.");
		}catch(RuntimeException e){
			assertTrue(true);
		}
	}
}
