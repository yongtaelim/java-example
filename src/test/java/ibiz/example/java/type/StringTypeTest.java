package ibiz.example.java.type;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StringTypeTest {

	private StringType stringType;
	
	@Before
	public void setUp() {
		this.stringType = new StringType();
	}
	
	@Test
	public void searchStringTest() {
		String text = "aaaaaaaaaaaaaaaabaaa";
		String searchString = "ab";
		
		boolean result = stringType.searchString(text, searchString);
		assertThat(result).isTrue();
	}
}
