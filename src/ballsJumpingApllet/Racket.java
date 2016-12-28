package ballsJumpingApllet;

/**
 * Created by gp_qa on 08.11.2016.
 */
import java.awt.*;
import java.util.Random;

public class Racket {
    protected int x;
    protected int y;
    protected int width = 100;
    protected int height = 20;

    public Racket (Dimension d){
        Random rnd = new Random();
        x = rnd.nextInt(d.width - width);
        y = d.height - height;
    }

    public void DrawRacket (Graphics g){
        g.fillRect(x,y,width,height);
    }
}
