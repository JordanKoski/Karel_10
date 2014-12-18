/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jordan Koski>  // replace <...> with your name
* @version <30th October> // replace <...> with the date
*/

import edu.fcps.karel2.Robot;

public class Athlete extends Robot {
   
      public Athlete()
      {
         super (1, 1, Display.NORTH, Display.INFINITY);
      }
      public Athlete (int x, int y, int dir, int beep)
      {   
        super(x, y, dir, beep);
      }
      public void turnAround()
      {
      turnLeft();
      turnLeft();
      }
      public void turnRight()
      {
      turnLeft();
      turnLeft();
      turnLeft();
      }
    
      
      
      public static void main(String[] args) {
          
             Display.openWorld("maps/maze.map");
   Display.setSize(8, 8);
   Display.setSpeed(5);
   
   Athlete pete = new Athlete();
   
   pete.putBeeper();
   pete.move();
   pete.putBeeper();
   pete.turnRight();
   pete.move();
   pete.putBeeper();
   pete.turnRight();
   pete.move();
   pete.putBeeper();
   pete.turnLeft();
   pete.move();
   pete.putBeeper();
   pete.turnLeft();
   pete.move();
   pete.putBeeper();
   pete.turnRight();
   pete.move();
   pete.putBeeper();
   pete.move();
   pete.putBeeper();
   pete.turnRight();
   pete.move();
   pete.putBeeper();
   pete.turnLeft();
   pete.move();
   pete.putBeeper();
   pete.turnLeft();
   pete.move();
   pete.putBeeper();
   pete.move();
   pete.putBeeper();
   pete.move();
   pete.putBeeper();
   pete.move();
   pete.putBeeper();
   pete.turnRight();
   pete.move();
   pete.putBeeper();
   pete.move();



   

   }

}
