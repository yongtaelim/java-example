package ibiz.example.java.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

public class IOUtilTest {
	private IOUtil IOUtil;
	
	@Before
	public void setUp() {
		IOUtil = new IOUtil();
	}
	
	@Test
	public void copyTest() throws IOException {
		String a = "asdfasfdasdf";
		InputStream input = new ByteArrayInputStream(a.getBytes());
		OutputStream output1 = new ByteArrayOutputStream();
		
		long copy = IOUtil.copy(input, output1);
		System.out.println(copy);
		assertThat(copy).isNotZero();
		OutputStream output2 = new ByteArrayOutputStream();
		input.reset();
		long copy2 = IOUtil.copy(input, output2);
		System.out.println(copy2);
		assertThat(copy2).isNotZero();
	}
}
