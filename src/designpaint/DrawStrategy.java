package designpaint;

import java.awt.Graphics;

/**
 *
 * @author danny
 */
public interface DrawStrategy {
    public void draw(Graphics graphics, int x, int y, int w, int h);
    public String toString();
    
}
