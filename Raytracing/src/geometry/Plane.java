package geometry;

import util.*;

public class Plane extends Shape {

    Point3D point;
    Normal normal;

    public Plane(Point3D point, Normal normal, Color color) {
        this.point = new Point3D(point);
        this.normal = new Normal(normal);
        this.color = new Color(color);
    }

    @Override
    public double hit(Ray ray) {
        double t = (point.subtract(ray.origin)).dot(normal) / ray.direction.dot(normal);

//        if (t > 0) {
//            return t;
//        } else {
//            return -1;
//        }

        if (t > 10E-9) {
            return t;
        } else {
            return 0.0;
        }
    }
}
