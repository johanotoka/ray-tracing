package util;

public class Vector3D {
    public double x;
    public double y;
    public double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Vector3D vector) {
        this.x = vector.x;
        this.y = vector.y;
        this.z = vector.z;
    }

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void set(Vector3D vector) {
        this.x = vector.x;
        this.y = vector.y;
        this.z = vector.z;
    }

    public Vector3D add(Vector3D vector) {
        return new Vector3D(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    public Vector3D subtract(Vector3D vector) {
        return new Vector3D(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

    public Vector3D multiply(Vector3D vector) {
        return new Vector3D(this.x * vector.x, this.y * vector.y, this.z * vector.z);
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public Vector3D divide(Vector3D vector) {
        return new Vector3D(this.x / vector.x, this.y / vector.y, this.z / vector.z);
    }

    public Vector3D divide(double scalar) {
        return new Vector3D(this.x / scalar, this.y / scalar, this.z / scalar);
    }

    public double dot(Vector3D vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    public double dot(Point3D point) {
        return this.x * point.x + this.y * point.y + this.z * point.z;
    }

    public Vector3D cross(Vector3D vector) {
        return new Vector3D(this.y * vector.z - this.z * vector.y,
                            this.z * vector.x - this.x * vector.z,
                            this.x * vector.y - this.y * vector.x);
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}
