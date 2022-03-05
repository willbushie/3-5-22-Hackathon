import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class chessgame {
    
    public class Player {
        private String side;
        private String color;
        private ArrayList<Pieces> listOfPieces = new ArrayList<Pieces>();
        Pieces[] listp;

        public Player(String side, String color) throws FileNotFoundException {
            this.side = side;
            this.color = color;




            //create pieces and add to list
            
            /*
            JLabel testLabel = new JLabel();

            File myObj = new File("https://github.com/willbushie/3-5-22-Hackathon/blob/main/boardstates.json");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //string[] wholeLine = line.Split(':');
                testLabel.setText(data);
            */
            
            }
    }
    

    

    // show the chess board
    public static void main(String[] args) {
       test.createAndShowGUI();
    }
}


