package ibiz.example.java.time;

import java.util.Date;

public class TimeClass {
	private Date startTime;
	private Date endTime;
	
	public void startTime() {
		startTime = new Date();
	}
	
	public long runTimeCheck() {
		endTime = new Date();
		 
		// Time Check
		return endTime.getTime() - startTime.getTime();
	}
	
}


