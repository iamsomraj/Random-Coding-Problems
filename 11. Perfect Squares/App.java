import java.util.*;

import jdk.nashorn.internal.parser.Scanner;

class Square {
  double start;
  double end;

  Square(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public void calculate() {
    int count = 0;
    for (double i = start; i <= end; i++) {
      double res =  Math.sqrt(i);
      if( res * res == i) {
        count++;
        System.out.println("Perfect Square : "+Math.round(i));
      }
      else {
        continue;
      }
    }
    System.out.println("The number of perfect squares: "+count);
  }

}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower limit: ");
    int low = sc.nextInt();
    System.out.println("Enter the higher limit: ");
    int high = sc.nextInt();
    Square square = new Square(low, high);
    square.calculate();
    sc.close();
  }
}