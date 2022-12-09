package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import basic.ChatSendActionEventHandler;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChattingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingJFrame frame = new ChattingJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChattingJFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				/*
				 Terminates the currently running Java Virtual Machine.
				 
				 */
				System.exit(0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("채팅방");
		lblNewLabel.setIcon(new ImageIcon(ChattingJFrame.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		lblNewLabel.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 102, 0));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		panel_1.add(chatTF);
		chatTF.setColumns(10);
		
		JButton sendBtn = new JButton("전송");
		panel_1.add(sendBtn);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("!");
		panel_2.add(lblNewLabel_1);
		/*
		 * 이벤트소스에 이벤트핸들러객체등록
		 */
		ChatSendActionEventHandler handler=
				new ChatSendActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}

}
