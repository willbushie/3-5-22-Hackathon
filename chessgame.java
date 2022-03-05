import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



public class chessgame {
    public class Player {
        private String side;
        private String color;
        private ArrayList<Piece> listOfPieces = new ArrayList<Piece>();

        public Player(String side, String color) {
            this.side = side;
            this.color = color;

            //create pieces and add to list
        }
    }

    

    // show the chess board
    public static void main(String[] args) {
       test.createAndShowGUI();
    }
}

