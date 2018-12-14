package src.main.java;


public class Hole
{
    private int numberOfKorgools;
    private String colour;
    private int index;

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
    
    public int getIndex()
    {
        return index;
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public void setColour(String col) {
        colour += col;
    }
    
    public void addKorgools()
    {
        numberOfKorgools++;
    }
    
    public void deleteKorgools(int number)
    {
        numberOfKorgools -= number;
    }
}
