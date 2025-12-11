import java.io.*;

public class Problem2 {
    public static int solveProblem2() throws IOException {
        // Read input
        BufferedReader reader = new BufferedReader(new FileReader("../inputs/input2.txt"));
        String text = reader.readLine().trim();
        reader.close();
        
        // Step 1: Reverse
        text = new StringBuilder(text).reverse().toString();
        
        // Step 2: Remove every 3rd position (1-indexed)
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if ((i + 1) % 3 != 0) {
                filtered.append(text.charAt(i));
            }
        }
        text = filtered.toString();
        
        // Step 3: Shift ASCII +2
        StringBuilder shifted = new StringBuilder();
        for (char c : text.toCharArray()) {
            shifted.append((char) (c + 2));
        }
        text = shifted.toString();
        
        // Step 4: Count vowels
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) throws IOException {
        int result = solveProblem2();
        System.out.println("Clue 2: " + result);
    }
}