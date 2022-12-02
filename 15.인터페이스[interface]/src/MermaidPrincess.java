
public class MermaidPrincess implements Mermaid, Princess{

	@Override
	public void speak() {
		System.out.println("Princess.speak()의구현[재정의]");
	}

	@Override
	public void think() {
		System.out.println("Princess.think()의구현[재정의]");
	}

	@Override
	public void fastSwim() {
		System.out.println("Princess.FastSain()의구현[재정의]");
	}

	@Override
	public void liveSea() {
		System.out.println("Princess.LiveSea()의구현[재정의]");
	}
	
}
