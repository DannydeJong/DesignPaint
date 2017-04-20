package designpaint;
import java.util.concurrent.atomic.AtomicReference;

public class Command_AddRectangle extends Command {
    AtomicReference<Composite> group;
    AtomicReference<Component> newShape;
    Component shape;

    public Command_AddRectangle(AtomicReference<Composite> group, AtomicReference<Component> newShape, int x, int y, int w, int h) {
        int width = w - x;
        int height = h - y;
        this.group = group;
        this.newShape = newShape;
        this.newShape.set(new Rectangle(x, y, width, height));
        this.shape = newShape.get();
    }

    @Override
    public void execute() {
        group.get().add(shape, false);
    }

    @Override
    public void undo() {
       group.get().remove(shape);
    }
    
}
