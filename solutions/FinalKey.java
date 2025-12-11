import java.io.*;

public class FinalKey {
    public static void generateFinalKey() throws IOException {
        int clue1 = Problem1.solveProblem1();
        int clue2 = Problem2.solveProblem2();
        int clue3 = Problem3.solveProblem3();
        
        System.out.println("Clue 1: " + clue1);
        System.out.println("Clue 2: " + clue2);
        System.out.println("Clue 3: " + clue3);
        
        // Convert clue1 to hex
        String hexClue1 = Integer.toHexString(clue1);
        
        // Repeat clue2 string clue3 times
        StringBuilder repeatedClue2 = new StringBuilder();
        for (int i = 0; i < clue3; i++) {
            repeatedClue2.append(clue2);
        }
        
        // Create final key
        String finalKey = hexClue1 + "-" + repeatedClue2.toString();
        
        // Write to file
        FileWriter writer = new FileWriter("final_key.txt");
        writer.write(finalKey);
        writer.close();
        
        System.out.println("Final Key: " + finalKey);
    }
    
    public static void main(String[] args) throws IOException {
        generateFinalKey();
    }
}