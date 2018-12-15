package src.main.java;

import java.util.Arrays;
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    //private ArrayList <Hole> holeList;

    private Side sideDark;
    private Side sideLight;
    private static final int tuzNum = 3;


    /**
     * Constructor for objects of class Board
     */
    public Board(String lightC, String darkC)
    {
        sideDark = new Side(darkC);
        sideLight = new Side(lightC);

    }
    
    public boolean darkWin()
    {
        if(sideDark.getNumberInKazan() >= 82){
            return true;
        }
        return false;
    }
    
    public boolean lightWin()
    {
        if(sideLight.getNumberInKazan() >= 82){
            return true;
        } 
        return false;
    }
    
    public Side getSide(String colour)
    {
        if(colour.equals(sideDark.getColour())){
            return sideDark;
        }else{
            return sideLight;
        }
    }

    public boolean moveBalls(int index, String colour) {
        Side current;
        Side other;
        if(isDark(colour)){
            current = sideDark;
            other = sideLight;
        }else{
            current = sideLight;
            other = sideDark;
        }

        Hole startHole = current.getHole(index);
        int numberInHole = startHole.getNumberOfKorgools();
        boolean changeSide = false;

        if(numberInHole == 0) {
            return false;
        }
        
        if(numberInHole > 1) {
            for(int i = numberInHole; i > 1; i--) {
                if(index < 8)
                {
                    index++;
                    current.addKorgoolsToHole(index);
                    startHole.deleteKorgools(1);
                    System.out.println("Korgools: " + startHole.getNumberOfKorgools() + "adding Hole: " + (index + 1) + "Korgools:"
                     + current.getNumberInHole(index) );
                }else{
                    index++;
                    other.addKorgoolsToHole(index%8);
                    startHole.deleteKorgools(1);
                    System.out.println("Korgools: " + startHole.getNumberOfKorgools() + "adding Hole: " + (index + 1) + "Korgools:"
                     + other.getNumberInHole(index%8) );
                    changeSide = true;
                    //System.out.println("index..."+ i +": num..." + numberInHole);
                } 
            }
            
        }else if(numberInHole == 1) {

            if(index > 8)
            {
                changeSide = true;
                index++;
                other.addKorgoolsToHole(index%8);
                startHole.deleteKorgools(1);
                System.out.println(startHole.getNumberOfKorgools());
                
            }else{
                index++;
                current.addKorgoolsToHole(index%9);
                startHole.deleteKorgools(1);
                System.out.println(startHole.getNumberOfKorgools());
            }
        }
        System.out.println("\n");
        Hole hole;
        if(changeSide){
            hole = other.getHole(index%8);
        }else{
            hole = current.getHole(index);
        }

        if((hole.getNumberOfKorgools() % 2) == 0 && !hole.getColour().equals(current.getColour()))
        {
            current.updateKazan(hole);
        }

        if(current.getTuz() == null && (other.getTuz() == null || hole.getIndex() != other.getTuz().getIndex())){
            if(hole.getNumberOfKorgools() == tuzNum && !hole.getColour().equals(current.getColour()))
            {
                //add to current players kazan
                current.setTuz(hole);
                current.updateKazan(hole);
                
            }
        }else if(current.getTuz() != null){
            //int n = side.getTuz().getNumberOfKorgools();
            //side.getTuz().deleteKorgools(n);
            current.updateKazan(current.getTuz());
        }

        return true;
    }

    private boolean isDark(String colour)
    {
        if(sideDark.getColour().equals(colour))
        {

            return true;
        }else{
            return false;
        }
    }
    
}

