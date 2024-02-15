import java.io.IOException;
import java.util.*;

public class Chess {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Chess <filename>");
            System.exit(1);
        }
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Map<Position, Piece> map = board.getMap();
        Game game = new Game(args[0]);
        List<Movement> list = game.getList();
        System.out.println(board);
        for (Movement movement : list) {
            System.out.println("Press enter to continue");
            scanner.nextLine();
            Position from = movement.getFrom();
            Position to = movement.getTo();
            Piece piece = map.get(from);
            if (piece != null) {
                map.put(to, piece);
                map.remove(from);
            }
            System.out.println(board);
            System.out.println("Press enter to continue");
        }
        printAllPieces(map);

    }

    public static void printAllPieces(Map<Position, Piece> map) {
        boolean first = true;
        for (Piece piece : map.values()) {
            if (first) {
                first = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(piece);
        }
        System.out.println(" >Otra forma");
        for (Position p : map.keySet()) {
            System.out.print(map.get(p) + " ");
        }
        System.out.println(">Otra forma");
        for (Map.Entry<Position, Piece> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println(">Otra forma por iterator");
        Iterator<Position> it = map.keySet().iterator();
        while (it.hasNext()) {
            Position p = it.next();
            System.out.print(map.get(p) + " ");
        }
        System.out.println(">Otra forma");
    }





}
