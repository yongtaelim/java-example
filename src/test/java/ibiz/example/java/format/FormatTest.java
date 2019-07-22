package ibiz.example.java.format;

import org.junit.Before;
import org.junit.Test;

public class FormatTest {
	private Format format;
	
	@Before
	public void setUp() {
		format = new Format();
	}
	
	@Test
	public void stringFormatTest() {
		String a = "testtesttest";
		format.stringFormat(a);
		System.out.println(format.stringFormat(a));
	}
	
	@Test
	public void longFormatTest() {
		long l = 1L;
		System.out.println(format.longFormat(l));
	}
}
