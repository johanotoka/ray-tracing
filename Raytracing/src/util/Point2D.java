package util;

/**
 * A 2D point.
 *
 * @author Laiba and Steeve
 */

public class Point2D {

    /**
     * The x component of the point.
     */
    public double x;

    /**
     * The y component of the point.
     */
    public double y;


    /**
     * Creates a new point with the given components.
     *
     * @param x The x component of the point.
     * @param y The y component of the point.
     */
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Creates a new point with all components set to zero.
     */
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
}
