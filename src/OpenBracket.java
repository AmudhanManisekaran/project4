import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
//import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

/**
 * @author Amudhan
 * @version 1.0
 *
 */
public class OpenBracket extends Shapes implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int OFFSET = 50;
    private double x, y;
//    private Shape circle = null;
    private Shape openbracket = null;
    private Shapes dot = null;
    private boolean isLineDrawn = false;

    public OpenBracket(double x, double y) {
        this.x = x - OFFSET;
        this.y = y - OFFSET;

    }

    public Shapes getDot() {
        return dot;
    }

    public void setDot(Shapes dot) {
        this.dot = dot;
    }

    @Override
    public void drawShape(Graphics graphic) {
//        circle = new Ellipse2D.Double(x, y, 200, 200);
//        Graphics2D graphics2 = (Graphics2D) graphic;
//        dot = new Dot(x + 100 - 5, y + 100 - 5);
//        dot.drawShape(graphics2);
//        graphics2.draw(circle);

//        circle = new Rectangle2D.Double(x, y, 200, 100);
//        Graphics2D graphics2 = (Graphics2D) graphic;
//        dot = new Dot(x + 100 - 70, y + 100 - 50);
//        dot.drawShape(graphics2);
//        graphics2.draw(circle);

        openbracket = new Rectangle2D.Double(x, y, 200, 100);
        Graphics2D graphics2 = (Graphics2D) graphic;
        dot = new Dot(x + 100 - 70, y + 100 - 50);
        dot.drawShape(graphics2);
        graphics2.draw(openbracket);

    }

    /**
     * Check if a point is inside the Circle
     *
     * @param x - X co-ordinate of the point
     * @param y - Y co-ordinate of the point
     */
    public boolean containsPoint(int x, int y) {
//        return circle.contains(x, y);
        return openbracket.contains(x, y);
    }

    @Override
    public int getX() {
        return (int) x;
    }

    @Override
    public void setX(int x) {
        this.x = x - OFFSET;
    }

    @Override
    public int getY() {
        return (int) y;
    }

    @Override
    public void setY(int y) {
        this.y = y - OFFSET;
    }

    public boolean isLineDrawn() {
        return isLineDrawn;
    }

    public void setLineDrawn(boolean isLineDrawn) {
        this.isLineDrawn = isLineDrawn;
    }

}
