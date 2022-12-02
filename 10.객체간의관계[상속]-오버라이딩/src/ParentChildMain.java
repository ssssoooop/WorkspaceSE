/*
 * 상속(클래스의 관계):
 * 	부모클래스(객체)의 멤버들을 자식클래스(객체)가 물려받는것
 * 
 *  1. 상속을 사용하는이유--> 기존에 만들어놓은 클래스의 재사용,
 * 						 확장을위해사용한다.
 *  2. 자바에서는 단일상속만이 가능하다(부모클래스가 한개만가능) 
 *  3. 부모클래스(super)와 자식클래스(sub)가존재한다.
 *  4. 자바에서 제공되어지는 모든 클래스들은 Object 라고하는
 *     최상위 클래스로부터 상속되어진다.
 *  5. 사용자정의 클래스들도 Object 클래스라는 최상위클래스를
 *     상속  받아야한다. 
 * 
 */

class Parent extends Object{
	public int member1;
	public int member2;
	public Parent() {
		System.out.println("1.Object()기본생성자");
		System.out.println("2.Parent()기본생성자");
	}
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}
	public void mentod1() {
		System.out.println("Parent.method1()");
	}
	public void mehtod2() {
		System.out.println("Parent.method2()");
	}
	public void print() {
		System.out.println(this.member1+"\t"+this.member2);
	}
	public int getMember1() {
		return member1;
	}
	public void setMember1(int member1) {
		this.member1 = member1;
	}
	public int getMember2() {
		return member2;
	}
	public void setMember2(int member2) {
		this.member2 = member2;
	}
}

class Child extends Parent{
	public int member3;
	public Child() {
		/*
		 * - 클래스 생성자 첫번째라인에서는 부모클래스의 생성자가 반드시 호출되어야합니다.
		 * - 부모클래스 생성자호출을 생략할겨우에는 부모클래스의 기본생성자가 자동으로 호출된다.
		 * - 매개변수를 가진부모의 생성자를 호출할수있다.(명시적으로 호출코드를 기술하여야한다.)
		 */
		
		super();
		System.out.println("3.Child()기본생성자");
	}
	public Child(int member1,int member2,int member3) {
		this.member1=member1;
		this.member2=member2;
		this.member3=member3;
	}
	public void method3() {
		System.out.println("Child.method3()");
	}
	public int getMember3() {
		return member3;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(this.member3);
	}
	
	
}

public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("-------------Child()-------------");
		Child c1=new Child();
		c1.print();
	}

}
