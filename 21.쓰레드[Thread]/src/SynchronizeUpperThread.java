
public class SynchronizeUpperThread extends Thread{
	private SynchronizeUpperLowerPrintSharedObject sharedObject;
	public SynchronizeUpperThread(SynchronizeUpperLowerPrintSharedObject sharedObject) {
		this.sharedObject=sharedObject;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("☆");
			sharedObject.printUpper();
		}
	}
}
