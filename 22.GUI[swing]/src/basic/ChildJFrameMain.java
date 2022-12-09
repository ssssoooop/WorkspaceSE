package basic;

import javax.swing.JFrame;

public class ChildJFrameMain {

	public static void main(String[] args) {
		/*
		 * 1.JFrame객체생성
		 */
		ChildJFrame childJFrame=new ChildJFrame();
		/*
		 * 2.JFrame객체 화면에 보여주세요
		 */
		childJFrame.setSize(300,400);
		childJFrame.setVisible(true);
		
//		JFrame jFrame=new JFrame();
//		jFrame.setTitle("난 걍프레임");
//		jFrame.setSize(300,400);
//		jFrame.setVisible(true);
	}

}
