import java.util.Arrays;


public class Side
{
    private Hole[] holes;
    
    private Kazan kazan;

  
    public Side()
    {
        holes = new Hole[9];
        kazan = new Kazan();
    }

    public int getNumberInKazan()
    {
        return kazan.getNumberOfKorgools();
    }
    
    public void insertKorgoolsToKazan(int number)
    {
        kazan.addKorgools(number);
    }
    
    public int getNumberInHole(int index)
    {
        return holes[index].getNumberOfKorgools();
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
