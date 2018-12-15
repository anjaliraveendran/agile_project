package src.main.java;

public class HumanPlayer extends Player{
    public HumanPlayer(String colour, Board board){
        super(colour, board);
    }

    public boolean move(int index)
    {
        boolean go = board.moveBalls(index,colour);
        score = board.getSide(colour).getNumberInKazan();
        return go;
    }

}
