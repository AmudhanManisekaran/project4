import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ListIterator;

/**
 * Adding mouse listeners for providing mouse click functionality
 * to add the shape to the right panel.
 * 
 * @author Parikshith Kedilaya Mallar
 * @version 1.0
 */
public class LeftPanelMouseListener extends MouseAdapter {
	
	private static boolean isTriangleClicked = false;
	private static boolean isOpenBracketClicked = false;
	private static boolean isCloseBracketClicked = false;
	private static boolean isTwoBarsClicked = false;

	public static boolean isOpenBracketClicked() {
		return isOpenBracketClicked;
	}

	public static void setOpenBracketClicked(boolean isOpenBracketClicked) {
		LeftPanelMouseListener.isOpenBracketClicked = isOpenBracketClicked;
	}

	public static boolean isCloseBracketClicked() {
		return isCloseBracketClicked;
	}

	public static void setCloseBracketClicked(boolean isCloseBracketClicked) {
		LeftPanelMouseListener.isCloseBracketClicked = isCloseBracketClicked;
	}
	
	public static boolean isTriangleClicked() {
		return isTriangleClicked;
	}

	public static void setTriangleClicked(boolean isTriangleClicked) {
		LeftPanelMouseListener.isTriangleClicked = isTriangleClicked;
	}

	public static boolean isTwoBarsClicked() {
		return isTwoBarsClicked;
	}

	public static void setTwoBarsClicked(boolean isTwoBarsClicked) {
		LeftPanelMouseListener.isTwoBarsClicked = isTwoBarsClicked;
	}

	/**
	 * Overridden method to add mouse click event handler.
	 * Used to track which shape has been clicked on the left panel,
	 * so that only that shape can be created on the right panel.
	 */
	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		int x = mouseEvent.getX();
		int y = mouseEvent.getY();
		ListIterator<Shapes> iterator = LeftPanel.leftPanelShapes.listIterator();
		while(iterator.hasNext()) {
			Shapes next = iterator.next();
			if (next instanceof TwoBars) {
				if (next.containsPoint(x, y)) {
					markIsClickedTrue(ShapesEnum.TWOBARS);
				}
			} else if (next instanceof OpenBracket) {
				if (next.containsPoint(x, y)) {
					markIsClickedTrue(ShapesEnum.OPENBRACKET);
				}
			} else if (next instanceof CloseBracket) {
				if (next.containsPoint(x, y)) {
					markIsClickedTrue(ShapesEnum.CLOSEBRACKET);
				}
			}else if (next instanceof Triangle) {
				if (next.containsPoint(x, y)) {
					markIsClickedTrue(ShapesEnum.TRIANGLE);
				}
			}
		}
	}

    /**
	 * Instantiates or uses the created instance of different shapes' class
	 * and sets isClicked value as true for the shape which was clicked.
	 * @param shape
	 */
	public static void markIsClickedTrue(ShapesEnum shape) {
		try {
			if (ShapesEnum.TWOBARS == shape) {
				setTriangleClicked(false);
				setTwoBarsClicked(true);
				setOpenBracketClicked(false);
				setCloseBracketClicked(false);
			}
			if (ShapesEnum.OPENBRACKET == shape) {
				setOpenBracketClicked(true);
				setTwoBarsClicked(false);
				setTriangleClicked(false);
				setCloseBracketClicked(false);
			}
			if (ShapesEnum.CLOSEBRACKET == shape) {
				setOpenBracketClicked(false);
				setCloseBracketClicked(true);
				setTwoBarsClicked(false);
				setTriangleClicked(false);
			}
			if (ShapesEnum.TRIANGLE == shape) {
				setTriangleClicked(true);
				setTwoBarsClicked(false);
				setOpenBracketClicked(false);
				setCloseBracketClicked(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * returns the shape that is clicked.
	 */
	public static ShapesEnum getSelectedShape() {
		if (isTwoBarsClicked()) {
			return ShapesEnum.TWOBARS;
		} else if (isOpenBracketClicked()) {
			return ShapesEnum.OPENBRACKET;
		} else if (isTriangleClicked()) {
			return ShapesEnum.TRIANGLE;
		} else if (isCloseBracketClicked()) {
			return ShapesEnum.CLOSEBRACKET;
		} else {
			return null;
		}
	}
	
}
