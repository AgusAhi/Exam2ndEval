import java.io.*;
import java.util.*;


public class Board {
    private Map<Position, Piece> map;

    public Board() throws IOException {
        map = new TreeMap<>();
        readMapFromFile();
    }


    private void readMapFromFile() throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader("initialpos.csv"));
            String line = input.readLine();
            while ((line = input.readLine()) != null) {
                String[] items = line.split(",");
                int row = Integer.parseInt(items[0]);
                int col = Integer.parseInt(items[1]);
                int type = Integer.parseInt(items[2]);
                int color = Integer.parseInt(items[3]); // ERA PARA CONVERTIRLO EN STRING
                Piece piece = new Piece(color, type);
                Position position = new Position(row, col);
                map.put(position, piece);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (int row = 7; row >= 0; row--) {
            s += (1 + row) + " ";
            for (int col = 0; col <= 7; col++) {
                Position position = new Position(row, col);
                Piece piece = map.get(position);
                if (piece == null) {
                    s += "· ";
                } else {
                    s += piece + " ";
                }
            }
            s += "\n";
        }
        s += "  ";
        for (char ch = 'A'; ch <= 'H'; ch++) {
            s += ch + " ";
        }
        return s;
    }

    public Map<Position, Piece> getMap() {
        return map;
    }


}
