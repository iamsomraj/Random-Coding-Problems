import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of M: ");
        int m = sc.nextInt();
        
        float res = Math.round((float)n/m);
        int num = res * m;
        System.out.println("The closest number is "+num);
        
        
    }
}