import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JComboBox;

public class test {

    public static void createAndShowGUI() {
        JFrame jFrame = new JFrame("Hello World Swing Example"); // place the image inside of here
        jFrame.setLayout(null);
        jFrame.setSize(1000, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World Swing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        //label.setPreferredSize(new Dimension(450, 300));
        label.setBounds(300,15,400,340);

        label.setText("Hello World Swing");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JLabel p1Counter = new JLabel("P1 Counter");
        p1Counter.setBorder(border);
        p1Counter.setBounds(375,375,100,50);

        p1Counter.setText(" 0:00");
        p1Counter.setHorizontalAlignment(JLabel.CENTER);
        p1Counter.setVerticalAlignment(JLabel.CENTER);

        JLabel p2Counter = new JLabel("P2 Counter");
        p2Counter.setBorder(border);
        p2Counter.setBounds(500, 375, 100, 50);

        p2Counter.setText(" 0:00");
        p2Counter.setHorizontalAlignment(JLabel.CENTER);
        p2Counter.setVerticalAlignment(JLabel.CENTER);

        String chessPieces [] = {"King", "Queen", "Bishop", "Knight", "Rook", "Pawn"};
        Object pieceMoves [] = {};
        JComboBox P1PieceDropdown = new JComboBox(chessPieces);
        JComboBox P1MoveToDropdown = new JComboBox(pieceMoves);
        P1PieceDropdown.setBounds(75,75,100,30);
        P1MoveToDropdown.setBounds(75,150,100,30);
        jFrame.add(P1PieceDropdown);
        jFrame.add(P1MoveToDropdown);
        
        JLabel P1Label = new JLabel("P1");
        P1Label.setText("P1");
        P1Label.setBounds(75,0,100,25);
        P1Label.setFont(new Font("Serif", Font.PLAIN, 24));
        
        JLabel piece1 = new JLabel("Piece");
        piece1.setText("Piece");
        piece1.setBounds(75,25,100,50);
        piece1.setFont(new Font("Serif", Font.PLAIN, 24));

        JLabel moveTo1 = new JLabel("Move to");
        moveTo1.setText("Move to");
        moveTo1.setBounds(75,100,100,50);
        moveTo1.setFont(new Font("Serif", Font.PLAIN, 24));

	    JLabel P2Label = new JLabel("P2");
        P2Label.setText("P2");
        P2Label.setBounds(800,0,100,25);
        P2Label.setFont(new Font("Serif", Font.PLAIN, 24));

        JLabel piece2 = new JLabel("Piece");
        piece2.setText("Piece");
        piece2.setBounds(800,25,100,50);
        piece2.setFont(new Font("Serif", Font.PLAIN, 24));

        JLabel moveTo2 = new JLabel("Move to");
        moveTo2.setText("Move to");
        moveTo2.setBounds(800,100,100,50);
        moveTo2.setFont(new Font("Serif", Font.PLAIN, 24));

        JButton p1Check = new JButton("Check");
        JButton p2Check = new JButton("Check");
        p1Check.setBounds(75,350,100,50);
        p2Check.setBounds(800,350,100,50);

        JButton Edit = new JButton("Edit");
        JButton Start = new JButton("Start");
        Edit.setBounds(395,500, 80, 50);
        Start.setBounds(495,500, 80, 50);
        //x, y, h, w 
        JButton p1CM = new JButton("CM");
        JButton p2CM = new JButton("CM");
        p1CM.setBounds(75, 415, 100, 50);
        p2CM.setBounds(800, 415, 100, 50);

        jFrame.add(p1Counter);
        jFrame.add(p2Counter);
        jFrame.add(moveTo1);
        jFrame.add(moveTo2);
        jFrame.add(piece1);
        jFrame.add(piece2);
        jFrame.add(P1Label);
        jFrame.add(P2Label);
        jFrame.add(Edit);
        jFrame.add(Start);
        jFrame.add(p1CM);
        jFrame.add(p2CM);
        jFrame.add(p1Check);
        jFrame.add(p2Check);
        jFrame.add(label);

        
        JComboBox P2PeiceDropDown = new JComboBox(chessPieces);
        JComboBox P2MoveToDropDown = new JComboBox(pieceMoves);
        P2PeiceDropDown.setBounds(800, 75, 100, 30);
        P2MoveToDropDown.setBounds(800, 150, 100, 30);
        jFrame.add(P2PeiceDropDown);
        jFrame.add(P2MoveToDropDown);

        jFrame.setVisible(true);
    }
}