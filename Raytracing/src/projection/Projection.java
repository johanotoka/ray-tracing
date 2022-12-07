package projection;

import util.*;

/**
 * This class represents a perspective projection.
 *
 * @author Laiba and Steeve
 */

public abstract class Projection {

    /**
     * This method generates a ray from the camera to the given point.
     *
     * @param point
     *            The point to which the ray is generated.
     * @return The generated ray.
     */
    public abstract Ray generateRay(Point2D point);
}
