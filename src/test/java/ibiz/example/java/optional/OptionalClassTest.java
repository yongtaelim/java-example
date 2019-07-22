package ibiz.example.java.optional;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.util.TestPropertyValues.Pair;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

public class OptionalClassTest {
	private OptionalClass optionalClass;
	
	@Before
	public void setUp() {
		this.optionalClass = new OptionalClass();
	}
	
	@Test
	public void orElseThrowTest() throws Exception {
		optionalClass.orElseThrow("");
	}
	
	@Test
	@Ignore
	public void orElseThrowOptionalStringTest() throws Exception {
		String s = null;
		System.out.println(optionalClass.orElseThrowOptional(s));
	}
	
	@Test
	@Ignore
	public void orElseThrowOptionalIntTest() throws Exception {
		int i = 1;
		System.out.println(optionalClass.orElseThrowOptional(i));
	}
	
	@Test
	@Ignore
	public void orElseThrowOptionalCollectionTest() throws Exception {
		Collection<String> c = new HashSet<String>();
		System.out.println(optionalClass.orElseThrowOptional(c));
	}
	
	@Test
	@Ignore
	public void orElseThrowOptionalMapTest() throws Exception {
		Map<String, Object> m = new HashMap<String, Object>();
		System.out.println(optionalClass.orElseThrowOptional(m));
	}

	@Test
	@Ignore
	public void test() {
		Collection<String> c = new HashSet<String>();
		c.add("asdf");
//		c.add("a");
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("a", "a");
		String s = "a";
		System.out.println(ObjectUtils.isEmpty(c));
		System.out.println(ObjectUtils.isEmpty(m));
		System.out.println(ObjectUtils.isEmpty(s));
	}
}
