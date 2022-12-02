
public class Whale implements Marmmalia{
	public void operation2() {
		
	}
	
	public void operation3() {
		
	}
	public static void main(String[] args) {
		Whale whale=new Whale();
		whale.operation1();
		whale.operation2();
		whale.operation3();
		Marmmalia mermmalia=whale;
		mermmalia.operation1();
		mermmalia.operation2();
		mermmalia.operation3();
	}

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		
	}
}
