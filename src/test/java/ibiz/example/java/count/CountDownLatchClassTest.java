package ibiz.example.java.count;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

public class CountDownLatchClassTest {

	@Test
	public void countDownLatchClassTest() throws InterruptedException {
		CountDownLatch count = new CountDownLatch(5); 
		Thread thread = new Thread(new CountDownLatchClass(count));
		
		thread.start();
		
		boolean await = count.await(30L, TimeUnit.SECONDS);
		System.out.println(await);
		if(count.await(3L, TimeUnit.SECONDS)) {
			System.out.println("success!!");
		}
	}
}
