import java.util.*;

class LCM {
  int a, b;

  LCM(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int GCD (int a, int b) {
    if (b > a) {
      GCD(b, a);
    }

    if (b != 0) {
      GCD(b, a % b);
    } else {
      return a;
    }
    return 1;
  }

  public int calculate() {
    int gcd = GCD(a, b);
    int prod = a * b;
    int lcm = (prod / gcd);
    return lcm;
  }

}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 3 numbers to compute the LCM : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    LCM lcm = new LCM(a, b);
    int res = lcm.calculate();
    LCM lcm2 = new LCM(res, c);
    res = lcm2.calculate();
    System.out.println("The answer is : " + res);
  }
}