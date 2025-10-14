import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String input = scanner.nextLine();

    // Vowel counters
    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;

    // Non-vowel counter
    int nonVowelCount = 0;

    int index = 0;
    while (index < input.length()) {
      char ch = input.charAt(index);

      if (ch == 'a') {
          countA = countA + 1;
      } else if (ch == 'e') {
          countE = countE + 1;
      } else if (ch == 'i') {
          countI = countI + 1;
      } else if (ch == 'o') {
          countO = countO + 1;
      } else if (ch == 'u') {
          countU = countU + 1;
      } else {
          nonVowelCount = nonVowelCount + 1;
      }

      index = index + 1;
    }

    // Display results
    System.out.println("Vowel counts:");
    System.out.println("a: " + countA);
    System.out.println("e: " + countE);
    System.out.println("i: " + countI);
    System.out.println("o: " + countU);
    System.out.println("u: " + countU);
    System.out.println("Non-vowel characters:" + nonVowelCount);

    scanner.close();
  }
}
