package src.main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameBoard {
    JLabel darkHole[] = new JLabel[9];
    JButton lightHole[] = new JButton[9];

    JLabel darkkorgool[] = new JLabel[9];
    JLabel lightkorgool[] = new JLabel[9];

    JPanel darkPanel[] = new JPanel[9];
    JPanel lightPanel[] = new JPanel[9];

    private JFrame f;
    private JPanel mainPanel;
    private JPanel dark_Panel, light_Panel;
    private JPanel kazan_Panel, dark_kz_panel, light_kz_panel;
    private JLabel dark_kazan_l, light_kazan_l;

    private static final String lightC = "white";
    private static final String darkC = "black";
    private Board board;
    private HumanPlayer player;
    private ComputerPlayer AI;

    public GameBoard() {
        board = new Board(lightC, darkC);
        player = new HumanPlayer(lightC, board);
        AI = new ComputerPlayer(darkC, board);
        
        gui();
        update();
    }

    private void update(){
        for(int i = 8; i >= 0; i--) {
            if(board.getSide(darkC).getTuz() != null ){
                if(board.getSide(darkC).getTuz() == board.getSide(lightC).getHole(i)){
                    lightkorgool[i].setText("TUZ");
                }else{
                    darkkorgool[i].setText("" + board.getSide(darkC).getNumberInHole(i));
                }
            }else{
                darkkorgool[i].setText("" + board.getSide(darkC).getNumberInHole(i));
            }
        }
        for(int i = 0; i < 9; i++) {
            if(board.getSide(lightC).getTuz() != null){
                if(board.getSide(lightC).getTuz() == board.getSide(darkC).getHole(i)){
                    darkkorgool[i].setText("TUZ");
                }else{
                    lightkorgool[i].setText("" + board.getSide(lightC).getNumberInHole(i));
                }
            }else{
                lightkorgool[i].setText("" + board.getSide(lightC).getNumberInHole(i));
            }
        }
        dark_kazan_l.setText("" + board.getSide(darkC).getNumberInKazan());
        light_kazan_l.setText("" + board.getSide(lightC).getNumberInKazan());
    }

    private void play(ActionEvent e) {
        int i = getSource(e);
        if(i == 10){
            JOptionPane.showMessageDialog(null, "Something wrong with the actionlistener.");
        }else{
            if(player.move(i)){
                update();
                if(player.win())
                {
                    stop();
                    JOptionPane.showMessageDialog(null, "You win!");
                }
                JOptionPane.showMessageDialog(null, "It is computer's route/");

                AI.move();
                update();
                if(AI.win())
                {
                    stop();
                    JOptionPane.showMessageDialog(null, "Oh! you lose.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "This hole is empty, please try another one!");
            }
        }
    }

    private void stop(){
        for(int i = 0; i < 9; i++){
            lightHole[i].setEnabled(false);
        }
    }

    private int getSource(ActionEvent e) {
        Object source = e.getSource();
        if(source == lightHole[0]){
            return 0;
        }else if(source == lightHole[1]){
            return 1;
        }else if(source == lightHole[2]){
            return 2;
        }else if(source == lightHole[3]){
            return 3;
        }else if(source == lightHole[4]){
            return 4;
        }else if(source == lightHole[5]){
            return 5;
        }else if(source == lightHole[6]){
            return 6;
        }else if(source == lightHole[7]){
            return 7;
        }else if(source == lightHole[8]){
            return 8;
        }
        return 10;
    }

    private void gui() {
        f = new JFrame("Togus Kurgool");
        f.setVisible(true);
        f.setSize(800, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 2, 1));

        dark_Panel = new JPanel();
        dark_Panel.setLayout(new GridLayout(1, 9, 2, 1));

        for (int i = 8; i >= 0; i--) {
            darkPanel[i] = new JPanel(new GridLayout(2, 1, 2, 1));
            darkPanel[i].setBackground(Color.GRAY);
            darkHole[i] = new JLabel(i + 1 + "");
            darkHole[i].setHorizontalAlignment(JLabel.CENTER);
            darkkorgool[i] = new JLabel();
            darkkorgool[i].setHorizontalAlignment(JLabel.CENTER);
            darkPanel[i].add(darkHole[i]);
            darkPanel[i].add(darkkorgool[i]);
            dark_Panel.add(darkPanel[i]);
        }
        mainPanel.add(dark_Panel);

        kazan_Panel = new JPanel();
        kazan_Panel.setLayout(new GridLayout(1, 3, 2, 1));

        dark_kz_panel = new JPanel();
        dark_kz_panel.setBackground(Color.GRAY);

        dark_kazan_l = new JLabel();
        dark_kazan_l.setHorizontalAlignment(JLabel.CENTER);
        dark_kazan_l.setVerticalAlignment(JLabel.CENTER);
        dark_kz_panel.add(dark_kazan_l);

        light_kz_panel = new JPanel();
        light_kz_panel.setBackground(Color.LIGHT_GRAY);
        light_kazan_l = new JLabel();
        light_kazan_l.setHorizontalAlignment(JLabel.CENTER);
        light_kazan_l.setVerticalAlignment(JLabel.CENTER);
        light_kz_panel.add(light_kazan_l);

        kazan_Panel.add(dark_kz_panel);
        kazan_Panel.add(light_kz_panel);
        mainPanel.add(kazan_Panel);

        light_Panel = new JPanel();
        light_Panel.setLayout(new GridLayout(1, 9, 2, 1));

        for (int i = 0; i < 9; i++) {
            lightPanel[i] = new JPanel(new GridLayout(2, 1, 2, 1));
            lightPanel[i].setBackground(Color.LIGHT_GRAY);
            lightHole[i] = new JButton(i + 1 + "");
            lightHole[i].setHorizontalAlignment(JLabel.CENTER);
            lightkorgool[i] = new JLabel();
            lightkorgool[i].setHorizontalAlignment(JLabel.CENTER);
            lightPanel[i].add(lightHole[i]);
            lightPanel[i].add(lightkorgool[i]);
            light_Panel.add(lightPanel[i]);

            lightHole[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        play(e);
                    }
                });
            mainPanel.add(light_Panel);

            f.setLocationRelativeTo(null);
            f.add(mainPanel);
        }
    }

}