package ibiz.example.java.type;

import java.util.Arrays;

import org.apache.commons.lang3.tuple.Pair;

public class TypeChange {

	public String StringArrayToString(String[] s) {
		return Arrays.toString(s);
	}
	
	public Pair<String, String> stringToPair(String s) {
		String[] stringArray = s.split("/");
		Pair<String, String> p = Pair.of(stringArray[0].trim(), stringArray[1].trim());
		return p;
	}
}
