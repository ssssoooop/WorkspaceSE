package president.korea;

import president.korea.YS;

public class YSChild extends YS {
	/*
	public int number1;
	protected int member2;
	int member3;
	private int member4;
	public void method1(){
		System.out.println("YS.method1()");
	}
	public void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	public void method4() {
		System.out.println("YS.method4()");
	}
	 */
	public void access2() {
		this.member1=1;
		this.member2=1;
		/*this.member3=1;
		this.member4=1;
		*/
		this.method1();
		this.method2();
		/*
		this.method3();
		this.method4();
		 */
	}
}
