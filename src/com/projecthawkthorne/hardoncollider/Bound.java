package com.projecthawkthorne.hardoncollider;

/**
 * a generic bounding region
 * 
 * @author Patrick
 * 
 */
public abstract class Bound {
	private Collidable node;

	// TODO if rectangular points are supplied return a rectangle
	/**
	 * create a new bound with an array of x-values and an array of y-values. If
	 * the points indicate a rectangle it's better to use the other create()
	 * method.
	 * 
	 * @param x
	 * @param y
	 * @return the bound
	 */
	public static Bound create(int[] x, int[] y) {
		return new Polygon(x, y);
	}

	/**
	 * create a rectangular bound
	 * 
	 * @param x
	 *            the smallest x contained
	 * @param y
	 *            the smallest y contained
	 * @param w
	 *            the width
	 * @param h
	 *            the high
	 * @return the bound
	 */
	public static Bound create(float x, float y, float w, float h) {
		return new Rectangle(x, y, w, h);
	}

	/**
	 * set the node that this bounding box represents
	 * 
	 * @param n
	 */
	public final void setUserData(Collidable n) {
		this.node = n;
	}

	/**
	 * retrieves the node this bound refers to
	 * 
	 * @return the node that the bounding box represent
	 */
	public final Collidable getUserData() {
		return node;
	}

	/**
	 * draws this bounding box
	 */
	public abstract void draw();

	/**
	 * results in corners={minX,minY,maxX,maxY}
	 * 
	 * @param corners
	 */
	public abstract void bbox(float[] corners);

	/**
	 * moves the object so that the rectangle enclosing it has its leftmost edge
	 * at x = newX
	 * 
	 * @param newX
	 */
	public abstract void setX(float newX);

	/**
	 * moves the object so that the rectangle enclosing it has its uppermost
	 * edge at y = newY
	 * 
	 * @param newY
	 */
	public abstract void setY(float newY);

	/**
	 * returns the smallest y value within this bound at location x = xVal<br>
	 * in other words, the minimum of the intersection of <br>
	 * vertical line at xVal and the bounded region <br>
	 * 
	 * @param xVal
	 * @return smallest y-value in the bound intersecting <br>
	 *         the vertical line x=xVal
	 */
	public abstract float getSmallestY(float xVal);

	/**
	 * scales the width to be of size newWidth <br>
	 * the leftmost x position remains the same
	 * 
	 * @param newWidth
	 *            the new width of the bound
	 */
	public abstract void setWidth(float newWidth);

	/**
	 * scales the height to be of size newHeight <br>
	 * the topmost y position remains the same
	 * 
	 * @param newHeight
	 *            the new height of the bound
	 */
	public abstract void setHeight(float newHeight);

	/**
	 * returns the width
	 * 
	 * @return the width
	 */
	public abstract float getWidth();

	/**
	 * returns the width
	 * 
	 * @return the width
	 */
	public abstract float getHeight();

}
