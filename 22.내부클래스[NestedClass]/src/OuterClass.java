import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClass {
	/*
	 * 인스턴스 멈버필드
	 */
	public int outer_member_field=8888;
	/*
	 * 인스턴스 멤버메쏘드
	 */
	public void outer_member_method() {
		System.out.println("OrderClass.memter_method()");
	}
	/*************OuterClass에서 InnerClass객체생성사용**************/
	public void outer_inner_class_use() {
		//OuterClass.InnerClass ic=new OuterClass.InnerClass();
		InnerClass ic=new InnerClass();
		ic.inner_member_field=121212;
		ic.inner_member_method();
		System.out.println(ic);
		System.out.println();
	}
	
	
	
	
	/*
	 * 인스턴스 멤버클래스(Nested class,Inner class)
	 * 		- 작성이유 : 내부클래스에서 외부클래스의 멤버접근을 손쉬게하기위해서작성
	 */
	public class InnerClass{
		public int inner_member_field=3333;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/**************내부클래스에서 외부클래스의 멤버접근******************/
		
		public void innter_outer_member_access() {
			System.out.println(InnerClass.this);
			System.out.println(OuterClass.this);
			System.out.println(this);//InnerClass 객체참조
			outer_member_field = 9999;
			outer_member_method();
		}
		/******************Inner Class**********************/
		public class chatSendButtonActionEventHandler
		implements ActionListener{
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("send button click~~");
				/*
				 * frame의 TextField의 TextArea에 접근해야함
				 */

				
		
			}
		
			
		}
		
	}
	
}
