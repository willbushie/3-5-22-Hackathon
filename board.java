import java.lang.reflect.Array;
import java.util.ArrayList;

public class board 
{
    public ArrayList<Pieces> pieces;
    public board()
    {
        // setup the starting position of the board
        this.pieces = new ArrayList<>(16);

        // creation of all the pieces
        Pieces PawnW1 = new Pieces("white","pawn1","A2");
        Pieces PawnW2 = new Pieces("white","pawn2","B2");
        Pieces PawnW3 = new Pieces("white","pawn3","C2");
        Pieces PawnW4 = new Pieces("white","pawn4","D2");
        Pieces PawnW5 = new Pieces("white","pawn5","E2");
        Pieces PawnW6 = new Pieces("white","pawn6","F2");
        Pieces PawnW7 = new Pieces("white","pawn7","G2");
        Pieces PawnW8 = new Pieces("white","pawn8","H2");
        Pieces RookW1 = new Pieces("white","rook1","A8");
        Pieces RookW2 = new Pieces("white","rook2","A1");
        Pieces KnightW1 = new Pieces("white","knight1","B1");
        Pieces KnightW2 = new Pieces("white","knight2","G1");
        Pieces BishopW1 = new Pieces("white","bishop1","C1");
        Pieces BishopW2 = new Pieces("white","bishop1","F1");
        Pieces QueenW = new Pieces("white","queen","D1");
        Pieces KingW = new Pieces("white","king","E1");

        Pieces PawnB1 = new Pieces("black","pawn1","A7");
        Pieces PawnB2 = new Pieces("black","pawn2","B7");
        Pieces PawnB3 = new Pieces("black","pawn3","C7");
        Pieces PawnB4 = new Pieces("black","pawn4","D7");
        Pieces PawnB5 = new Pieces("black","pawn5","E7");
        Pieces PawnB6 = new Pieces("black","pawn6","F7");
        Pieces PawnB7 = new Pieces("black","pawn7","G7");
        Pieces PawnB8 = new Pieces("black","pawn8","H7");
        Pieces RookB1 = new Pieces("black","rook1","A8");
        Pieces RookB2 = new Pieces("black","rook2","A8");
        Pieces KnightB1 = new Pieces("black","knight1","B8");
        Pieces KnightB2 = new Pieces("black","knight2","G8");
        Pieces BishopB1 = new Pieces("black","bishop1","C8");
        Pieces BishopB2 = new Pieces("black","bishop1","F8");
        Pieces QueenB = new Pieces("black","queen","D8");
        Pieces KingB = new Pieces("black","king","E8");

        // add the pieces to the boards list
        this.pieces.add(PawnW1);
        this.pieces.add(PawnW2);
        this.pieces.add(PawnW3);
        this.pieces.add(PawnW4);
        this.pieces.add(PawnW5);
        this.pieces.add(PawnW6);
        this.pieces.add(PawnW7);
        this.pieces.add(PawnW8);
        this.pieces.add(PawnW8);
        this.pieces.add(RookW1);
        this.pieces.add(RookW2);
        this.pieces.add(KnightW1);
        this.pieces.add(KnightW2);
        this.pieces.add(BishopW1);
        this.pieces.add(BishopW2);
        this.pieces.add(QueenW);
        this.pieces.add(KingW);
        this.pieces.add(PawnB1);
        this.pieces.add(PawnB2);
        this.pieces.add(PawnB3);
        this.pieces.add(PawnB4);
        this.pieces.add(PawnB5);
        this.pieces.add(PawnB6);
        this.pieces.add(PawnB7);
        this.pieces.add(PawnB8);
        this.pieces.add(RookB1);
        this.pieces.add(RookB2);
        this.pieces.add(KnightB1);
        this.pieces.add(KnightB2);
        this.pieces.add(BishopB1);
        this.pieces.add(BishopB2);
        this.pieces.add(QueenB);
        this.pieces.add(KingB);
    }    

}
