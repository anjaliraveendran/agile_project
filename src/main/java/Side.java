package src.main.java;

import java.util.Arrays;


public class Side
{
    private Hole[] holes;
    private Kazan kazan;
    private String colour;

    public Side(String colour)
    {
        holes = new Hole[9];
        kazan = new Kazan();
        this.colour = colour;
    }

    public int getNumberInKazan()
    {
        return kazan.getNumberOfKorgools();
    }
    
    public Hole getHole(int index)
    {
        return holes[index-1];
    }
    
    public void insertKorgoolsToKazan(int number)
    {
        kazan.addKorgools(number);
    }
    
    public int getNumberInHole(int index)
    {
        return holes[index].getNumberOfKorgools();
    }
    
    public String getColour() {
        return colour;
    }
    
    public void addKorgoolsToHole(int index)
    {
        holes[index].addKorgools();
    }
    
    public void deleteKorgoolsAtHole(int index, int number)
    {
        holes[index].deleteKorgools(number);
    }
    
}
