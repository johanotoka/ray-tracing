package projection;

import main.Raytracer;
import util.*;

public class Orthographic extends Projection {
    public Orthographic() {
    }

    @Override
    public Ray generateRay(Point2D point) {
        Ray ray = new Ray();
//        ray.origin = new Point3D(Raytracer.world.viewPlane.pixelSize * point.x, Raytracer.world.viewPlane.pixelSize * point.y, 100);
        ray.origin = new Point3D(point.x - Raytracer.world.viewPlane.width / 2 + 0.5, point.y - Raytracer.world.viewPlane.height / 2 + 0.5, 100);
        ray.direction = new Vector3D(0.0, 0.0, -1.0);
        return ray;
    }
}
