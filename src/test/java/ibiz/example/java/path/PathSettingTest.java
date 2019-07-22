package ibiz.example.java.path;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.core.io.Resource;

public class PathSettingTest {

	private PathSetting pathSetting;
	
	@Before
	public void setUp() {
		pathSetting = new PathSetting();
	}
	
	@Test
	@Ignore
	public void getResourceTest() throws IOException {
		String fileName = "application.properties";
		Resource resource = pathSetting.getResource(fileName);
		System.out.println(resource.getFile().getPath());
	}
	
	@Test
	@Ignore
	public void setResourceTest() throws IOException {
		String fileName = "Test.log";
		String firstPath = "test";
		String[] paths = {"1", "2"};
		String setResource = pathSetting.createResourceFile(fileName, firstPath, paths);
		System.out.println(setResource);
	}
	
	@Test
	public void getPathTest() {
		String firstPath = "firstPaths";
		String[] paths = {"second", "third", ""};
		String path = pathSetting.getPath(firstPath, paths);
		System.out.println(path);
	}
}
