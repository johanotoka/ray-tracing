package util;

public class Color {
    public double r;
    public double g;
    public double b;

    public Color(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color(Color color) {
        this.r = color.r;
        this.g = color.g;
        this.b = color.b;
    }

    public Color() {
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public void set(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void set(Color color) {
        this.r = color.r;
        this.g = color.g;
        this.b = color.b;
    }

    public Color add(Color color) {
        return new Color(this.r + color.r, this.g + color.g, this.b + color.b);
    }

    public Color subtract(Color color) {
        return new Color(this.r - color.r, this.g - color.g, this.b - color.b);
    }

    public Color multiply(Color color) {
        return new Color(this.r * color.r, this.g * color.g, this.b * color.b);
    }

    public Color multiply(double scalar) {
        return new Color(this.r * scalar, this.g * scalar, this.b * scalar);
    }

    public Color divide(Color color) {
        return new Color(this.r / color.r, this.g / color.g, this.b / color.b);
    }

    public Color divide(double scalar) {
        return new Color(this.r / scalar, this.g / scalar, this.b / scalar);
    }

    public int toRGB() {
        int r = (int) (this.r * 255);
        int g = (int) (this.g * 255);
        int b = (int) (this.b * 255);
        return (r << 16) | (g << 8) | b;
    }

    // TODO: Clamp values to 0-1

}
