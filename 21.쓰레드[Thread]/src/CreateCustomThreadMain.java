public class CreateCustomThreadMain {

	public static void main(String[] args) {
		/*
		3. Thread 객체를 생성한다.
		4. Thread 객체를통해서 Thread를 시작시킨다.
		 */
		System.out.println("1.main thread start");
		CreateCustomThread cct=new CreateCustomThread();
		cct.setName("사용자정의쓰레드");
		System.out.println("2.main thread CreateCustomThread객체.start() 메쏘드호출전");
		
		cct.start();
		
		System.out.println("3.main thread CreateCustomThread객체.start() 메쏘드호출후");
		
		System.out.println("4.main thread return");
	}

}
