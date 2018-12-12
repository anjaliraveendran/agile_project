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
    private Hole[] holesOfBoth;
    private static final int tuzNum = 3;

    /**
     * Constructor for objects of class Board
     */
    public Board(String lightC, String darkC)
    {
        sideDark = new Side(darkC);
        sideLight = new Side(lightC);
        holesOfBoth = new Hole[18];

        for(int i = 0; i < 9; i++)
        {
            holesOfBoth[i] = sideLight.getHole(i);
        }
        for(int i = 9; i < 18; i++)
        {
            holesOfBoth[i] = sideDark.getHole(i-9);
        }

    }

    public void moveBalls(int index) {
        Side side;
        if(isDark(index)){
            side = sideDark;
        }else{
            side = sideLight;
        }
        int indexOfCurrent = index - 1;
        Hole startHole = holesOfBoth[indexOfCurrent];
        int numberInHole = startHole.getNumberOfKorgools();

        if(numberInHole > 1) {
            for(int i = 0; i < numberInHole-1; i++) {
                side.addKorgoolsToHole(indexOfCurrent%18);
                startHole.deleteKorgools(1);
                indexOfCurrent++;
                System.out.println("index..."+ i +": num..." + numberInHole);
            } 
        }
        else if(numberInHole == 1) {
            side.addKorgoolsToHole((indexOfCurrent+1)%18);
            startHole.deleteKorgools(1);
            indexOfCurrent++;
        }
        Hole hole = holesOfBoth[indexOfCurrent];
        if((hole.getNumberOfKorgools() % 2) == 0 && !hole.getColour().equals(side.getColour()))
        {
            side.updateKazan(hole.getNumberOfKorgools(), hole);
        }

        if(side.getTuz() == null){
            if(hole.getNumberOfKorgools() == tuzNum && !hole.getColour().equals(side.getColour()) && tuzRules(indexOfCurrent))
            {
                //add to current players kazan
                side.updateKazan(hole.getNumberOfKorgools(), hole);
                side.setTuz(hole);
            }
        }else{
            int n = side.getTuz().getNumberOfKorgools();
            side.getTuz().deleteKorgools(n);
        }

        if(isDark(index)){
            sideDark = side;
        }else{
            sideLight = side;
        }
    }

    private boolean tuzRules(int index)
    {
        return ((index % 8) == 0 || (index % 17) == 0);
    }

    private boolean isDark(int index)
    {
        if(index > 9){
            return true;
        }else{
            return false;
        }
    }
}
