package src.main.java;


public abstract class Player {
protected String colour;
protected Board board;
protected int score;

//initilises player side via the colour and sets their score to 0
public Player(String colour, Board board){
    this.colour = colour;
    this.board = board;
    score = 0;
}

public String getColour()
{
    return colour;
}
//returns if the player wins
public boolean win(){
    if(score >= 82) {
        return true;
    }
    return false;
}
}
