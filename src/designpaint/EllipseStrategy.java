package designpaint;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * @author danny
 */
public class EllipseStrategy implements DrawStrategy{

    @Override
    public void draw(Graphics graphics, int x, int y, int w, int h) {
        graphics.setColor(Color.black);
        graphics.drawOval(x, y, Math.abs(w), Math.abs(h));
    }

}
