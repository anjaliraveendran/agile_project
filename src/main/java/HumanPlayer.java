package src.main.java;


public class HumanPlayer extends Player{

public HumanPlayer(String colour, Board board){
    super(colour, board);
}

public void move(int index)
{
    tuz = board.moveBalls(index);
}

}
