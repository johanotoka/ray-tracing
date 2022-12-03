import java.*;

import javax.swing.JFrame;
import java.awt.*;

public class Raytracer extends Canvas implements Runnable
{

    public static final int HEIGHT = 250;
    public static final int WIDTH = 250;
    public static final int SCALE = 4;
    static String title = "RayString";

    public Raytracer()
    {

    }

    public void run() 
    {

    }
    
    public void start() 
    {

    }

    public void render()
    {

    }
    public void update()
    {
         
    }

//main method
public static void main(String[] args){
    System.out.println("Test1");

    JFrame canvas =  new JFrame();
    Raytracer raytracer = new Raytracer();
    Dimension dimensions = new Dimension(HEIGHT, WIDTH);
    raytracer.setMinimumSize(dimensions);
    raytracer.setMaximumSize(dimensions); 
    raytracer.setPreferredSize(dimensions);
    canvas.add(raytracer);
    canvas.pack();
    canvas.setLocationRelativeTo(null);
    canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    canvas.setVisible(true);

    raytracer.start();
    
    


    }



}