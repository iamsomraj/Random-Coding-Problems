import java.util.*;

class CTPal {
    String input;

    CTPal(String str) {
        this.input = str;
    }
    public boolean isPallindrome(String input)
    {
        String rev = "";
        for(int i = input.length()-1; i > -1 ; i--)
        {
            rev = rev + input.charAt(i);
        }

        if(rev.equals(input))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void convert() {
        String str = new String(input);
        String s = "";
        String rev = "";
        while(!isPallindrome(str))
        {
            s = s + str.substring(0,1);
            str = str.substring(1,str.length());
        }
        for(int i = s.length()-1; i > -1 ; i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("The number of characters added : "+rev.length());
        System.out.println("The pallindrome becomes: ");
        System.out.println(input+rev);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = new String();
        System.out.println("Enter the string: ");
        input = sc.nextLine();
        CTPal pal = new CTPal(input);
        pal.convert();

    }

}