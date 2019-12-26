import java.util.*;

class Bin {

  public int calculate(int decimal) {
    if (decimal <= 1) {

      return decimal;
    } else {
      return (decimal % 2) + 10 * calculate(decimal / 2);
    }

  }
}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number : ");
    int dec = sc.nextInt();
    Bin bin = new Bin();
    int res = bin.calculate(dec);
    String resString = String.valueOf(res);
    String rev = "";
    for(int i = resString.length() - 1; i > -1 ; i--){
        rev += resString.charAt(i);
    }
    System.out.println("The binary number is :");
    System.out.println(res);
    System.out.println("The reverse binary number is :");
    System.out.println(rev);
    sc.close();
  }
}