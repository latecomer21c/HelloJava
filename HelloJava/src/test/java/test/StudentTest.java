package test;

import org.junit.Test;
import junit.framework.TestCase;

public class StudentTest extends TestCase{
	
	@Test
	public void testStudent() {
		Student stu = new Student();
		int result = stu.test(1);
		assertEquals(1, result);
	
	}
}
