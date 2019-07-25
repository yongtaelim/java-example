package ibiz.example.java.file;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class FileClass {
	public void unzip(String filePath, String destDir) throws ZipException {
		ZipFile zipFile = new ZipFile(filePath);
		zipFile.extractAll(destDir);
	}
}
