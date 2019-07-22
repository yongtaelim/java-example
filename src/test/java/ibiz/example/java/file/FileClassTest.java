package ibiz.example.java.file;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import net.lingala.zip4j.exception.ZipException;

public class FileClassTest {
	private String separator = File.separator;
	
	private FileClass fileClass;
	
	@Before
	public void setUp() {
		fileClass = new FileClass();
	}
	
	@Test
	public void unzipTest() throws ZipException {
		String destDir = "C:"+separator+"Users"+separator+"ibizsoftware"+separator+"Desktop"+separator+"testFolder";
		String filePath = "C:"+separator+"Users"+separator+"ibizsoftware"+separator+"Desktop"+separator+"Chaincodes.zip";
		fileClass.unzip(filePath, destDir);
	}
	
}
