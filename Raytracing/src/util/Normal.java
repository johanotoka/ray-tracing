package util;

/**
 * A class representing a normal 3D vector.
 *
 * @author Laiba and Steeve
 */

public class Normal {

    /**
     * The x component of the normal.
     */
    public double x;

    /**
     * The y component of the normal.
     */
    public double y;

    /**
     * The z component of the normal.
     */
    public double z;


    /**
     * Creates a new normal with the given components.
     *
     * @param x The x component of the normal.
     * @param y The y component of the normal.
     * @param z The z component of the normal.
     */
    public Normal(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Creates a new normal with the same components as the given normal.
     *
     * @param normal The normal to copy.
     */
    public Normal(Normal normal) {
        this.x = normal.x;
        this.y = normal.y;
        this.z = normal.z;
    }

    /**
     * Creates a new normal with all components set to zero.
     */
    public Normal() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * This method does the dot product of the normal and the given vector.
     *
     * @param normal
     * @return the dot product of the normal and the given vector.
     */
    public double dot(Normal normal) {
        return this.x * normal.x + this.y * normal.y + this.z * normal.z;
    }

    /**
     * This method normalizes a vector.
     */
    public void normalize() {
        double length = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        this.x /= length;
        this.y /= length;
        this.z /= length;
    }

}
