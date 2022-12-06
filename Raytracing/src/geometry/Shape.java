package geometry;

import util.*;

public abstract class Shape {
    public Color color;
    public abstract double hit(Ray ray);
}
