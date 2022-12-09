package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridLayoutJFrame extends JFrame {
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	private JButton bplus;
	private JButton bminus;
	private JButton bmultiple;
	private JButton bdivide;
	private JButton bresult;
	private JButton bclear;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 30, 116));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 3, 3));
		
		b1 = new JButton("1");
		contentPane.add(b1);
		
		b2 = new JButton("2");
		contentPane.add(b2);
		
		b3 = new JButton("3");
		contentPane.add(b3);
		
		bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("+");
			}
		});
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(b4);
		
		b5 = new JButton("5");
		contentPane.add(b5);
		
		b6 = new JButton("6");
		contentPane.add(b6);
		
		bminus = new JButton("-");
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("-");
			}
		});
		
		b7 = new JButton("7");
		contentPane.add(b7);
		
		b8 = new JButton("8");
		contentPane.add(b8);
		
		b9 = new JButton("9");
		contentPane.add(b9);
		
		bmultiple = new JButton("x");
		bmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("x");
			}
		});
		b0 = new JButton("0");
		contentPane.add(b0);
		
		bresult = new JButton("=");
		bresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("=");
			}
		});
		contentPane.add(bresult);
		
		bclear = new JButton("c");
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("c");
			}
		});
		
		bdivide = new JButton("/");
		bdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("/");
			}
		});
	}

}
