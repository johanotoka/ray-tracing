package util;

/**
 * A class representing a 3D point.
 *
 * @author Laiba and Steeve
 */

public class Point3D {

    /**
     * The x component of the point.
     */
    public double x;

    /**
     * The y component of the point.
     */
    public double y;

    /**
     * The z component of the point.
     */
    public double z;

    /**
     * Creates a new point with the given components.
     *
     * @param x The x component of the point.
     * @param y The y component of the point.
     * @param z The z component of the point.
     */
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Creates a new point with the same components as the given point.
     *
     * @param point The point to copy.
     */
    public Point3D(Point3D point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    /**
     * Creates a new point with all components set to zero.
     */
    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Adds the given vector to this point.
     * @param point
     * @return the new point
     */
    public Point3D add(Point3D point) {
      return new Point3D(this.x + point.x, this.y + point.y, this.z + point.z);
    }

    /**
     * Subtracts the given vector from this point.
     * @param point
     * @return the new point
     */
    public Point3D subtract(Point3D point) {
        return new Point3D(this.x - point.x, this.y - point.y, this.z - point.z);
    }

    /**
     * Multiplies this point by another point.
     * @param point
     * @return the new point
     */
    public Point3D multiply(Point3D point) {
        return new Point3D(this.x * point.x, this.y * point.y, this.z * point.z);
    }

    /**
     * Multiplies this point by the given scalar.
     * @param scalar
     * @return the new point
     */
    public void multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    /**
     * Divides this point by another point.
     * @param point
     * @return the new point
     */
    public Point3D divide(Point3D point) {
        return new Point3D(this.x / point.x, this.y / point.y, this.z / point.z);
    }

    /**
     * Divides this point by the given scalar.
     * @param scalar
     * @return the new point
     */
    public void divide(double scalar) {
        this.x /= scalar;
        this.y /= scalar;
        this.z /= scalar;
    }

    /**
     * Returns the dot product of this point and the given point.
     * @param point
     * @return the dot product
     */
    public double dot(Point3D point) {
        return this.x * point.x + this.y * point.y + this.z * point.z;
    }

    /**
     * Returns the dot product of this point and the given vector.
     * @param vector
     * @return the dot product
     */
    public double dot(Vector3D vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    /**
     * Returns the cross product of this point and a normal vector.
     * @param normal
     * @return the dot product
     */
    public double dot(Normal normal) {
        return this.x * normal.x + this.y * normal.y + this.z * normal.z;
    }
}
