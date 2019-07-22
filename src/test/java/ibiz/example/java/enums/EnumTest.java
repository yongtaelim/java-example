package ibiz.example.java.enums;

import org.junit.Test;

import ibiz.example.java.enums.JavaEnum;

public class EnumTest {
	@Test
	public void enumTest() {
		System.out.println(JavaEnum.SWITCH_TEST1.getCode());
		System.out.println(JavaEnum.SWITCH_TEST1.getValue());
	}
}
