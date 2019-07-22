package ibiz.example.java.util;

import org.junit.Before;
import org.junit.Test;

import ibiz.example.java.util.FunctionalUtil;

public class FunctionalUtilTest {

	private FunctionalUtil functionalUtil;
	
	@Before
	public void setUp() {
		functionalUtil = new FunctionalUtil();
	}
	
	@Test
	public void stringFunctionTest() {
		String[] stringArray = {"test1","test2","test3"};
		String stringFunction = functionalUtil.stringFunction(stringArray);
		System.out.println(stringFunction);
	}
}
