package designpaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * Selected shape, used to draw an indicator around the selected shape.
 */
public class Select extends Shape {

    /**
     * Creates a new Select shape.
     * @param id The id of the shape.
     * @param coordinateX The X coordinate of the origin of the shape.
     * @param coordinateY The Y coordinate of the origin of the shape.
     * @param width The width of the shape.
     * @param height Height of the shape.
     */
    public Select(int id, int coordinateX, int coordinateY, int width, int height) {
        super(id, coordinateX, coordinateY, width, height);
    }

    /**
     * Draws the shape at its coordinates.
     * @param graphics Graphics generator
     * @return this (for mapping)
     */
    @Override
    public Shape draw(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setColor(Color.red);
        double thickness = 2;
        Stroke oldStroke = g2.getStroke();
        g2.setStroke(new BasicStroke((float) thickness));
        
        g2.drawRect(coordinateX, coordinateY, width, height);
        g2.setStroke(oldStroke);
        return this;
    }
    
    /**
     * Gets the name of the Shape subclass used to instantiate this.
     * @return The name of the Shape type (presumably Select)
     */
    @Override
    public String getShapeType(){
        return this.getClass().getSimpleName();
    }

    /**
     * Generates a String representation of this Shape, that can be saved to a file.
     * @return String representation of this Shape
     */
    @Override
    public String toString() {
        return "select " + coordinateX + " " + coordinateY + " " + width + " " + height;
    }
}
