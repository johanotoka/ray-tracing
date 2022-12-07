package util;

/**
 * A class representing a 3D vector.
 *
 * @author Laiba and Steeve
 */

public class Vector3D {

    /**
     * The x component of the vector.
     */
    public double x;

    /**
     * The y component of the vector.
     */
    public double y;

    /**
     * The z component of the vector.
     */
    public double z;


    /**
     * Creates a new vector with the given components.
     *
     * @param x The x component of the vector.
     * @param y The y component of the vector.
     * @param z The z component of the vector.
     */
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    /**
     * Creates a new vector with the same components as the given vector.
     *
     * @param vector The vector to copy.
     */
    public Vector3D(Vector3D vector) {
        this.x = vector.x;
        this.y = vector.y;
        this.z = vector.z;
    }

    /**
     * Creates a new vector with all components set to zero.
     */
    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Adds the given vector to this vector.
     * @param vector
     * @return the new vector
     */
    public Vector3D add(Vector3D vector) {
        return new Vector3D(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    /**
     * Subtracts the given vector from this vector.
     * @param vector
     * @return the new vector
     */
    public Vector3D subtract(Vector3D vector) {
        return new Vector3D(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

    /**
     * Multiplies this vector by the given vector.
     * @param vector
     * @return the new vector
     */
    public Vector3D multiply(Vector3D vector) {
        return new Vector3D(this.x * vector.x, this.y * vector.y, this.z * vector.z);
    }

    /**
     * Multiplies this vector by the given scalar.
     * @param scalar
     * @return the new vector
     */
    public Vector3D multiply(double scalar) {
        return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    /**
     * Divides this vector by the given vector.
     * @param vector
     * @return the new vector
     */
    public Vector3D divide(Vector3D vector) {
        return new Vector3D(this.x / vector.x, this.y / vector.y, this.z / vector.z);
    }

    /**
     * Divides this vector by the given scalar.
     * @param scalar
     * @return the new vector
     */
    public Vector3D divide(double scalar) {
        return new Vector3D(this.x / scalar, this.y / scalar, this.z / scalar);
    }

    /**
     * Returns the dot product of this vector and the given vector.
     * @param vector
     * @return the dot product
     */
    public double dot(Vector3D vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    /**
     * Returns the dot product of this vector and the given point.
     *
     * @param point
     * @return the dot product
     */
    public double dot(Point3D point) {
        return this.x * point.x + this.y * point.y + this.z * point.z;
    }

    /**
     * Returns the dot product of this vector and the given normal.
     * @param normal
     * @return the dot product
     */
    public double dot(Normal normal) {
        return this.x * normal.x + this.y * normal.y + this.z * normal.z;
    }

    /**
     * Normalizes this vector.
     */
    public void normalize() {
        double length = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        this.x /= length;
        this.y /= length;
        this.z /= length;
    }

    /**
     * Returns the cross product of this vector and the given vector.
     * @param vector
     * @return the cross product
     */
    public Vector3D cross(Vector3D vector) {
        return new Vector3D(this.y * vector.z - this.z * vector.y,
                            this.z * vector.x - this.x * vector.z,
                            this.x * vector.y - this.y * vector.x);
    }

    /**
     * Returns the length of this vector.
     * @return the length
     */
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}
