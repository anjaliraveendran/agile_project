package src.main.java;


public class Kazan
{
    private int numberOfKorgools;
    
    //initialises the kazan with 0 korgools
    public Kazan()
    {
        numberOfKorgools = 0;
    }
    //returns how many korgools are in the kazan
    public int getNumberOfKorgools()
    {
        return numberOfKorgools;
    }
    //adds korgools to the kazan
    public void addKorgools(int number)
    {
        numberOfKorgools += number;
    }
}
