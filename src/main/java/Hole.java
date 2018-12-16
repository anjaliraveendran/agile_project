package src.main.java;


public class Hole
{
    private int numberOfKorgools;
    private String colour;
    private int index;

    //Creates a hole with 9 korgools
    public Hole(int index)
    {
        numberOfKorgools = 9;
        colour = "";
        this.index = index;
    }

    public int getNumberOfKorgools()
    {
        return numberOfKorgools;
    }
    //returns the index of the hole 
    public int getIndex()
    {
        return index;
    }
    //returns the hole side via the colour
    public String getColour()
    {
        return colour;
    }
    //sets the side of the hole via the colour
    public void setColour(String col) {
        colour += col;
    }
    //adds korgools to the hole
    public void addKorgools()
    {
        numberOfKorgools++;
    }
    //deletes kkorgools from the hole
    public void deleteKorgools(int number)
    {
        numberOfKorgools -= number;
    }
}
