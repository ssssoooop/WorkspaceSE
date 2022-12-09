import java.awt.Toolkit;

public class ConCurrentBeepThread {
	public void run() {
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolKit.beep();
			System.out.println("beep");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}

	public String getPriority() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub
		
	}

}
