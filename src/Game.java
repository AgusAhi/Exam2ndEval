import java.io.*;
import java.util.*;

public class Game {

    private List<Movement> list;

    public Game(String filename) throws IOException {
        list = new ArrayList<Movement>();
        readMovementsFromFile(filename);
    }

    public List<Movement> getList() {
        return list;
    }

    private void readMovementsFromFile(String filename) throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(filename));
            String line = input.readLine();
            while ((line = input.readLine()) != null) {
                String[] items = line.split(",");
                int rowFrom = Integer.parseInt(items[0]);
                int colFrom = Integer.parseInt(items[1]);
                int rowTo = Integer.parseInt(items[2]);
                int colTo = Integer.parseInt(items[3]);
                Movement movement = new Movement(
                        new Position(rowFrom, colFrom),
                        new Position(rowTo, colTo)
                );
                list.add(movement);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
