package src.main.java;


public abstract class Player {
protected String colour;
protected Board board;

public Player(String colour, Board board){
    this.colour = colour;
    this.board = board;
}

public String getColour()
{
    return colour;
}
}
