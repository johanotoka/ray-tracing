package util;

import java.awt.image.BufferedImage;
import java.io.File;

import main.Raytracer;

public class Image {
    public BufferedImage buffer;
    public File image;

    public Image(String fileName) {
        image = new File(fileName);
        buffer = new BufferedImage(Raytracer.world.viewPlane.width, Raytracer.world.viewPlane.height, BufferedImage.TYPE_INT_RGB);
    }

    public void write(String fileType) {
        try {
            javax.imageio.ImageIO.write(buffer, fileType, image);
        } catch (Exception e) {
            System.out.println("Error writing image");
            System.exit(1);
        }
    }

}
