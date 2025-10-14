import java.util.Random;

public class CountFlips {
  public static void main(String[] args) {
    final int NUM_FLIPS = 100;
    int heads = 0;
    int tails = 0;

    Random rand = new Random();

    for (int i = 0; i < NUM_FLIPS; i++) {
      int flip = rand.nextInt(2); // 0 or 1
      if (flip == 0) {
        heads++;
     } else {
         tails++;
     }
    }

    System.out.println("After " + NUM_FLIPS + " coin flips:");
    System.out.println("Heads: " + heads);
    System.out.println("Tails: " + tails);
  }
}
