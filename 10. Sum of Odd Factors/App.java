import java.util.*;

class Sum {
  int n;

  Sum(int n) {
    this.n = n;
  }

  public void calculate() {
    int sum = 0;
    System.out.println("The odd factors are: ");
    for(int i = 1; i<=n/2; i++)
    {
      if(n%i==0 && i%2==1)
      {
        sum = sum + i;
        System.out.println(i);
      }
    }
    System.out.println("The sum of the odd factors: "+sum);
  }
}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    Sum sum = new Sum(n);
    sum.calculate();
    sc.close();
  }
}