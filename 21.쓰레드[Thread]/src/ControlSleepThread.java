import java.util.Date;

public class ControlSleepThread extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("ControlSleepThread--> 1초마다1번");
				Date now=new Date();
				System.out.println(now.toLocaleString());
				/*
				 현재실행되고있는 쓰레드를 100ms동안 실행중지(sleep)
				 */
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
