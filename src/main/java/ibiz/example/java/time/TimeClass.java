package ibiz.example.java.time;

import java.util.Date;

import org.junit.Test;

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
	
	@Test
	public void test() {
		String a = "\r\n" + 
				"{\"containerId\":\"e0b795157f1d\",\"cpuPerc\":\"1.16%\",\"memUsage\":\"16.79MiB / 3.852GiB\",\"memPerc\":\"0.43%\",\"netIO\":\"11.7MB / 11.7MB\",\"blockIO\":\"0B / 197kB\",\"pIDs\":\"11\"},\r\n" + 
				"{\"containerId\":\"383991a6c9ea\",\"cpuPerc\":\"1.01%\",\"memUsage\":\"49.24MiB / 3.852GiB\",\"memPerc\":\"1.25%\",\"netIO\":\"11.7MB / 11.7MB\",\"blockIO\":\"0B / 197kB\",\"pIDs\":\"12\"},\r\n" + 
				"{\"containerId\":\"ca1091b9b205\",\"cpuPerc\":\"1.11%\",\"memUsage\":\"48.56MiB / 3.852GiB\",\"memPerc\":\"1.23%\",\"netIO\":\"11.7MB / 11.7MB\",\"blockIO\":\"0B / 197kB\",\"pIDs\":\"12\"},\r\n" + 
				"{\"containerId\":\"16dadc7c68bc\",\"cpuPerc\":\"0.94%\",\"memUsage\":\"48.45MiB / 3.852GiB\",\"memPerc\":\"1.23%\",\"netIO\":\"11.7MB / 11.7MB\",\"blockIO\":\"197kB / 197kB\",\"pIDs\":\"11\"},\r\n" + 
				"{\"containerId\":\"989d7dceb527\",\"cpuPerc\":\"0.00%\",\"memUsage\":\"4.328MiB / 3.852GiB\",\"memPerc\":\"0.11%\",\"netIO\":\"2.04kB / 0B\",\"blockIO\":\"0B / 1.04MB\",\"pIDs\":\"8\"},\r\n" + 
				"{\"containerId\":\"23f597bf7ab6\",\"cpuPerc\":\"0.00%\",\"memUsage\":\"4.324MiB / 3.852GiB\",\"memPerc\":\"0.11%\",\"netIO\":\"1.86kB / 0B\",\"blockIO\":\"0B / 1.04MB\",\"pIDs\":\"9\"},\r\n" + 
				"{\"containerId\":\"402ba8d9bdfe\",\"cpuPerc\":\"0.02%\",\"memUsage\":\"9.43MiB / 3.852GiB\",\"memPerc\":\"0.24%\",\"netIO\":\"1.86kB / 0B\",\"blockIO\":\"0B / 98.3kB\",\"pIDs\":\"11\"},";
		
		String[] split = a.split("\r\n");
		for(String d : split)
		System.out.println(d);
	}
}


