import java.util.*;

class Largest
{
    String str = new String();
    String fix;
    int max = -1;

    Largest(String str)
    {
        this.str = str;
    }
    
    public void calculate()
    {
        for(int i = 0; i<Integer.valueOf(str.length()/2); i++)
        {
            String s = "";
            
            for(int j = 0; j<=i; j++)
            {
                s = s + str.charAt(j);
            }
            if(str.startsWith(s) && str.endsWith(s))
            {
                if(s.length() > max)
                {
                    max = s.length();
                    fix = new String(s);
                }
            }
            else
            {
                continue;
            }
        }
    }
    
    public void display()
    {
        System.out.println("\nThe Longest Prefix and Suffix is : \n");
        System.out.println("\n"+fix+"\n");
        System.out.println("\nThe Length is "+max+"\n");
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = new String();
        System.out.println("\nEnter the string :\n\n");
        input = sc.nextLine();
        Largest lar = new Largest(input);
        lar.calculate();
        lar.display();
    }
}

