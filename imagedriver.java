// driver class (interact with program through this file)
import photos.image;
import java.io.IOError;
import java.io.IOException;
import javax.swing.plaf.TreeUI;

// this class is the main program for starting the image creaiton & storing processes

public class imagedriver {

    // create image(s) method
    public static void createImages(int numOfImages) throws IOException
    {
        for (int i = 1; i<=numOfImages; i++)
        {
            image testCreation = new image(i);
            testCreation.create();  
            //System.out.println("image created successfully");
        }
    }

    // check user input to see if program is to end
    public static boolean programEnd(String userInput, int currMenu)
    {
        if (userInput == "y" && currMenu == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // main method
    public static void main(String[] args) throws IOException
    {
        createImages(10);
        System.out.println("Program Ended Successfully");
    }
}
