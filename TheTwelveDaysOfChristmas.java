public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {

    int day = 1;

    while (day <= 12) {
      // Print the day line
      System.out.print("On the " + day);

      // Print the correct suffix
      switch (day) {
        case 1:
          System.out.print("st");
          break;
        case 2:
          System.out.print("nd");
          break;
        case 3:
          System.out.print("rd");
          break;
        default:
          System.out.print("th");
      }

      System.out.println(" day of Christmas my true love gave to me");

      // Print the gifts in reverse order
      switch (day) {
        case 12:
          System.out.println("Twelve drummers drumming,");
        case 11:
          System.out.println("Eleven pipers piping,");
        case 10:
          System.out.println("Ten lords a-leaping,");
        case 9:
          System.out.println("Nine ladies dancing,");
        case 8:
          System.out.println("Eight maids a-milking,");
        case 7:
          System.out.println("Seven sweans a-swimming,");
        case 6:
          System.out.println("Six geese a-laying,");
        case 5:
          System.out.println("Five golden rings,");
        case 4:
          System.out.println("Four calling birds,");
        case 3:
          System.out.println("Three French hens,");
        case 2:
          System.out.println("Two turtle doves, and");
        case 1:
          System.out.println("A partridge in a pear tree. \n");
          break;
      }

      day = day + 1;
    }
  }
}
