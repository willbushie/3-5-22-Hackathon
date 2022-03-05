// image class
package photos;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import java.awt.Graphics;


public class image
{
    // initialize image (randomly chose images and record them)
    public image(ArrayList chessPieces)
    {
        // read in the board state array

    }

    // print the image attribute values
    public void printAttributes()
    {
        System.out.println("Passed ID: "+id);
        System.out.println("Complete ID: "+completeID);
        System.out.println("Background #: "+background);
        System.out.println("Background Title: "+backgroundTitle);
        System.out.println("Clocktower #: "+clocktower);
        System.out.println("Clocktower Title: "+clocktowerTitle);
        System.out.println("Face #: "+face);
        System.out.println("Face Title: "+faceTitle);
    }

    // check if this sequence has been created before (prevent repeats)
    public boolean unique(int background, int clocktower, int face)
    {
        return true;
    }

    // create combined image and store it
    public void create() throws IOException
    {
        // create buffered image objects
        String backgroundFile = (Integer.toString(background) + ".png");
        BufferedImage backgroundImage = ImageIO.read(new File("images/background/"+backgroundFile));
        String clocktowerFile = (Integer.toString(clocktower) + ".png");
        BufferedImage clocktowerImage = ImageIO.read(new File("images/clocktower/"+clocktowerFile));
        String faceFile = (Integer.toString(face) + ".png");
        BufferedImage faceImage = ImageIO.read(new File("images/face/"+faceFile));
        // create the new image
        BufferedImage finalImage = new BufferedImage(2500,2500,BufferedImage.TYPE_4BYTE_ABGR);
        // combine the images into the finalImage
        Graphics a = finalImage.createGraphics();
        a = finalImage.createGraphics();
        a.drawImage(backgroundImage, 0, 0, null);
        a.drawImage(clocktowerImage, 0, 0, null);
        a.drawImage(faceImage, 0, 0, null);
        // write finalImage to file (final folder)
        ImageIO.write(finalImage,"png",new File("/2022-3-5-Hackathon/photos/"+completeID+".png"));
        System.out.println("Image "+completeID+" created successfully.");
    }
}
