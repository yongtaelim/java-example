package ibiz.example.java.path;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class PathSetting {
	private DefaultResourceLoader defaultResourceLoader;
	
	public PathSetting() {
		defaultResourceLoader = new DefaultResourceLoader();
	}
	
	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public Resource getResource(String fileName) {
		return defaultResourceLoader.getResource("classpath:"+fileName);
	}
	
	public Resource getResource(String firstPath, String... paths) {
		Path path = Paths.get(firstPath, paths);
		return defaultResourceLoader.getResource("classpath:"+path);
	}
	
	public Resource getResource(String fileName, String firstPath, String... paths) {
		Path path = Paths.get(firstPath, paths);
		path = path.resolve(fileName);
		return defaultResourceLoader.getResource("classpath:"+path);
	}
	
	public boolean getPathResource() {
		Path path = Paths.get("src/test/fixture", "sdkintegration/test.txt");
		File file = new File(path.toString());
		return file.exists();
	}

	public String createResourceFile(String fileName, String firstPath, String... paths) throws IOException {
		Path path = Paths.get(firstPath, paths);
		Resource resource = defaultResourceLoader.getResource("classpath:");
		File folderPath = new File(Paths.get(resource.getFile().getPath(), path.toString()).toString());
		if(!folderPath.exists())
			folderPath.mkdirs();
		
		Path filePath = Paths.get(folderPath.toString(), fileName);
		
		fileWriter(filePath.toString(), null);
		
		return filePath.toString();
	}
	
	private void fileWriter(String filePath, String fileContents) throws IOException {
		FileWriter fileWriter = new FileWriter(filePath, true);
		if(fileContents != null)
			fileWriter.write(fileContents);
		fileWriter.close();
	}
	
	public String getPath(String firstPath, String...paths) {
		return Paths.get(firstPath, paths).toString();
	}
}
