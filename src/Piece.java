public abstract class Piece {
    protected char symbol;
    protected Color color;
    protected int x;
    protected int y;

    public Piece(Color color, char x, int y, char symbol) {
        this.symbol = symbol;
        this.color = color;
        setX(x);
        this.y = y;
    }

    public void setX(char x) {
        this.x = switch (x) {
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            case 'D' -> 4;
            case 'E' -> 5;
            case 'F' -> 6;
            case 'G' -> 7;
            case 'H' -> 8;
            default -> -1;
        };
    }

    public char getXChar() {
        return switch (x) {
            case 1 -> 'A';
            case 2 -> 'B';
            case 3 -> 'C';
            case 4 -> 'D';
            case 5 -> 'E';
            case 6 -> 'F';
            case 7 -> 'G';
            case 8 -> 'H';
            default -> '!';
        };
    }

    @Override
    public String toString() {
        return String.format("%s %s%d", symbol,getXChar(),y );
    }
}
