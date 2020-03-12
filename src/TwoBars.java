import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

/**
 *
 * @author Amudhan Manisekaran
 * @version 1.0
 */

public class TwoBars extends Shapes implements Serializable {

    private static final long serialVersionUID = 1L;
    private Shape twobars = null;
    private int x, y;
    private Shapes leftBar = null, rightBar = null;
    private final int OFFSET = 50;

    public TwoBars(int x, int y) {
        this.x = x - OFFSET;
        this.y = y - OFFSET;
    }

    @Override
    public void drawShape(Graphics graphic) {
        twobars = new Rectangle2D.Double(x, y, 200, 100);
        Graphics2D graphics2 = (Graphics2D) graphic;
        leftBar = new VerticalBar(x + 10, y + 10);
        leftBar.drawShape(graphics2);
        rightBar = new VerticalBar(x + 180, y + 10);
        rightBar.drawShape(graphics2);

        Font font = new Font("Serif", Font.PLAIN, 40);
        graphics2.setFont(font);
        graphics2.drawString("| |", x + 85, y + 60);

        graphics2.draw(twobars);

    }

    @Override
    public boolean containsPoint(int x, int y) {
        return twobars.contains(x, y);
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

    public Shape getTwoBars() {
        return twobars;
    }

    public void setTwoBars(Shape twobars) {
        this.twobars = twobars;
    }

    public Shapes getLeftBar() {
        return leftBar;
    }

    public void setLeftBar(Shapes leftBar) {
        this.leftBar = leftBar;
    }

    public Shapes getRightBar() {
        return rightBar;
    }

    public void setRightBar(Shapes rightBar) {
        this.rightBar = rightBar;
    }

//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

}
