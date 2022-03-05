// image class
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.util.Dictionary;

import netscape.javascript.JSObject;


public class image
{
    // initialize image (randomly chose images and record them)
    public image()
    {
        // locations of the necessary files
        String blankBoard = "/photos/empty-board.png";
        String whitePawn = "/photos/white-pawn.png";
        String whiteRook = "/photos/white-rook.png";
        String whiteKnight = "/photos/white-knight.png";
        String whiteBishop = "/photos/white-bishop.png";
        String whiteQueen = "/photos/white-queen.png";
        String whiteKing = "/photos/white-king.png";
        String blackPawn = "/photos/black-pawn.png";
        String blackRook = "/photos/black-rook.png";
        String blackKnight = "/photos/black-knight.png";
        String blackBishop = "/photos/black-bishop.png";
        String blackQueen = "/photos/black-queen.png";
        String blackKing = "/photos/black-king.png";
    }

    // obtain the current board state
    public void getBoardState()
    {
        // read the board state from boardstates.json
        FileReader fstream = new FileReader("boardstates.json");
        Scanner inFile = new Scanner(fstream);
        String line;
        
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
        ImageIO.write(finalImage,"png",new File("/2022-3-5-Hackathon/photos/currentState.png"));
        //System.out.println("Board state created successfully.");
    }

    public static void main(String[] args) {
        getBoardState();
    }
}
