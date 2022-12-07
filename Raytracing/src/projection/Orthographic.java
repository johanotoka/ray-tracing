package projection;

import main.Raytracer;
import util.*;

/**
 * This class represents an orthographic projection.
 *
 * @author Laiba and Steeve
 */

public class Orthographic extends Projection {
    
    /**
     * This method generates a ray from the camera to the given point.
     *
     * @param point
     *            The point to which the ray is generated.
     * @return The generated ray.
     */
    @Override
    public Ray generateRay(Point2D point) {
        Ray ray = new Ray();
        ray.origin = new Point3D(0.5 * (point.x - Raytracer.world.viewPlane.width / 2 + 0.5), 0.5 * (point.y - Raytracer.world.viewPlane.height / 2 + 0.5), 100);
        ray.direction = new Vector3D(0.0, 0.0, -1.0);
        return ray;
    }
}
