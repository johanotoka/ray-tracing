package util;

import java.awt.image.BufferedImage;
import java.io.File;

import main.Raytracer;

/**
 * Image class
 *
 * @author Laiba and Steeve
 *
 */

public class Image {

    /**
     * The buffered image
     */
    public BufferedImage buffer;

    /**
     * The image file
     */
    public File image;

    /**
     * Constructor
     *
     * @param fileName
     *           The name of the file
     */
    public Image(String fileName) {
        image = new File(fileName);
        buffer = new BufferedImage(Raytracer.world.viewPlane.width, Raytracer.world.viewPlane.height, BufferedImage.TYPE_INT_RGB);
    }

    /**
     * This method writes the image to a file
     *
     * @param fileType
     *           The type of the file
     */
    public void write(String fileType) {
        try {
            javax.imageio.ImageIO.write(buffer, fileType, image);
        } catch (Exception e) {
            System.out.println("Error writing image");
            System.exit(1);
        }
    }

}
