package ibiz.example.java.format;

public class Format {
	public String stringFormat(String s) {
		return String.format("String Format Test %s...", s);
	}
	
	public String longFormat(long l) {
		return String.format("Long Format Test %s...", l);
	}
}
