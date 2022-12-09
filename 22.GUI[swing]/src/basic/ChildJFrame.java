package basic;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ChildJFrame extends JFrame{
	/*
	 * 컴포넌트를 멤버필드로선언
	 */
	private JButton okBtn;
	private JButton cancleBtn;
	private JPanel contentPane;
	
	public ChildJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("나의첫번째프레임");
		this.contentPane=new JPanel();
		this.setBackground(Color.GREEN);
		this.setContentPane(contentPane);
		
		okBtn=new JButton("확인");
		cancleBtn=new JButton("취소");
		
		/*
		 * 컨테이너에 컴포넌트를 붙인다.
		 */
		contentPane.setLayout(null);
		okBtn.setBounds(40,40,80,80);
		cancleBtn.setBounds(130,40,80,40);
		
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		
		
		this.setSize(300,400);
		/*
		 * 1.JFrame객체 화면에 보여주세요
		 */
		this.setVisible(true);
		/*
		 * Container[JFrame].setVisible(true);
		 * 		- 메인쓰레드가 호출하면 JVM GUI쓰레드를 생성
		 * 		- GUI쓰레드는 무한대기하면서 이벤트와 그래픽처리를 담당
		 * 		- Container[JFrame]는 계속떠있다.
		 * 		  (JVM이 종료되지않는다)
		 */

	}
}
