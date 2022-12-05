import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Raytracer extends Canvas implements Runnable {

    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static final int SCALE = 4;
    static String title = "RayString";

    public Raytracer() {

    }

    public void run() {

    }

    public void start() {

    }

    public void render() {

    }
    public void update() {

    }

    public static void main(String[] args) {

        long start = System.nanoTime();

        File image = new File("image.png");
        BufferedImage buffer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                buffer.setRGB(x, y, 0x000000);
            }
        }

        try {
            ImageIO.write(buffer, "png", image);
        } catch (IOException e) {
            System.out.println("Error: " + e);
            throw new RuntimeException(e);
        }

        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) / 1000000 + "ms");


//        System.out.println("Test1");
//
//        JFrame canvas =  new JFrame();
//        Raytracer raytracer = new Raytracer();
//        Dimension dimensions = new Dimension(HEIGHT, WIDTH);
//        raytracer.setMinimumSize(dimensions);
//        raytracer.setMaximumSize(dimensions);
//        raytracer.setPreferredSize(dimensions);
//        canvas.add(raytracer);
//        canvas.pack();
//        canvas.setLocationRelativeTo(null);
//        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        canvas.setVisible(true);
//
//        raytracer.start();

    }

}