
public class Hole
{
    private int numberOfKorgools;
    private String colour;

    public Hole()
    {
        numberOfKorgools = 9;
        colour = "";
    }

    public int getNumberOfKorgools()
    {
        return numberOfKorgools;
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
