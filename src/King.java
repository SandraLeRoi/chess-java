public class King extends Piece{
    public King(Color color, char x, int y) {
        super(color, x, y, color==Color.WHITE?(char)9812:(char)9818);
    }
}
