package ibiz.example.java.count;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchClass implements Runnable {

	private CountDownLatch count;
	
	public CountDownLatchClass(CountDownLatch count)  {
		this.count = count;
	}
	
	@Override
	public void run() {
		System.out.println(count.getCount());
		while(true) {
			try {
				Thread.sleep(2000L);
				count.countDown();
				System.out.println(count.getCount());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
