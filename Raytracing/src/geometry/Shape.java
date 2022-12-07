package geometry;

import util.*;

/**
 * This class represents a shape in the scene.
 *
 * @author Laiba and Steeve
 */

public abstract class Shape {

    /**
     * The color of the shape.
     */
    public Color color;

    /**
     * This method returns the distance between the ray and the shape.
     *
     * @param ray
     * @return
     */
    public abstract double hit(Ray ray);
}
