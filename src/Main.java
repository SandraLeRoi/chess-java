public class Main {
    public static void main(String[] args) {
        Pawn blackPawn = new Pawn (Color.BLACK, 'A', 1);
        System.out.println(blackPawn);

        Board board = new Board();
        System.out.println(board);
    }
}
