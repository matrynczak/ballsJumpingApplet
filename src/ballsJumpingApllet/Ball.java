/**
 * Created by gp_qa on 08.11.2016.
 */
package ballsJumpingApllet;

import java.awt.*;
import java.util.Random;

public class Ball {
    protected static final int width = 15;
    protected static final int height = 15;
    protected int x;
    protected int y;
    private Color kolor;

    public Ball (Dimension d){
        Random rnd = new Random();
        kolor = new Color(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat());
        x = rnd.nextInt(d.width - width);
        y = rnd.nextInt(d.height - height);
    }

    public void DrawBall (Graphics g){
        g.setColor(kolor);
        g.fillOval(x,y, width, height);
    }

    public void falling (Dimension d){
    	if (y < d.height - height)		y += 1;
    }
}
