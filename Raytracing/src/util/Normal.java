package util;

public class Normal {
    public double x;
    public double y;
    public double z;

    public Normal(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Normal(Normal normal) {
        this.x = normal.x;
        this.y = normal.y;
        this.z = normal.z;
    }

    public Normal() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

//    public void set(double x, double y, double z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    public void set(Normal normal) {
//        this.x = normal.x;
//        this.y = normal.y;
//        this.z = normal.z;
//    }
//
//    public Normal add(Normal normal) {
//        return new Normal(this.x + normal.x, this.y + normal.y, this.z + normal.z);
//    }
//
//    public Normal subtract(Normal normal) {
//        return new Normal(this.x - normal.x, this.y - normal.y, this.z - normal.z);
//    }
//
//    public Normal multiply(Normal normal) {
//        return new Normal(this.x * normal.x, this.y * normal.y, this.z * normal.z);
//    }
//
//    public Normal multiply(double scalar) {
//        return new Normal(this.x * scalar, this.y * scalar, this.z * scalar);
//    }
//
//    public Normal divide(Normal normal) {
//        return new Normal(this.x / normal.x, this.y / normal.y, this.z / normal.z);
//    }
//
//    public Normal divide(double scalar) {
//        return new Normal(this.x / scalar, this.y / scalar, this.z / scalar);
//    }

    public double dot(Normal normal) {
        return this.x * normal.x + this.y * normal.y + this.z * normal.z;
    }

    public void normalize() {
        double length = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        this.x /= length;
        this.y /= length;
        this.z /= length;
    }

//    public Normal normalized() {
//        double length = this.length();
//        return new Normal(this.x / length, this.y / length, this.z / length);
//    }
//
//    public Normal negate() {
//        return new Normal(-this.x, -this.y, -this.z);
//    }
}
