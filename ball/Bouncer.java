import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bouncer extends JFrame implements ActionListener {

    private JButton goButton, fasterButton, slowerButton;
    private JPanel panel;
    private Ball ball = null;

    public static void main(String[] args) {
        Bouncer frame = new Bouncer();
        frame.setSize(400,350);
        frame.createGUI();
        frame.show();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        goButton = new JButton("go");
        window.add(goButton);
        goButton.addActionListener(this);

        fasterButton = new JButton("faster");
        window.add(fasterButton);
        fasterButton.addActionListener(this);

        slowerButton = new JButton("slower");
        window.add(slowerButton);
        slowerButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == goButton) {
            Graphics paper = panel.getGraphics();
            ball = new Ball(paper);
            ball.start();
        }
        if (event.getSource() == fasterButton) {
            ball.faster();
        }
        if (event.getSource() == slowerButton) {
            ball.slower();
        }
    }
}

