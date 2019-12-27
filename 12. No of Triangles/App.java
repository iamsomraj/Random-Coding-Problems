import java.util.*;

class Triangle {
  int n;

  Triangle(int number) {
    this.n = number;
  }

  public void calculate() {
    int count = 0;
    for (int i = n - 1; i > 0; i--) {
      int start = 0, end = i - 1;
      while (start < end) {
        if (start + end > i) {
          count = count + (end - start);
          System.out.println("Triangle:\t" + start + "\t" + end + "\t" + i);
          end--;
        } else {
          start++;
        }
      }
    }

    System.out.println("The possible number of traingles: " + count);
  }
}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the maximum: ");
    int n = sc.nextInt();
    Triangle triangle = new Triangle(n);
    triangle.calculate();
    sc.close();
  }
}