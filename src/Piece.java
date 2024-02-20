public class Piece {
    private static final String[] CHESS_SYMBOLS_WHITE = {"♟", "♜", "♞", "♝", "♛", "♚"};
    private static final String[] CHESS_SYMBOLS_BLACK = {"♙", "♖", "♘", "♗", "♕", "♔"};
    private int color;
    private int type;

    public Piece(int color, int type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString () {
        if (color == 0) {
            return CHESS_SYMBOLS_WHITE[type];
        } else {
            return CHESS_SYMBOLS_BLACK[type];
        }
    }

    public int getColor() {
        return color;
    }

    public int getType() {
        return type;
    }





}
