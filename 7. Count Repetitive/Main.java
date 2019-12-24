import java.util.*;
class Rchar
{
    String input = new String();
    Rchar(String input)
    {
        this.input = input;
    }
    
    public void calculate()
    {
        char st = input.charAt(0);
        int count = 1;
        System.out.printf("%c",input.charAt(0));

        for(int i = 1; i<input.length(); i++)
        {
            
            if(st == input.charAt(i))
            {
                count++;
                
                continue;
            }
            else
            {
                st = input.charAt(i);

                if(count != 1)
                {
                    System.out.printf("%d",count);
                    count = 1;

                }
                System.out.printf("%c",input.charAt(i));
              

            }
        }
        System.out.printf("%d",count);

    }
}


public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        Rchar rc = new Rchar(input);
        System.out.println();
        rc.calculate();
    }
}