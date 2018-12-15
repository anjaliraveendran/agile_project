package src.main.java;

import java.util.Random;
public class ComputerPlayer extends Player{

    private static Random rand;
    public ComputerPlayer(String colour, Board board){
        super(colour,board);
        rand = new Random();
    }

    protected boolean move()
    {
        int n = rand.nextInt(9);
        boolean go = board.moveBalls(n,colour);
        score = board.getSide(colour).getNumberInKazan();
        return go;
    } 
}
