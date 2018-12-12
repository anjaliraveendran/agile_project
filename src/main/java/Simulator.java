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
    private Player hunman;
    private Player computer;
    
    /**
     * Constructor for objects of class Simulator
     */
    public Simulator()
    {
        board = new Board(lightC, darkC);
    }

    
}
