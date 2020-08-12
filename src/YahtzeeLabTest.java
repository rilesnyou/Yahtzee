import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class YahtzeeLabTest {

	
	@Test
	void test1() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int total = list.getTotal();
		
		assertEquals(15, total);
	}
	
	@Test
	void test2() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(6);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(4);
		
		int total = list.getTotal();
		assertEquals(18, total);
	}
	
	@Test
	void test3() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		
		int total = list.getTotal();
		assertEquals(15, total);
	}
	
	@Test
	void test4() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		int total = list.getTotal();
		assertEquals(20, total);
	}
	
	@Test
	void test5() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(6);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(4);
		
		int total = list.getTotal();
		assertEquals(18, total);
	}
	
	@Test
	void test6() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(4);
		
		int[] fours = list.getFour();
		assertEquals(4, fours);
	}
	
	@Test 
	void test7() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int[] small = list.smallStraight();
		assertEquals(15, small);
	}
	
	@Test
	void test8() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		int[] large = list.largeStraight();
		assertEquals(15, large);
	}
	
	@Test
	void test9() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		
		int yaht = list.getYaht();
		assertEquals(50, yaht);
	}
	@Test
	void test10() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		
		int yaht = list.getYaht();
		assertEquals(50, yaht);
	}
	
	@Test
	void test11() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		
		int[] three = list.threeKind();
		assertEquals(3, three);
	}
	@Test
	void test12() {
		YahtzeeLab list = new YahtzeeLab();
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(1);
		
		int[] three = list.threeKind();
		assertEquals(3, three);
	}

}
