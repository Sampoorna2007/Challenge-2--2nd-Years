import java.io.*;
import java.util.*;

public class Problem3 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static int solveProblem3() throws IOException {
        // Read numbers
        BufferedReader reader = new BufferedReader(new FileReader("../inputs/states.txt"));
        String[] parts = reader.readLine().trim().split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        reader.close();
        
        int doneCount = 0;
        
        for (int num : numbers) {
            int state = 0; // Start at state 0
            
            while (state < 3) {
                if (num % 2 == 0) { // Even: advance by one state
                    state++;
                } else if (isPrime(num)) { // Prime: direct transition to DONE
                    state = 3;
                    break;
                } else { // Odd composite: no advance
                    break;
                }
            }
            
            if (state == 3) { // Reached DONE state
                doneCount++;
            }
        }
        
        return doneCount;
    }
    
    public static void main(String[] args) throws IOException {
        int result = solveProblem3();
        System.out.println("Clue 3: " + result);
    }
}