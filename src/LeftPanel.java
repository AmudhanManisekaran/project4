import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * This class is used to create the panel on the left side
 * which has different shapes.
 * 
 * @author
 * @version 1.0
 */
public class LeftPanel extends JPanel {
	public static List<Shapes> leftPanelShapes = new ArrayList<Shapes> ();


	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

//		int y_COORDINATE_OPENBRACKET = 60;
//		int x_COORDINATE_SHAPES = 100;
//		Shapes openbracket = new OpenBracket(x_COORDINATE_SHAPES, y_COORDINATE_OPENBRACKET);
//		openbracket.drawShape(graphics);
//		leftPanelShapes.add(openbracket);
//
//		int y_COORDINATE_CLOSEBRACKET = 180;
//		Shapes closebracket = new CloseBracket(x_COORDINATE_SHAPES, y_COORDINATE_CLOSEBRACKET);
//		closebracket.drawShape(graphics);
//		leftPanelShapes.add(closebracket);
//
//		int y_COORDINATE_LESSTHAN = 300;
//		Shapes lessthan = new LessThan(x_COORDINATE_SHAPES, y_COORDINATE_LESSTHAN);
//		lessthan.drawShape(graphics);
//		leftPanelShapes.add(lessthan);
//
//		int y_COORDINATE_GREATERTHAN = 420;
//		Shapes greaterthan = new GreaterThan(x_COORDINATE_SHAPES, y_COORDINATE_GREATERTHAN);
//		greaterthan.drawShape(graphics);
//		leftPanelShapes.add(greaterthan);
//
//		int y_COORDINATE_ATTHERATE = 540;
//		Shapes attherate = new AtTheRate(x_COORDINATE_SHAPES, y_COORDINATE_ATTHERATE);
//		attherate.drawShape(graphics);
//		leftPanelShapes.add(attherate);
//
//		int y_COORDINATE_TWOBARS = 660;
//		Shapes twobars = new TwoBars(x_COORDINATE_SHAPES, y_COORDINATE_TWOBARS);
//		twobars.drawShape(graphics);
//		leftPanelShapes.add(twobars);
//
//		int y_COORDINATE_HYPHEN = 780;
//		Shapes hyphen = new Hyphen(x_COORDINATE_SHAPES, y_COORDINATE_HYPHEN);
//		hyphen.drawShape(graphics);
//		leftPanelShapes.add(hyphen);

		this.addMouseListener(new LeftPanelMouseListener());
	}
	
}
