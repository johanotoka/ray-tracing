package scene;

import util.*;
import geometry.*;

import java.util.ArrayList;

public class World {
    public ViewPlane viewPlane;
    public ArrayList<Shape> shapes;
    public Color backgroundColor;

    public World(int width, int height, double pixelSize, ArrayList<Shape> shapes, Color backgroundColor) {
        this.viewPlane = new ViewPlane(width, height, pixelSize);

        this.shapes = new ArrayList<Shape>();
        for (Shape shape : shapes) {
            this.shapes.add(shape);
        }
        this.backgroundColor = new Color(backgroundColor);
    }
}
