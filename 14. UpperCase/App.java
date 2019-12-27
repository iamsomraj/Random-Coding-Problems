import java.util.*;

class Upper {
  String str;

  Upper(String str) {
    this.str = str;
  }

  public void calculate() {
    String arr[] = str.split(" ");
    for (String s : arr) {
      if (s.length() > 2) {
        s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length() - 1)
            + s.substring(s.length() - 1).toUpperCase();
      } else {
        s = s.toUpperCase();
      }
      System.out.printf(s + " ");
    }
  }
}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the sentence: ");
    String input = sc.nextLine();
    Upper upper = new Upper(input);
    upper.calculate();
    sc.close();
  }
}