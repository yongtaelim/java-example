package ibiz.example.java.logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.Scanner;

import org.slf4j.Logger;
import org.springframework.core.io.Resource;

import ibiz.example.java.path.PathSetting;

public class LoggerCollector {
	private Logger logger;
	private PrintStream printStream;
	private File logFile;
	private final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	public LoggerCollector(Logger logger) throws FileNotFoundException, IOException {
		this.logger = logger;
		setUp();
	}
	
	public void println(String s) {
		logger.info(s);
		printStream.println(s);
	}
	
	public String readLog() throws FileNotFoundException {
		Scanner inputScanner = new Scanner(logFile);
		StringBuffer buffer = new StringBuffer();
		while(inputScanner.hasNextLine()) {
			buffer.append(inputScanner.nextLine());
			buffer.append(LINE_SEPARATOR);
		}
		return buffer.toString();
	}
	
	private void setUp() throws FileNotFoundException, IOException {
		PathSetting pathSetting = new PathSetting();
		String fileName = "Test.log";
		String firstPath = "test";
		String[] paths = {"1", "2"};
		
		Resource resource = pathSetting.getResource(firstPath, paths);
		File filePath = new File(resource.getFile().getPath());
		if(!filePath.exists())
			filePath.mkdirs();
		this.logFile = new File(Paths.get(resource.getFile().getPath(), fileName).toString());
		this.printStream = new PrintStream(new FileOutputStream(logFile, true));
	}
}
