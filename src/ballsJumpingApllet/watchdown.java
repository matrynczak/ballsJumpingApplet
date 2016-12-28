package ballsJumpingApllet;

import java.awt.*; 

public class watchdown extends Thread {
    int time = 0;

    public void drawClock(Graphics g){
        g.drawString(String.valueOf(time), 100, 100);
    }

    public void run() {

        while (true) {
            try {
                this.sleep(1000);
            } catch(InterruptedException exc) {
                System.out.println("Wątek zliczania czasu zoostał przerwany.");
                return;
            }
            time++;
            int minutes = time/60;
            int sec = time%60;
            System.out.println(minutes + ":" + sec);
        }
    }
}
