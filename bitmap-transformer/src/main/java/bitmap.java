import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class bitmap {


    public static void readImage(){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("test.bmp"));
        } catch (IOException e) {
        }
    }

}
