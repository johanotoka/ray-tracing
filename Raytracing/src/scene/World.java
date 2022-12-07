package scene;

import util.*;
import geometry.*;

import java.util.ArrayList;

/**
 * World class
 *
 * @author Laiba and Steeve
 *
 */

public class World {

    /**
     * The view plane of the world
     */
    public ViewPlane viewPlane;

    /**
     * The list of shapes in the world
     */
    public ArrayList<Shape> shapes;

    /**
     * The background color of the world
     */
    public Color backgroundColor;

    /**
     * Constructor
     *
     * @param width
     *           The width of the view plane
     * @param height
     *          The height of the view plane
     * @param pixelSize
     *         The pixel size of the view plane
     * @param shapes
     *        The list of shapes in the world
     * @param backgroundColor
     *        The background color of the world
     */
    public World(int width, int height, double pixelSize, ArrayList<Shape> shapes, Color backgroundColor) {
        this.viewPlane = new ViewPlane(width, height, pixelSize);

        this.shapes = new ArrayList<Shape>();
        for (Shape shape : shapes) {
            this.shapes.add(shape);
        }
        this.backgroundColor = new Color(backgroundColor);
    }
}
