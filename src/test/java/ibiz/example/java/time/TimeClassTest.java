package ibiz.example.java.time;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TimeClassTest {
	private TimeClass timeClass;
	private long SLEEP_TIME = 2000L;
	
	@Before
	public void setUp() {
		this.timeClass = new TimeClass();
	}
	
	@Test
	public void runTimeCheckTest() throws InterruptedException {
		timeClass.startTime();
		Thread.sleep(SLEEP_TIME);
		long runTimeCheck = timeClass.runTimeCheck();
		assertThat(runTimeCheck).isEqualTo(SLEEP_TIME);
	}
}
