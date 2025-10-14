import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int verses = 0;

    // Input
    System.out.print("Enter the number of verses to print (1 to 100): ");
    if (scanner.hasNextInt()) {
      verses = scanner.nextInt();
      if (verses < 1 || verses > 100) {
        System.out.println("Error: Number must be between 1 and 100.");
        return;

      }
    } else {
        System.out.println("Error: Invalid input. Please enter an integer.");
        return;
    }

    // Start from 100 and print the verses
    for (int i = 100; i > 100 - verses; i--) {
      System.out.println();
      System.out.println(i + " bottles of beer on the wall");
      System.out.println(i + " bottles of beer");
      System.out.println("if one of those bottles should happen to fall");
      System.out.println((i - 1) + " bottles of beer on the wall");
    }

    scanner.close();
  }
}
