import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

/**
 * Creates multiple Robots and makes them race across the screen
 * 
 * Can you find examples of weak coding? 
 * 
 * @author Kent Collins
 * @version 8 December, 2014
 *
 */
public class RaceLab_D { 
   private static final int NUMBOTS = 20;
      public static void main(String[] args) {
      Display.setSize(20, 20);
      Display.setSpeed(8);
      // Construct Robot competitors
         Robot[] robots = new Robot[NUMBOTS];
         for(int i = 0; i<NUMBOTS; i++) {
            robots[i] = new Robot(1, i+1, Display.EAST, 0);
         }    
      // Begin the race
         while (true) {   
      // Create a random integer from 0 to NUMBOTS -1
         int luckyRobot = (int) (Math.random()*NUMBOTS);
            robots[luckyRobot].move();
         if (robots[luckyRobot].getX() > 20) {
            JOptionPane.showMessageDialog(null,"Robot "+luckyRobot+" won!");
         break;
         }
         }
   }
}