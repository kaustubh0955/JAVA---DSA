import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class consecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequencies of characters
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }

        int sum = 0;

        // Check for characters with even frequency that are consecutive
        char prevChar = '\0';
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != prevChar && frequencyMap.get(currentChar) % 2 == 0) {
                sum += frequencyMap.get(currentChar);
            }
            prevChar = currentChar;
        }

        System.out.println("Sum of even frequency counts of consecutive characters: " + sum);

        scanner.close();
    }
}
