
public class GajunAudio implements GajunOnOff, GajunVolume{
	public void operation1() {
		System.out.println("GajunAudio.operation1()");
	}
	public void operation2() {
		System.out.println("GajunAudio.operation2()");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("GajunAudio.volumeUp()");
		
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("GajunAudio.volumeDown()");
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("GajunAudio.on()");
	}
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("GajunAudio.off()");
	}
}
