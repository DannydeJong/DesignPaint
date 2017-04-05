package designpaint;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Shape {

    public Ellipse(int id, int coordinateX, int coordinateY, int width, int height) {
        super(id, coordinateX, coordinateY, width, height);
    }
 
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.drawOval(coordinateX, coordinateY, width, height);
    }
    
}
