package ibiz.example.java.type;

import org.junit.Before;
import org.junit.Test;

public class TypeChanageTest {

	private TypeChange typeChange;
	
	@Before
	public void setUp() {
		this.typeChange = new TypeChange();
	}
	
	@Test
	public void StringArrayToStringTest() {
		String[] s = new String[] {};
		String stringArrayToString = typeChange.StringArrayToString(s);
		System.out.println(stringArrayToString.substring(1, stringArrayToString.length()-1));
		String substring = stringArrayToString.substring(1, stringArrayToString.length()-1);
		System.out.println(substring);
	}
}
