package src.main.java;


public abstract class Player {
protected String colour;
protected Board board;
protected int score;

public Player(String colour, Board board){
    this.colour = colour;
    this.board = board;
    score = 0;
}

public String getColour()
{
    return colour;
}

public boolean win(){
    if(score >= 82) {
        return true;
    }
    return false;
}
}
