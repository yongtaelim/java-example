package ibiz.example.java.validation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ValidationCheckTest {

	private ValidationCheck validationCheck;
	@Before
	public void setUp() {
		validationCheck = new ValidationCheck();
	}
	
	@Test
	@Ignore
	public void isEmptyCollectionTest() {
		Collection<String> strings = new ArrayList<String>();
		strings.add("asdf");
		boolean emptyCollection = validationCheck.isEmptyCollection(strings);
		assertThat(emptyCollection).isTrue();
	}
	
	@Test
	public void objectRequireTest() {
		Object object = null;
		validationCheck.objectRequire(object);
	}
}
