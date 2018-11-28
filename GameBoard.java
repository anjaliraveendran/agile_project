import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GameBoard {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton c1 = new JButton("Computer1");
	JButton c2 = new JButton("Computer2");
	JButton c3 = new JButton("Computer3");
	JButton c4 = new JButton("Computer4");
	JButton c5 = new JButton("Computer5");
	JButton c6 = new JButton("Computer6");
	JButton c7 = new JButton("Computer7");
	JButton c8 = new JButton("Computer8");
	JButton c9 = new JButton("Computer9");

	JButton p1 = new JButton("Player1");
	JButton p2 = new JButton("Player2");
	JButton p3 = new JButton("Player3");
	JButton p4 = new JButton("Player4");
	JButton p5 = new JButton("Player5");
	JButton p6 = new JButton("Player6");
	JButton p7 = new JButton("Player7");
	JButton p8 = new JButton("Player8");
	JButton p9 = new JButton("Player9");
	
	JButton ckazaan = new JButton("ComputerKazaan");
	JButton pkazaan = new JButton("PlayersKazaan");

	
	public GameBoard() {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5);

		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(c1, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(c2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		panel.add(c3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 0;
		panel.add(c4, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 0;
		panel.add(c5, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 0;
		panel.add(c6, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 0;
		panel.add(c7, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 0;
		panel.add(c8, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 0;
		panel.add(c9, gbc);
		
	// jgjhgjhg
		
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(ckazaan, gbc);
		
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(pkazaan, gbc);
		
		// jgjhgjhg	
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GameBoard();
			}
		});
	}

}
