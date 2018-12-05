package main.java;
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
	
	//blue balls
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
	
	
	//red balls
	JButton r1 = new JButton("0");
	JButton r2 = new JButton("0");
	JButton r3 = new JButton("0");
	JButton r4 = new JButton("0");
	JButton r5 = new JButton("0");
	JButton r6 = new JButton("0");
	JButton r7 = new JButton("0");
	JButton r8 = new JButton("0");
	JButton r9 = new JButton("0");

	JButton r10 = new JButton("0");
	JButton r11 = new JButton("0");
	JButton r12 = new JButton("0");
	JButton r13 = new JButton("0");
	JButton r14 = new JButton("0");
	JButton r15 = new JButton("0");
	JButton r16 = new JButton("0");
	JButton r17 = new JButton("0");
	JButton r18 = new JButton("0");
	
    JButton handShake1 = new JButton("Hand Shake");
    JButton handShake2 = new JButton("Hand Shake");
	
	JButton ckazaan = new JButton("Score=0");
	JButton pkazaan = new JButton("Score=0");
	
	JButton red1 = new JButton("1");
	JButton red2 = new JButton("1");
	
	
	//players buttons
	JButton player1 = new JButton("Player 1");
	JButton player2 = new JButton("Player 2");

	
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
		

		gbc.gridx = 0;
		gbc.gridy = 1;
		r1.setBackground(Color.RED);
		panel.add(r1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		r2.setBackground(Color.RED);
		panel.add(r2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		r3.setBackground(Color.RED);
		panel.add(r3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		r4.setBackground(Color.RED);
		panel.add(r4, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 1;
		r5.setBackground(Color.RED);
		panel.add(r5, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 1;
		r6.setBackground(Color.RED);
		panel.add(r6, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 1;
		r7.setBackground(Color.RED);
		panel.add(r7, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 1;
		r8.setBackground(Color.RED);
		panel.add(r8, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 1;
		r9.setBackground(Color.RED);
		panel.add(r9, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		r10.setBackground(Color.RED);
		panel.add(r10, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		r11.setBackground(Color.RED);
		panel.add(r11, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		r12.setBackground(Color.RED);
		panel.add(r12, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 4;
		r13.setBackground(Color.RED);
		panel.add(r13, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 4;
		r14.setBackground(Color.RED);
		panel.add(r14, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 4;
		r15.setBackground(Color.RED);
		panel.add(r15, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 4;
		r16.setBackground(Color.RED);
		panel.add(r16, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 4;
		r17.setBackground(Color.RED);
		panel.add(r17, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 4;
		r18.setBackground(Color.RED);
		panel.add(r18, gbc);
		
        gbc.gridx = 9;
        gbc.gridy = 0;
        handShake1.setBackground(Color.GRAY);
        panel.add(handShake1, gbc);
        
        gbc.gridx = 9;
        gbc.gridy = 5;
        handShake2.setBackground(Color.GRAY);
        panel.add(handShake2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		p1.setBackground(Color.GRAY);
		panel.add(p1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		p2.setBackground(Color.GRAY);
		panel.add(p2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 5;
		p3.setBackground(Color.GRAY);
		panel.add(p3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 5;
		p4.setBackground(Color.GRAY);
		panel.add(p4, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 5;
		p5.setBackground(Color.GRAY);
		panel.add(p5, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 5;
		p6.setBackground(Color.GRAY);
		panel.add(p6, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 5;
		p7.setBackground(Color.GRAY);
		panel.add(p7, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 5;
		p8.setBackground(Color.GRAY);
		panel.add(p8, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 5;
		p9.setBackground(Color.GRAY);
		panel.add(p9, gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		red1.setBackground(Color.RED);
		panel.add(red1, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 3;
		red2.setBackground(Color.RED);
		panel.add(red2, gbc);
		
		
		//players buttons
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		player1.setBackground(Color.white);
		panel.add(player1, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 2;
		player2.setBackground(Color.white);
		panel.add(player2, gbc);
		
		gbc.gridwidth = 7;
		gbc.gridx = 1;
		gbc.gridy = 2;
		ckazaan.setBackground(Color.PINK);
		panel.add(ckazaan, gbc);
		
		gbc.gridwidth = 7;
		gbc.gridx = 1;
		gbc.gridy = 3;
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
    
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			@Override
//			public void run() {
//				new GameBoard();
//			}
//		});
//	}

}
