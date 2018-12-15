package src.main.java;

/**
 * Write a description of class Simulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simulator
{
    private static final String lightC = "white";
    private static final String darkC = "black";
    private Board board;
    private Player human;
    private Player computer;
    private GameBoard GUI;

    /**
     * Constructor for objects of class Simulator
     */
    public Simulator()
    {
        board = new Board(lightC, darkC);
        GUI = new GameBoard();
    }

    public void play()
    {
        boolean finished = false;
        while(!finished) {
            if(board.darkWin()){
                System.out.println("Dark side player win!");
                finished = true;
            }
            if(board.lightWin()){
                System.out.println("Light side player win!");
                finished = true;
            }
        }
        System.out.println("Thank you for playing!");
    }
}
