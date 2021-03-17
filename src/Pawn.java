public class Pawn extends Piece{

    public Pawn(Color color, char x, int y) {
        super(color, x, y, color==Color.WHITE?(char)9817:(char)9823);
    }
}
