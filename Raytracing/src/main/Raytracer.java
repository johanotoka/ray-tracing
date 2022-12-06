package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import scene.*;
import util.*;
import util.Image;
import util.Color;

import geometry.*;

public class Raytracer extends Canvas {

    public static final int HEIGHT = 400;
    public static final int WIDTH = 400;
    public static final int NUM_OF_SAMPLE = 4;

    public static int NEAR;
    public static int LEFT;
    public static int RIGHT;
    public static int BOTTOM;
    public static int TOP;
    public static int RESOLUTION_WIDTH;
    public static int RESOLUTION_HEIGHT;

    public static World world;
    public static Image image;

    public static void reader() {

    }

    private static void tracer(int x, int y) {

        Ray ray = new Ray(new Point3D(1.0 * (x - world.viewPlane.width / 2 + 0.5), 1.0 * (x - world.viewPlane.height / 2 + 0.5), 100), new Vector3D(0, 0, -1.0));
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

            while (reader.hasNext()) {
                System.out.println(reader.next());
            }

//            while (reader.hasNext()) {
//                String line = reader.nextLine();
//                String[] tokens = line.split(" ");
//                if (tokens[0].equals("NEAR")) {
//                    NEAR = Integer.parseInt(tokens[1]);
//                } else if (tokens[0].equals("LEFT")) {
//                    LEFT = Integer.parseInt(tokens[1]);
//                } else if (tokens[0].equals("RIGHT")) {
//                    RIGHT = Integer.parseInt(tokens[1]);
//                } else if (tokens[0].equals("BOTTOM")) {
//                    BOTTOM = Integer.parseInt(tokens[1]);
//                } else if (tokens[0].equals("TOP")) {
//                    TOP = Integer.parseInt(tokens[1]);
//                } else if (tokens[0].equals("RESOLUTION")) {
//                    RESOLUTION_WIDTH = Integer.parseInt(tokens[1]);
//                    RESOLUTION_HEIGHT = Integer.parseInt(tokens[2]);
//                } else if (tokens[0].equals("SPHERE")) {
//                    world.shapes.add(new Sphere(new Point3D(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])), Double.parseDouble(tokens[4]), new Color(Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]), Double.parseDouble(tokens[7]))));
//                } else if (tokens[0].equals("BACKGROUND")) {
//                    world.backgroundColor = new Color(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
//                }
//            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        long start = System.nanoTime();
        world = new World(HEIGHT, WIDTH, 1, new Color(0, 0, 0));
        image = new Image("image.png");

        BufferedImage buffer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

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