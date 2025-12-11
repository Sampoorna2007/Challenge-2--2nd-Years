import java.io.*;
import java.util.*;

public class Problem1 {
    public static int solveProblem1() throws IOException {
        // Read grid
        List<String> grid = new ArrayList<>();
        BufferedReader gridReader = new BufferedReader(new FileReader("../inputs/grid.txt"));
        String line;
        while ((line = gridReader.readLine()) != null) {
            grid.add(line.trim());
        }
        gridReader.close();
        
        // Read directions
        BufferedReader dirReader = new BufferedReader(new FileReader("../inputs/directions.txt"));
        String[] directions = dirReader.readLine().trim().split(" ");
        dirReader.close();
        
        // Apply rotations
        for (int i = 0; i < directions.length && i < grid.size(); i++) {
            String row = grid.get(i);
            if (directions[i].equals("R")) {
                // Right rotation
                row = row.charAt(row.length() - 1) + row.substring(0, row.length() - 1);
            } else if (directions[i].equals("L")) {
                // Left rotation
                row = row.substring(1) + row.charAt(0);
            }
            grid.set(i, row);
        }
        
        // Get central row
        int centralIndex = grid.size() / 2;
        String centralRow = grid.get(centralIndex);
        
        // Sum ASCII values
        int sum = 0;
        for (char c : centralRow.toCharArray()) {
            sum += (int) c;
        }
        
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        int result = solveProblem1();
        System.out.println("Clue 1: " + result);
    }
}