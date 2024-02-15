public class Piece {
    private static final String[] CHESS_SYMBOLS = {"♙", "♖", "♘", "♗", "♕", "♔", "♟", "♜", "♞", "♝", "♛", "♚"};
    private int color;
    private int type;

    public Piece(int color, int type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString () {
        return CHESS_SYMBOLS[6 * color + type];
    }

    public int getColor() {
        return color;
    }

    public int getType() {
        return type;
    }





}
