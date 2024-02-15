import java.util.Objects;

public class Position {
    int row;
    int col;

    private int hashCode;
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
        this.hashCode = Objects.hash(row, col);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object p) {
        return row == ((Position) p).row && col == ((Position) p).col;
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }
}
