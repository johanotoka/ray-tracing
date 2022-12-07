package util;

/**
 * A class to represent a Color.
 *
 * @author Laiba and Steeve
 */

public class Color {

    /**
     * The red component of the color
     */
    public double r;

    /**
     * The green component of the color
     */
    public double g;

    /**
     * The blue component of the color
     */
    public double b;

    /**
     * Constructor
     *
     * @param r
     *            The red component of the color
     * @param g
     *            The green component of the color
     * @param b
     *            The blue component of the color
     */
    public Color(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * Constructor
     *
     * @param color
     *            The color to copy
     */
    public Color(Color color) {
        this.r = color.r;
        this.g = color.g;
        this.b = color.b;
    }

    /**
     * This method adds the color to the current color.
     *
     * @param color
     * @return The new color
     */
    public Color add(Color color) {
        return new Color(this.r + color.r, this.g + color.g, this.b + color.b);
    }

    /**
     * This method subtracts the color from the current color.
     *
     * @param color
     * @return The new color
     */
    public Color subtract(Color color) {
        return new Color(this.r - color.r, this.g - color.g, this.b - color.b);
    }

    /**
     * This method multiplies the color by the current color.
     *
     * @param color
     * @return The new color
     */
    public Color multiply(Color color) {
        return new Color(this.r * color.r, this.g * color.g, this.b * color.b);
    }

    /**
     * This method multiplies the color by a scalar.
     *
     * @param scalar
     * @return The new color
     */
    public Color multiply(double scalar) {
        return new Color(this.r * scalar, this.g * scalar, this.b * scalar);
    }

    /**
     * This method divides the color by the current color.
     *
     * @param color
     * @return The new color
     */
    public Color divide(Color color) {
        return new Color(this.r / color.r, this.g / color.g, this.b / color.b);
    }

    /**
     * This method divides the color by a scalar.
     *
     * @param scalar
     * @return The new color
     */
    public Color divide(double scalar) {
        return new Color(this.r / scalar, this.g / scalar, this.b / scalar);
    }

    /**
     * This method converts the color to an integer.
     *
     * @return The color as an integer
     */
    public int toRGB() {
        int r = (int) (this.r * 255);
        int g = (int) (this.g * 255);
        int b = (int) (this.b * 255);
        return (r << 16) | (g << 8) | b;
    }

    // TODO: Clamp values to 0-1

}
