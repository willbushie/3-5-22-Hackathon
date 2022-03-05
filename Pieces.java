import java.util.Scanner;
import java.io.*;
public class Pieces
{
    public String PieceName;
    public String PiecePosition;
    public String PieceColor;

    public Pieces(String PieceColor, String PieceName, String PiecePosition)
    {
        this.PieceColor = PieceColor;
        this.PieceName = PieceName;
        this.PiecePosition = PiecePosition;
    }
    public String getPieceName()
    {
        return this.PieceName;
    } 
    public String getPiecePosition()
    {
        return this.PiecePosition;
    } 
    public String getPieceColor()
    {
        return this.PieceColor;
    }


    /*FileInputStream json = new FileInputStream("boardstates.json");
    Scanner input = new Scanner(json);*/
    

}
