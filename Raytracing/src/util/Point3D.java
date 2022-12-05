package util;

public class Point3D {
    public double x;
    public double y;
    public double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point3D point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void set(Point3D point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

//    public void add(double x, double y, double z) {
//        this.x += x;
//        this.y += y;
//        this.z += z;
//    }

    public Point3D add(Point3D point) {
      return new Point3D(this.x + point.x, this.y + point.y, this.z + point.z);
    }

//    public void subtract(double x, double y, double z) {
//        this.x -= x;
//        this.y -= y;
//        this.z -= z;
//    }

    public Point3D subtract(Point3D point) {
        return new Point3D(this.x - point.x, this.y - point.y, this.z - point.z);
    }

//    public void multiply(double x, double y, double z) {
//        this.x *= x;
//        this.y *= y;
//        this.z *= z;
//    }

    public Point3D multiply(Point3D point) {
        return new Point3D(this.x * point.x, this.y * point.y, this.z * point.z);
    }

    public void multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

//    public void divide(double x, double y, double z) {
//        this.x /= x;
//        this.y /= y;
//        this.z /= z;
//    }

    public Point3D divide(Point3D point) {
        return new Point3D(this.x / point.x, this.y / point.y, this.z / point.z);
    }

    public void divide(double scalar) {
        this.x /= scalar;
        this.y /= scalar;
        this.z /= scalar;
    }

    public double dot(Point3D point) {
        return this.x * point.x + this.y * point.y + this.z * point.z;
    }

    public double dot(Vector3D vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    public double dot(Normal normal) {
        return this.x * normal.x + this.y * normal.y + this.z * normal.z;
    }
}
