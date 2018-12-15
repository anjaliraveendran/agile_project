package src.main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Write a description of class Simulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    private static final String lightC = "white";
    private static final String darkC = "black";
    private static Board board;
    private Player hunman;
    private Player computer;
    
    /**
     * Constructor for objects of class Simulator
     */
    public static void main(String[] args) throws IOException
    {
        //Board board = new Board(lightC, darkC);
        System.out.print(" hello ");
        Water water = new Water();
        GameBoard gameBoard = new GameBoard();
        
        //System.out.print(" fin gameboard ");

    }

    protected void turnRed(JLabel myLabel){
        System.out.println("iNS+I+++++++++++++++");
        myLabel.setBackground(Color.RED);
    }
    
    
    private void gui() {
        f = new JFrame("Togus Kurgool");
        f.setVisible(true);
        f.setSize(800, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 2, 1));

        player1_Panel = new JPanel();
        player1_Panel.setLayout(new GridLayout(1, 9, 2, 1));

        int j = 9;
        for (int i = 8; i >= 0; i--) {
            player1Panel[i] = new JPanel(new GridLayout(2, 1, 2, 1));
            player1Panel[i].setBackground(Color.GRAY);
            player1Point[i] = new JLabel("9");
            player1Point[i].setHorizontalAlignment(JLabel.CENTER);
            player1korgool[i] = new JLabel(i + 1 + "");
            player1korgool[i].setHorizontalAlignment(JLabel.CENTER);
            player1Panel[i].add(player1Point[i]);
            player1Panel[i].add(player1korgool[i]);
            player1_Panel.add(player1Panel[i]);
        }
        mainPanel.add(player1_Panel);

        kazan_Panel = new JPanel();
        kazan_Panel.setLayout(new GridLayout(1, 3, 2, 1));

        py1_kz_panel = new JPanel();
        py1_kz_panel.setBackground(Color.GRAY);

        p1_kazan_l = new JLabel("0");
        p1_kazan_l.setHorizontalAlignment(JLabel.CENTER);
        p1_kazan_l.setVerticalAlignment(JLabel.CENTER);
        py1_kz_panel.add(p1_kazan_l);

        py2_kz_panel = new JPanel();
        py2_kz_panel.setBackground(Color.LIGHT_GRAY);
        p2_kazan_l = new JLabel("0");
        p2_kazan_l.setHorizontalAlignment(JLabel.CENTER);
        p2_kazan_l.setVerticalAlignment(JLabel.CENTER);
        py2_kz_panel.add(p2_kazan_l);

        btn_Panel = new JPanel();
        btn_Panel.setLayout(new GridLayout(2, 1, 2, 1));
        player1_btn = new JButton("Player 1 MOVE");
        player2_btn = new JButton("Player 2 MOVE");
        player1_btn.setBackground(Color.GRAY);
        player2_btn.setBackground(Color.LIGHT_GRAY);
        
        

        player1_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1) {
                    int stoneCount = 0;
                    player1 = false;
                    player2 = true;
                    String s1 = JOptionPane.showInputDialog("Light Player select your korgool: ");
                    if (!"".equals(s1) && ("1".equals(s1) || "2".equals(s1) || "3".equals(s1) || "4".equals(s1) || "5".equals(s1) || "6".equals(s1) || "7".equals(s1) || "8".equals(s1) || "9".equals(s1))) {
                        int input = Integer.parseInt(s1);
                        player1Redistribution(input);
                        int totalScore = Integer.parseInt(p1_kazan_l.getText());
                        if (totalScore >= 82) {
                            JOptionPane.showMessageDialog(null, "Player 1 has won the game. The End");
                            score = totalScore;
                            player2 = false;
                            player1 = false;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                        player1 = true;
                        player2 = false;
                    }
                } else {
                    if (score > 0) {
                        JOptionPane.showMessageDialog(null, "Game Ended Succesfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dark player has already played");
                    }
                }
            }
        });

        player2_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player2) {
                    int stoneCount = 0;
                    player2 = false;
                    player1 = true;
                    String s2 = JOptionPane.showInputDialog("Light Player select your korgool: ");
                    if (!"".equals(s2) && ("1".equals(s2) || "2".equals(s2) || "3".equals(s2) || "4".equals(s2) || "5".equals(s2) || "6".equals(s2) || "7".equals(s2) || "8".equals(s2) || "9".equals(s2))) {
                        int input = Integer.parseInt(s2);
                        player2Redistribution(input);
                        int totalScore = Integer.parseInt(p2_kazan_l.getText());
                        if (totalScore >= 82) {
                            JOptionPane.showMessageDialog(null, "Player 2 has won the game. The End");
                            score = totalScore;
                            player2 = false;
                            player1 = false;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                        player2 = true;
                        player1 = false;
                    }
                } else {
                    if (score > 0) {
                        JOptionPane.showMessageDialog(null, "Game Ended Succesfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dark player has already played");
                    }
                }
            }
        });

        btn_Panel.add(player1_btn);
        btn_Panel.add(player2_btn);

        kazan_Panel.add(py1_kz_panel);
        kazan_Panel.add(btn_Panel);
        kazan_Panel.add(py2_kz_panel);
        mainPanel.add(kazan_Panel);

        player2_Panel = new JPanel();
        player2_Panel.setLayout(new GridLayout(1, 9, 2, 1));

        for (int i = 0; i < 9; i++) {
            player2Panel[i] = new JPanel(new GridLayout(2, 1, 2, 1));
            player2Panel[i].setBackground(Color.LIGHT_GRAY);
            player2Point[i] = new JLabel("9");
            player2Point[i].setHorizontalAlignment(JLabel.CENTER);
            player2korgool[i] = new JLabel(i + 1 + "");
            player2korgool[i].setHorizontalAlignment(JLabel.CENTER);
            player2Panel[i].add(player2Point[i]);
            player2Panel[i].add(player2korgool[i]);
            player2_Panel.add(player2Panel[i]);
        }
        mainPanel.add(player2_Panel);

        f.setLocationRelativeTo(null);
        f.add(mainPanel);
    }

    void player2Redistribution(int index) {
        int moveEnd = -1;
        int start = index;
        int end = 0;
        if (!"TUZZ".equals(player2Point[start - 1].getText())) {
            String p = player2Point[start - 1].getText();
            int points = Integer.parseInt(p);
            if (points > 0) {
                if (points == 1)
                {
                    if(start!=9)
                    {
                        player2Point[start - 1].setText("0");
                        if (!"TUZZ".equals(player2Point[start].getText()))
                        {
                            int c = Integer.parseInt(player2Point[start].getText());
                            player2Point[start].setText(c + 1 + "");
                        } else
                        {
                            int c3 = Integer.parseInt(player2Point[start + 1].getText());
                            player2Point[start].setText(c3 + 1 + "");
                        }
                    }
                    else
                    {
                        player2Point[start - 1].setText("0");
                        if (!"TUZZ".equals(player1Point[0].getText()))
                        {
                            int c = Integer.parseInt(player1Point[0].getText());
                            player1Point[0].setText(c + 1 + "");
                        } else
                        {
                            int c3 = Integer.parseInt(player1Point[1].getText());
                            player1Point[1].setText(c3 + 1 + "");
                        }
                    }
                }
                else
                {
                    player2Point[start - 1].setText("1");
                    points--;
                    while (points > 0) {
                        int N = 9 - start + 1;
                        if (points > N) {
                            end = 9;
                        } else {
                            end = start + points;
                        }
                        for (int i = start; i < end; i++) {
                            if (!"TUZZ".equals(player2Point[i].getText())) {
                                int a = Integer.parseInt(player2Point[i].getText());
                                player2Point[i].setText(a + 1 + "");
                                points--;
                            }
                        }
                        N = 9;
                        if (points > N) {
                            end = 9;
                        } else {
                            end = 1 + points - 1;
                        }
                        for (int i = 0; i < end; i++) {
                            if (!"TUZZ".equals(player1Point[i].getText())) {
                                int b = Integer.parseInt(player1Point[i].getText());
                                player1Point[i].setText(b + 1 + "");
                                points--;
                                moveEnd = i;
                            }
                        }
                        if (moveEnd >= 0) {
                            int b1 = Integer.parseInt(player1Point[moveEnd].getText());
                            if (b1 % 2 == 0) {
                                int d = Integer.parseInt(p2_kazan_l.getText());
                                p2_kazan_l.setText(d + b1 + "");
                                player1Point[moveEnd].setText("0");
                            }
                            if (b1 == 3 && moveEnd != 8 && p2Tuzz == false && moveEnd != p2DeniedIndex) {
                                p1DeniedIndex = moveEnd;
                                int b11 = Integer.parseInt(player1Point[moveEnd].getText());
                                int d1 = Integer.parseInt(p2_kazan_l.getText());
                                p2_kazan_l.setText(d1 + b11 + "");
                                player1Point[moveEnd].setText("TUZZ");
                                turnRed(p2_kazan_l);
                                p2Tuzz = true;
                            }
                        }
                        start = 0;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Is already 0 choose another one");
                player2 = true;
                player1 = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "It is tuzzed choose another one");
            player2 = true;
            player1 = false;
        }
    }//end player2Redistribution

    void player1Redistribution(int index) {

        int moveEnd = -1;
        int start = index;
        int end = 0;
        if (!"TUZZ".equals(player1Point[start - 1].getText())) {
            String p = player1Point[start - 1].getText();
            int points = Integer.parseInt(p);
            if (points > 0) {
                if (points == 1)
                {
                    if(start!=9)
                    {
                        player1Point[start - 1].setText("0");
                        if (!"TUZZ".equals(player1Point[start].getText()))
                        {
                            int c = Integer.parseInt(player1Point[start].getText());
                            player1Point[start].setText(c + 1 + "");
                        }
                        else
                        {
                            int c4 = Integer.parseInt(player1Point[start + 1].getText());
                            player1Point[start].setText(c4 + 1 + "");
                        }
                    }
                    else
                    {
                        player1Point[start - 1].setText("0");
                        if (!"TUZZ".equals(player2Point[0].getText()))
                        {
                            int c = Integer.parseInt(player2Point[0].getText());
                            player2Point[0].setText(c + 1 + "");
                        } else
                        {
                            int c3 = Integer.parseInt(player2Point[1].getText());
                            player2Point[1].setText(c3 + 1 + "");
                        }
                    }
                }
                else
                {
                    player1Point[start - 1].setText("1");
                    points--;
                    while (points > 0) {
                        int N = 9 - start + 1;
                        if (points > N) {
                            end = 9;
                        } else {
                            end = start + points;
                        }
                        for (int i = start; i < end; i++) {
                            if (!"TUZZ".equals(player1Point[i].getText())) {
                                int a = Integer.parseInt(player1Point[i].getText());
                                player1Point[i].setText(a + 1 + "");
                                points--;
                            }
                        }
                        N = 9 - 1 + 1;
                        if (points > N) {
                            end = 9;
                        } else {
                            end = 1 + points - 1;
                        }
                        for (int i = 0; i < end; i++) {
                            if (!"TUZZ".equals(player2Point[i].getText())) {
                                int b = Integer.parseInt(player2Point[i].getText());
                                player2Point[i].setText(b + 1 + "");
                                points--;
                                moveEnd = i;
                            }
                        }
                        if (moveEnd >= 0) {
                            int b1 = Integer.parseInt(player2Point[moveEnd].getText());
                            if (b1 % 2 == 0) {
                                int d = Integer.parseInt(p1_kazan_l.getText());
                                p1_kazan_l.setText(d + b1 + "");
                                player2Point[moveEnd].setText("0");
                            }
                            if (b1 == 3 && moveEnd != 8 && p1Tuzz == false && moveEnd != p1DeniedIndex) {
                                p2DeniedIndex = moveEnd;
                                int b11 = Integer.parseInt(player2Point[moveEnd].getText());
                                int d1 = Integer.parseInt(p1_kazan_l.getText());
                                p1_kazan_l.setText(d1 + b11 + "");
                                player2Point[moveEnd].setText("TUZZ");
                                p1Tuzz = true;
                            }
                        }
                        start = 0;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Is already 0 choose another one");
                player1 = true;
                player2 = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "It is tuzzed choose another one");
            player1 = true;
            player2 = false;
        }
    }//end player2Redistribution

    public static void main(String[] args) {
        Main main = new Main();
    }
}