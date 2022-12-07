package util;

/**
 * A class representing a Ray.
 *
 * @author Laiba and Steeve
 */

public class Ray {

    /**
     * The origin of the ray.
     */
    public Point3D origin;

    /**
     * The direction of the ray.
     */
    public Vector3D direction;

    /**
     * Creates a new ray with default values.
     */
    public Ray() {
        origin = new Point3D();
        direction = new Vector3D();
    }

    /**
     * Creates a new ray with the given origin and direction.
     *
     * @param origin The origin of the ray.
     * @param direction The direction of the ray.
     */
    public Ray(Point3D origin, Vector3D direction) {
        this.origin = origin;
        this.direction = direction;
    }
}
