import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Color;
//import java.awt.color.*;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GameBoard {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton c1 = new JButton("9");
	JButton c2 = new JButton("9");
	JButton c3 = new JButton("9");
	JButton c4 = new JButton("9");
	JButton c5 = new JButton("9");
	JButton c6 = new JButton("9");
	JButton c7 = new JButton("9");
	JButton c8 = new JButton("9");
	JButton c9 = new JButton("9");

	JButton p1 = new JButton("9");
	JButton p2 = new JButton("9");
	JButton p3 = new JButton("9");
	JButton p4 = new JButton("9");
	JButton p5 = new JButton("9");
	JButton p6 = new JButton("9");
	JButton p7 = new JButton("9");
	JButton p8 = new JButton("9");
	JButton p9 = new JButton("9");
	
	JButton handshake1 = new JButton("Hand shake");
	JButton handshake2 = new JButton("Hand shake");
	
	JButton ckazaan = new JButton("Score=0");
	JButton pkazaan = new JButton("Score=0");

	
	public GameBoard() {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(1, 1, 1, 1);

		gbc.ipady=100;
		gbc.ipadx=50;
		gbc.gridx = 0;
		gbc.gridy = 0;
		c1.setBackground(Color.GRAY);
		panel.add(c1, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		c2.setBackground(Color.GRAY);
		panel.add(c2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		c3.setBackground(Color.GRAY);
		panel.add(c3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 0;
		c4.setBackground(Color.GRAY);
		panel.add(c4, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 0;
		c5.setBackground(Color.GRAY);
		panel.add(c5, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 0;
		c6.setBackground(Color.GRAY);
		panel.add(c6, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 0;
		c7.setBackground(Color.GRAY);
		panel.add(c7, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 0;
		c8.setBackground(Color.GRAY);
		panel.add(c8, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 0;
		c9.setBackground(Color.GRAY);
		panel.add(c9, gbc);
		
		gbc.gridx = 9;
		gbc.gridy = 0;
		handshake1.setBackground(Color.GRAY);
		panel.add(handshake1, gbc);
		
		gbc.gridx = 9;
		gbc.gridy = 3;
		handshake2.setBackground(Color.GRAY);
		panel.add(handshake2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		p1.setBackground(Color.GRAY);
		panel.add(p1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		p2.setBackground(Color.GRAY);
		panel.add(p2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		p3.setBackground(Color.GRAY);
		panel.add(p3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		p4.setBackground(Color.GRAY);
		panel.add(p4, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 3;
		p5.setBackground(Color.GRAY);
		panel.add(p5, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 3;
		p6.setBackground(Color.GRAY);
		panel.add(p6, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 3;
		p7.setBackground(Color.GRAY);
		panel.add(p7, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 3;
		p8.setBackground(Color.GRAY);
		panel.add(p8, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 3;
		p9.setBackground(Color.GRAY);
		panel.add(p9, gbc);
		
		gbc.gridwidth = 9;
		gbc.gridx = 0;
		gbc.gridy = 1;
		ckazaan.setBackground(Color.PINK);
		panel.add(ckazaan, gbc);
		
		gbc.gridwidth = 9;
		gbc.gridx = 0;
		gbc.gridy = 2;
		pkazaan.setBackground(Color.PINK);
		panel.add(pkazaan, gbc);
		
		frame.add(panel);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

//    public JPanel createPane(Color color) {
//        JPanel pane = new JPanel(){ 
//
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(50, 50);
//            }
//
//        };
//        pane.setBackground(color);
//        return pane;
//    }
    
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GameBoard();
			}
		});
	}

}
