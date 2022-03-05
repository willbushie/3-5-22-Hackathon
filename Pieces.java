import java.util.Scanner;
import java.io.*;
public class Pieces
{
    public String PieceName;
    public String PiecePosition;

    public Pieces(String PieceName, String PiecePosition)
    {
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


    /*FileInputStream json = new FileInputStream("boardstates.json");
    Scanner input = new Scanner(json);*/
    

}
