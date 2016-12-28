package ballsJumpingApllet;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class boardOfGame extends Thread implements KeyListener {
	   private static final long serialVersionUID = 1L;
	   protected Ball ball1, ball2, ball3;
	   protected Racket racket;
	   protected ballsJumpingApplet game;
	   Random rnd = new Random();
   
   public void ballJump (Dimension d, Ball ball, Racket racket){
	      if ((ball.y == d.height - racket.height) && ((ball.x >= racket.x) && (ball.x <= racket.x + racket.width))){
	         int stepHeight = rnd.nextInt(550);
	         int stepWidht = rnd.nextInt(580);
	         ball.y = ball.y - stepHeight; 
	         ball.x = stepWidht;
	      }
	   }
   
   public void paint(Graphics g){
      ball1.DrawBall(g);
      ball2.DrawBall(g);
      ball3.DrawBall(g);
      racket.DrawRacket(g);
   }
//   
//   public void start(Graphics g){
//	   paint(g);
//   }
   
   public void run(Graphics g){
	      while(true){
	         Dimension d = game.getSize();
	         try {
	            Thread.sleep(15);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
//	         this.paint(g);
	         ball1.falling(d);
	         ball2.falling(d);
	         ball3.falling(d);
	         ballJump(d, ball1, racket);
	         ballJump(d, ball2, racket);
	         ballJump(d, ball3, racket);
	      }
	   }
   
   @Override
   public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            racket.x = racket.x + 8;
            }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            racket.x = racket.x - 8;
            }
   }

   @Override
   public void keyReleased(KeyEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void keyTyped(KeyEvent e) {
      // TODO Auto-generated method stub
      
   }
}
