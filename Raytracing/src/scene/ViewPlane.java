package scene;

/**
 * A class to represent a ViewPlane.
 *
 * @author Laiba and Steeve
 */

public class ViewPlane {

    /**
     * The width of the view plane
     */
    public int width;

    /**
     * The height of the view plane
     */
    public int height;

    /**
     * The pixel size of the view plane
     */
    public double pixelSize;

    /**
     * Constructor
     *
     * @param width
     *            The width of the view plane
     * @param height
     *            The height of the view plane
     * @param pixelSize
     *            The pixel size of the view plane
     */
    public ViewPlane(int width, int height, double pixelSize) {
        this.width = width;
        this.height = height;
        this.pixelSize = pixelSize;
    }

}
