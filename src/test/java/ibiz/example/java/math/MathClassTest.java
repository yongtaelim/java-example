package ibiz.example.java.math;

import org.junit.Before;
import org.junit.Test;

public class MathClassTest {

	private MathClass mathClass;
	
	@Before
	public void setUp() {
		mathClass = new MathClass();
	}
	
	@Test
	public void minTest() {
		double a = 55.0;
		double b = 8.5;
		double c = a-b;
		System.out.println(c);
		double min = mathClass.min(a, b);
		System.out.println(min);
	}
}
