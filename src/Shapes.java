import java.awt.Graphics;

public abstract class Shapes {
	
	public abstract void drawShape(Graphics graphic);
	
	public abstract boolean containsPoint(int x, int y);
	
	public abstract int getX();
	public abstract void setX(int x);
	public abstract int getY();
	public abstract void setY(int y);
	
}
