package ballsJumpingApllet;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class ballsJumpingApplet extends Applet {
   private static final long serialVersionUID = 1L;
   protected Ball ball1, ball2, ball3;
   protected Racket racket;
   Random rnd = new Random();
   int WIDTH = 600, HEIGHT = 600;

   public void init(){
      setBackground(Color.GRAY);
      setSize(WIDTH,HEIGHT);
//      Dimension d = getSize();
//      ball1 = new Ball(d);
//      ball2 = new Ball(d);
//      ball3 = new Ball(d);
//      racket = new Racket(d);

      boardOfGame gameBoard = new boardOfGame();
      gameBoard.start();
      watchdown clock = new watchdown();
      clock.start();
//      addKeyListener(this);

   }
   

   
//   public void ballJump (Dimension d, Ball ball, Racket racket){
//      if ((ball.y == d.height - racket.height) && ((ball.x >= racket.x) && (ball.x <= racket.x + racket.width))){
//         int stepHeight = rnd.nextInt(550);
//         int stepWidht = rnd.nextInt(580);
//         ball.y = ball.y - stepHeight; 
//         ball.x = stepWidht;
//      }
//   }
//   
//   public void paint(Graphics g){
//      ball1.DrawBall(g);
//      ball2.DrawBall(g);
//      ball3.DrawBall(g);
//      racket.DrawRacket(g);
////        clock.paintClock(g);
//   }

//   public void run(){
//      while(true){
//         Dimension d = getSize();
//         try {
//            Thread.sleep(15);
//         } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//         }
//         ball1.falling(d);
//         ball2.falling(d);
//         ball3.falling(d);
//         ballJump(d, ball1, racket);
//         ballJump(d, ball2, racket);
//         ballJump(d, ball3, racket);
//         repaint();
//      }
//   }

//   @Override
//   public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            racket.x = racket.x + 8;
//            }
//        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            racket.x = racket.x - 8;
//            }
//   }
//
//   @Override
//   public void keyReleased(KeyEvent e) {
//      // TODO Auto-generated method stub
//      
//   }
//
//   @Override
//   public void keyTyped(KeyEvent e) {
//      // TODO Auto-generated method stub
//      
//   }
}