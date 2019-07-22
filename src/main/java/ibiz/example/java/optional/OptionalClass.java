package ibiz.example.java.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class OptionalClass {

	public Optional<String> createEmptyOptional() {
		return Optional.empty();
	}
	
	public Optional<String> createValueOptional(String string) {
		return Optional.of(string);
	}
	
	/**
	 * 인자로 null값이 넘어올 땐 empty를 넘겨줌
	 * @param string
	 * @return
	 */
	public Optional<String> createNotNullOptional(String string) {
		return Optional.ofNullable(string);
	}
	
	public void ifPresentOptional(String string) {
		Optional<String> optStr1 = Optional.ofNullable(string);
		optStr1.ifPresent(s -> System.out.println(s));
		
		Optional<String> optStr2 = Optional.ofNullable(null);
		optStr2.ifPresent(s -> System.out.println(s));
	}
	
	public String orElseOptional(String string) {
		Optional<String> optStr = Optional.ofNullable(string);
		return optStr.orElse("test");	// null 이면 test 반환
	}
	
	public String orElseGetOptional() {
		Optional<String> optStr = Optional.ofNullable(null);
		return optStr.orElseGet(this::getDefaultValue);
	}
	
	private String getDefaultValue() {
		return "defaule value";
	}
	
	public <T> T orElseThrowOptional(T value) throws Exception {
		return Optional.ofNullable(value).orElseThrow(() -> new Exception("data is null..."));
	}
	
	public Object orElseThrow(String s) throws Exception {
		return Optional.empty().orElseThrow(() -> new Exception("data is null..."));
	}
	
	@Test
	public void test() {
		String a = "java";
		System.out.println(a.toUpperCase());
	}
}
