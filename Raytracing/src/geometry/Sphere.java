package geometry;

import util.*;

public class Sphere extends Shape {

    public Point3D center;
    public double radius;

    public Sphere(Point3D center, double radius, Color color) {
        this.center = new Point3D(center);
        this.radius = radius;
        this.color = new Color(color);
    }

    @Override
    public double hit(Ray ray) {
        double a = ray.direction.dot(ray.direction);
        double b = 2 * ray.direction.dot(ray.origin.subtract(center));
        double c = ray.origin.subtract(center).dot(ray.origin.subtract(center)) - radius * radius;

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return 0.0;
        } else {
            double t1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double t2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (t1 > 10E-9 && t2 > 10E-9) {
                return Math.min(t1, t2);
            } else if (t1 > 10E-9) {
                return t1;
            } else if (t2 > 10E-9) {
                return t2;
            } else {
                return 0.0;
            }
        }
    }
}
