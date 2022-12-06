package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import geometry.Shape;
import projection.*;
import scene.*;
import util.*;
import util.Image;
import util.Color;

import geometry.*;

public class Raytracer extends Canvas {

    public static final int NUM_OF_SAMPLE = 4;

    public static int near;
    public static int left;
    public static int right;
    public static int bottom;
    public static int top;
    public static int width_res;
    public static int height_res;

    public static World world;
    public static Image image;
    public static Projection projection;

    public static void reader() {

    }

    private static void tracer(int x, int y) {

        Ray ray = projection.generateRay(new Point2D(x, y));
        Color color = world.backgroundColor;

        for (int i = 0; i < world.shapes.size(); i++) {
            if (world.shapes.get(i).hit(ray) != 0.0 && world.shapes.get(i).hit(ray) < Double.MAX_VALUE) {
                color = world.shapes.get(i).color;
            }
        }

        image.buffer.setRGB(x, y, color.toRGB());

//        Ray ray = new Ray(new Point3D(x - world.viewPlane.width / 2 + 0.5, y - world.viewPlane.height / 2 + 0.5, 100), new Vector3D(0.0, 0.0, -1.0));
//
//        if (sphere.hit(ray) != 0) {
//            image.buffer.setRGB(x, y, sphere.color.toRGB());
//        } else {
//            image.buffer.setRGB(x, y, new Color(1.0, 1.0, 1.0).toRGB());
//        }
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Raytracer <scene file>");
            System.exit(1);
        }

        try {
            Scanner reader = new Scanner(new FileInputStream(args[0]));

            ArrayList<Shape> shapes = new ArrayList<Shape>();

            while (reader.hasNext()) {
                String line = reader.nextLine();

                System.out.println(line);

                String[] tokens = line.split(" ");
                if (tokens[0].equals("NEAR")) {
                    near = Integer.parseInt(tokens[1]);
                } else if (tokens[0].equals("LEFT")) {
                    left = Integer.parseInt(tokens[1]);
                } else if (tokens[0].equals("RIGHT")) {
                    right = Integer.parseInt(tokens[1]);
                } else if (tokens[0].equals("BOTTOM")) {
                    bottom = Integer.parseInt(tokens[1]);
                } else if (tokens[0].equals("TOP")) {
                    top = Integer.parseInt(tokens[1]);
                } else if (tokens[0].equals("RES")) {
                    width_res = Integer.parseInt(tokens[1]);
                    height_res = Integer.parseInt(tokens[2]);
                } else if (tokens[0].equals("SPHERE")) {
                    shapes.add(new Sphere(new Point3D(Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]), Double.parseDouble(tokens[4])), 60, new Color(Double.parseDouble(tokens[8]), Double.parseDouble(tokens[9]), Double.parseDouble(tokens[10]))));
                } else if (tokens[0].equals("BACK")) {
                    Color bg = new Color(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
                    world = new World(width_res, height_res, 1, shapes, bg);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        long start = System.nanoTime();
        image = new Image("image.png");
        projection = new Orthographic();

//        BufferedImage buffer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        Sphere sphere = new Sphere(new Point3D(0, 0, 0), 60, new Color(1.0, 0, 0));

        for (int x = 0; x < world.viewPlane.width; x++) {
            for (int y = 0; y < world.viewPlane.height; y++) {
                tracer(x, y);
            }
        }

        image.write("png");

        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) / 1000000 + "ms");

    }

}