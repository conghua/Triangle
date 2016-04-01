import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangle {

	@Test
	public void test() {
		Triangle t = new Triangle(5,5,11);
		assertEquals(false,t.isTriangle(t));
		assertEquals((String)"Illegal",t.getType(t));	
	}
	@Test
	public void test1() {
		Triangle t = new Triangle(5,5,8);
		assertEquals(true,t.isTriangle(t));
		assertEquals((String)"Isosceles",t.getType(t));	
	}
	@Test
	public void test2() {
		Triangle t = new Triangle(5,5,5);
		assertEquals(true,t.isTriangle(t));
		assertEquals((String)"Regular",t.getType(t));	
	}
	@Test
	public void test3() {
		Triangle t = new Triangle(5,6,8);
		assertEquals(true,t.isTriangle(t));
		assertEquals((String)"Scalene",t.getType(t));	
	}

}
