
public class GajunTV implements GajunOnOff, GajunVolume{
	public void operation1() {
		System.out.println("TV.operation1()");
	}
	public void operation2() {
		System.out.println("TV.operation2()");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("TV.volumeUp()");
		
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("TV.volumeDown()");
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV.on()");
	}
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV.off()");
	}
}
