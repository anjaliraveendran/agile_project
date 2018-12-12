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
            sideLight.getHole(i).setColour(lightC);
            
        }
        
        for(int i = 9; i < 18; i++)
        {
            holesOfBoth[i] = sideDark.getHole(i-9);
            sideDark.getHole(i).setColour(darkC);
        }
        
    }
    
    public Hole moveBalls(int index) {
        Side side;
        if(index > 9){
            side = sideDark;
        }else{
            side = sideLight;
        }
        int numberInHole = side.getNumberInHole(index);
        //side.deleteKorgoolsAtHole(index, numberOfBalls);
                 int indexOfCurrent = index - 1;
                 int steps = 0;
        if(numberInHole > 1) {
            for(int i = 0; i < numberInHole-1; i++) {
                side.addKorgoolsToHole(indexOfCurrent%18);
                steps++;
            } 
        }
        else if(numberInHole == 1) {
            side.addKorgoolsToHole((indexOfCurrent+1)%18);
            steps++;
        }
      Hole tuz = holesOfBoth[indexOfCurrent + steps];
        if(tuz.getNumberOfKorgools() == 3 && !tuz.getColour().equals(side.getColour()))
        {
            //add to current players kazan
            
            return tuz;
        }else{
            return null;
        }
    }
}
