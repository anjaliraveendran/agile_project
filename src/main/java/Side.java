package src.main.java;

import java.util.Arrays;


public class Side
{
    private Hole tuz;
    private Kazan kazan;
    private String colour;
    private Hole[] holes = new Hole[9];
    

    public Side(String colour)
    {
       for(int i=0; i<9; i++){
        holes[i] = new Hole();
       }
        
        kazan = new Kazan();
        tuz = null;
        this.colour = colour;
        for(int i = 0; i < 9; i++)
        {
            holes[i].setColour(colour);
           // System.out.println("index..."+ i +": num..." + numberInHole);
        }
    }

    public int getNumberInKazan()
    {
        return kazan.getNumberOfKorgools();
    }
    
    public Hole getHole(int index)
    {
        return holes[index];
    }
    
    public void updateKazan(int number, Hole hole)
    {
        kazan.addKorgools(number);
        hole.deleteKorgools(number);
    }
    
    public int getNumberInHole(int index)
    {
        return holes[index].getNumberOfKorgools();
    }
    
    public String getColour() {
        return colour;
    }
    
    public Hole getTuz()
    {
        return tuz;
    }
    
    public void setTuz(Hole tuz)
    {
        this.tuz = tuz;
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