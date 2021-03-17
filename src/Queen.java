public class Queen extends Piece{
    public Queen(Color color, char x, int y) {
        super(color, x, y, color==Color.WHITE?(char)9813:(char)9819);
    }
}
