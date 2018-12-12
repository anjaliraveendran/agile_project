package src.main.java;

import java.util.Random;
public class ComputerPlayer extends Player{
 
 private static Random rand;
 public ComputerPlayer(String colour, Board board){
     super(colour,board);
     rand = new Random();
 }

 protected void move()
 {
     int n = 9 + rand.nextInt(9);
     tuz = board.moveBalls(n);
 } 
}
