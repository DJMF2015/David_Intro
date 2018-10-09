package Arrays;
/*
 * Output:
 *  
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTakToe extends JFrame implements ActionListener {
	private JButton button;private int xpos; private int ypos;
	private JPanel panel;
	private Random randPosition;private int lucky;
	public static void main(String args[]) {
		TicTakToe tik = new TicTakToe();
		tik.setSize(400, 300);
		tik.paint();
		tik.setVisible(true);
		
		
	}

	public void paint() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 200));
		panel.setBackground(Color.white);
		window.add(panel);
		
		button = new JButton("Press");
		window.add(button);
		button.addActionListener(this);
		
	//	Random();
	}
	
	private int randomInRange(int min, int max) {
		System.out.println(lucky);
		return min+randPosition.nextInt(max-min+1);
		
	}
	private void Random() {
		randPosition = new Random();
		xpos = randPosition.nextInt(100);
		ypos = randPosition.nextInt(100);
		
		lucky = randomInRange(1,6);
	}
	
	public void actionPerformed(ActionEvent event) {
		
		Graphics g = panel.getGraphics();
	
	//	g.drawLine(0, 0, xpos, ypos);
		g.draw3DRect(xpos, ypos, 100, 150, false);
		Random();

	}
}
