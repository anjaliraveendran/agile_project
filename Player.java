
public abstract class Player {
protected Hole tuz;
protected String colour;
protected Board board;
public Player(String colour, Board board){
    tuz = null;
    this.colour = colour;
    this.board = board;
}

public Hole getTuz()
{
    return tuz;
}

public String getColour()
{
    return colour;
}

public void setTuz(Hole hole)
{
    tuz = hole;
}
}
