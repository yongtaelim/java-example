package ibiz.example.java.logger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerCollectorTest {
	private LoggerCollector loggerRepository;
	private Logger logger = LoggerFactory.getLogger(LoggerCollectorTest.class);
	
	@Before
	public void setUp() throws FileNotFoundException, IOException {
		this.loggerRepository = new LoggerCollector(logger);
	}
	
	@Test
	public void printlnTest() {
		loggerRepository.println("testtesttest");
		loggerRepository.println("testtesttest");
		loggerRepository.println("testtesttest");
		loggerRepository.println("testtesttest");
	}
	
	@Test
	public void readLogTest() throws FileNotFoundException {
		String readLog = loggerRepository.readLog();
		System.out.println(readLog);
	}
}
