package ibiz.example.java.type;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TypeChanageTest {

	private TypeChange typeChange;
	
	@Before
	public void setUp() {
		this.typeChange = new TypeChange();
	}
	
	@Test
	@Ignore
	public void StringArrayToStringTest() {
		String[] s = new String[] {};
		String stringArrayToString = typeChange.StringArrayToString(s);
		System.out.println(stringArrayToString.substring(1, stringArrayToString.length()-1));
		String substring = stringArrayToString.substring(1, stringArrayToString.length()-1);
		System.out.println(substring);
	}
	
	@Test
	public void stringToPairTest() {
		String s = "48.89MiB / 3.852GiB";
		Pair<String, String> stringToPair = typeChange.stringToPair(s);
		System.out.println(stringToPair.getLeft());
		System.out.println(stringToPair.getRight());
	}
}
