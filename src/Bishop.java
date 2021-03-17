public class Bishop extends Piece{
    public Bishop(Color color, char x, int y) {
        super(color, x, y, color==Color.WHITE?(char)9815:(char)9821);

    }
}
