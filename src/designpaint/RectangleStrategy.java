package designpaint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author danny
 */
public class RectangleStrategy implements DrawStrategy {

    @Override
    public void draw(Graphics graphics, int x, int y, int w, int h) {
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, Math.abs(w), Math.abs(h));
    }
    
}
