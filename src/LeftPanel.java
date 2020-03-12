import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * This class is used to create the panel on the left side
 * which has different shapes.
 * 
 * @author Rishika Bera
 * @version 1.0
 */
public class LeftPanel extends JPanel {
	public static List<Shapes> leftPanelShapes = new ArrayList<Shapes> ();
	/**
	 * Defining x and y coordinates for the shapes
	 * to start. x from the left of the frame and y
	 * from the top of the frame.
	 */
	private final int X_COORDINATE_SHAPES = 100;
	private final int Y_COORDINATE_SQUARE = 100;
	private final int Y_COORDINATE_OPENBRACKET = 60;
	private final int Y_COORDINATE_CLOSEBRACKET = 180;
	private final int Y_COORDINATE_LESSTHAN = 300;
	private final int Y_COORDINATE_GREATERTHAN = 420;
	private final int Y_COORDINATE_TWOBARS = 540;


	private static final long serialVersionUID = 1L;
	/**
	 * Uses graphics to draw components
	 * @param graphics
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		Shapes openbracket = new OpenBracket(X_COORDINATE_SHAPES, Y_COORDINATE_OPENBRACKET);
		openbracket.drawShape(graphics);
		leftPanelShapes.add(openbracket);

		Shapes closebracket = new CloseBracket(X_COORDINATE_SHAPES, Y_COORDINATE_CLOSEBRACKET);
		closebracket.drawShape(graphics);
		leftPanelShapes.add(closebracket);

		Shapes twobars = new TwoBars(X_COORDINATE_SHAPES, Y_COORDINATE_TWOBARS);
		twobars.drawShape(graphics);
		leftPanelShapes.add(twobars);

		Shapes lessthan = new LessThan(X_COORDINATE_SHAPES, Y_COORDINATE_LESSTHAN);
		lessthan.drawShape(graphics);
		leftPanelShapes.add(lessthan);

		Shapes greaterthan = new GreaterThan(X_COORDINATE_SHAPES, Y_COORDINATE_GREATERTHAN);
		greaterthan.drawShape(graphics);
		leftPanelShapes.add(greaterthan);



//		Shapes square = new Square(X_COORDINATE_SHAPES, Y_COORDINATE_SQUARE);
//		square.drawShape(graphics);
//		leftPanelShapes.add(square);
//		Shapes circle = new Circle(X_COORDINATE_SHAPES, Y_COORDINATE_CIRCLE);
//		circle.drawShape(graphics);
//		leftPanelShapes.add(circle);
//		Shapes triangle = new Triangle(X_COORDINATE_SHAPES, Y_COORDINATE_TRIANGLE);
//		triangle.drawShape(graphics);
//		leftPanelShapes.add(triangle);


		this.addMouseListener(new LeftPanelMouseListener());
	}
	
}
